/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import java.util.Random;

/**
 *
 * @author serq9_000
 */
public class Player {

    List<Warrior> team = new ArrayList<Warrior>();
    Random generator = new Random(System.currentTimeMillis());
    
//    public Player(List<Warrior> team)
//    {
//        this.team=team;
//    }
    
    public Player()
    {}
    
    public void addWarrior(Warrior w)
    {
        team.add(w);
    }
    
    public void removeWarrior(Warrior w)
    {
        team.remove(w);
    }
    public int getCount()
    {
        return this.team.size();
    }
    
    public void Attack(Player p2)
    {
        int przeciwnik = generator.nextInt(p2.getCount()); //losujemy od 0 do p2.getTeamsize().Attack(---)
        int attacker = generator.nextInt(this.getCount());
        
        this.team.get(attacker).Attack(p2.team.get(przeciwnik));
        if(this.team.get(attacker).atakuje == 1)
        {    
            if(p2.team.get(przeciwnik).getPointsHealth() == 0)
            {
                System.out.println("Postac nr " +attacker + " atakuje postac nr " +przeciwnik +" pozbawiajac ja zycia.");
                p2.removeWarrior(p2.team.get(przeciwnik));
            }
        System.out.println("Postac nr " +attacker + " atakuje postac nr " +przeciwnik + " pozostawiajac jej " +p2.team.get(przeciwnik).getPointsHealth() +" punktow zycia");
        }
        else
        System.out.println("Postac nr " +attacker + " idzie w strone postaci nr "+przeciwnik);
// this.getTeam.get(2) i to wrzucamy za (---)
    }
    
    
}
