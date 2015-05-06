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
    
    public void removeWarrior(int i)
    {
        team.remove(i);
    }
    public int getCount()
    {
        return this.team.size();
    }
    
    public void printStats()
    {
        for(int i=0;i<this.getCount();i++)
            {
                System.out.println("Pozycja " +this.team.get(i).name() +" nr " +i +"  " +"X:"+this.team.get(i).getPos().getX()+ "  " +"Y:"+this.team.get(i).getPos().getY());
                System.out.println("Zycie " +this.team.get(i).name()   +" nr " +i +": " +this.team.get(i).getPointsHealth());
            }
    }
    
    
    public void Attack(Player p2)
    {
        if(p2.getCount()==0 || this.getCount()==0)
        {
            return;
        }
        //System.out.println("count2="+p2.getCount());
        //System.out.println("count1="+this.getCount());
        int przeciwnik = generator.nextInt(p2.getCount()); 
        //System.out.println("przeciwnik="+przeciwnik);
        int attacker = generator.nextInt(this.getCount());
        //System.out.println("attacker="+attacker);
        
        this.team.get(attacker).Attack(p2.team.get(przeciwnik));
        if(this.team.get(attacker).atakuje == 1)
        {    
            if(p2.team.get(przeciwnik).getPointsHealth() <= 0)
            {
//                System.out.println("Postac nr " +attacker + " atakuje postac nr " +przeciwnik +" pozbawiajac ja zycia.");
                System.out.println(this.team.get(attacker).name() +" nr " +attacker + " atakuje " +p2.team.get(przeciwnik).name() +" nr " +przeciwnik +" pozbawiajac go zycia.");
                p2.removeWarrior(przeciwnik);
            }
            else    
            System.out.println(this.team.get(attacker).name() +" nr " +attacker + " atakuje " +p2.team.get(przeciwnik).name() + " nr " +przeciwnik + " pozostawiajac mu " +p2.team.get(przeciwnik).getPointsHealth() +" punktow zycia");
        }
        else
        System.out.println(this.team.get(attacker).name() +" nr " +attacker + " idzie w strone " +p2.team.get(przeciwnik).name() + " nr "+przeciwnik);

    }
    
    
}
