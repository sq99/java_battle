/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author serq9_000
 */
public class Gra {
    
   Gra(){}
   
           
           
    public void rozgrywka()
    {
        Random generator = new Random(System.currentTimeMillis()); 
        List<Weapon> bronie = new ArrayList<Weapon>();
        List<Weapon> bronie2 = new ArrayList<Weapon>();

        Miecz bron1 = new Miecz();
        Karabin bron2 = new Karabin();

        Topor bron3 = new Topor();
        Pistolet bron4 = new Pistolet();

//        bron1.setHitPoints(40);        
//        bron2.setHitPoints(160);
//        bron3.setHitPoints(20);
        bronie.add(bron1);
        bronie.add(bron2);
        bronie2.add(bron3);
        bronie2.add(bron4);

        List<Mover> transport = new ArrayList<Mover>();
        List<Mover> transport2 = new ArrayList<Mover>();

        Mover mover1 = new Mover();
        mover1.setMovePoints(60);
        Mover mover2 = new Mover();
        mover2.setMovePoints(30);

        Kon kon = new Kon();
        Rydwan rydwan = new Rydwan();

        Ufo ufo = new Ufo();
        StatekKosm statek = new StatekKosm();

        transport.add(kon);
        transport.add(rydwan);

        transport2.add(ufo);
        transport2.add(statek);

        Czlowiek c1 = new Czlowiek(bronie, transport, 100, 100, 1);
        Czlowiek c2 = new Czlowiek(bronie, transport, 100, 100, 1);
        Czlowiek c3 = new Czlowiek(bronie, transport, 100, 100, 1);
        Czlowiek c4 = new Czlowiek(bronie, transport, 100, 100, 1);
        Czlowiek c5 = new Czlowiek(bronie, transport, 100, 100, 1);

        c1.setPos(1,2);
        c2.setPos(1,4);
        c3.setPos(1,6);
        c4.setPos(1,8);
        c5.setPos(1,10);

        Alien a1 = new Alien(bronie2, transport2, 100, 100, 1);
        Alien a2 = new Alien(bronie2, transport2, 100, 100, 1);
        Alien a3 = new Alien(bronie2, transport2, 100, 100, 1);
        Alien a4 = new Alien(bronie2, transport2, 100, 100, 1);
        Alien a5 = new Alien(bronie2, transport2, 100, 100, 1);

        a1.setPos(10, 2);
        a2.setPos(10, 4);
        a3.setPos(10, 6);
        a4.setPos(10, 8);
        a5.setPos(10, 10);

        Player p1 = new Player();
        p1.addWarrior(c1);
        p1.addWarrior(c2);
        p1.addWarrior(c3);
        p1.addWarrior(c4);
        p1.addWarrior(c5);

        Player p2 = new Player();
        p2.addWarrior(a1);
        p2.addWarrior(a2);
        p2.addWarrior(a3);
        p2.addWarrior(a4);
        p2.addWarrior(a5);
        int ilosc_rund = 0;
        System.out.println("Rozpoczecie gry");
        while(p1.getCount() != 0 && p2.getCount() != 0)
        {
//            if(p1.getCount()==0)
//            {
//           
//                System.out.println("Armia kosmitow pokonala armie ludzi w "+ilosc_rund +" rundach");
//                System.out.println("Koniec gry");
//                break;
//            }
//        
//            if(p2.getCount()==0)
//            {
//                System.out.println("Armia ludzi pokonala armie kosmitow w "+ilosc_rund +" rundach");
//                System.out.println("Koniec gry");
//                break;
//            }
            
            System.out.println("Atakuja ludzie");
            p1.Attack(p2);
            for(int i=0;i<p1.getCount();i++)
            {
                System.out.println("Pozycja czlowieka nr " +i +"  " +"X:"+p1.team.get(i).getPos().getX()+ "  " +"Y:"+p1.team.get(i).getPos().getY());
                System.out.println("Zycie czlowieka nr " +i +": " +p1.team.get(i).getPointsHealth());
            }
            for(int i=0;i<p2.getCount();i++)
            {
                System.out.println("Pozycja kosmity nr " +i +"  " +"X:"+p2.team.get(i).getPos().getX()+ "  " +"Y:"+p2.team.get(i).getPos().getY());
                System.out.println("Zycie kosmity nr " +i +": "+p2.team.get(i).getPointsHealth());
            }
            System.out.println("Atakuja kosmici");
            p2.Attack(p1);
            for(int i=0;i<p1.getCount();i++)
            {
                System.out.println("Pozycja czlowieka nr " +i +"  " +"X:"+p1.team.get(i).getPos().getX()+ "  " +"Y:"+p1.team.get(i).getPos().getY());
                System.out.println("Zycie czlowieka nr " +i +": " +p1.team.get(i).getPointsHealth());
            }
            for(int i=0;i<p2.getCount();i++)
            {
                System.out.println("Pozycja kosmity nr " +i +"  " +"X:"+p2.team.get(i).getPos().getX()+ "  " +"Y:"+p2.team.get(i).getPos().getY());
                System.out.println("Zycie kosmity nr " +i +": "+p2.team.get(i).getPointsHealth());
            }
            ilosc_rund++;
//            for(int i=0;i<p1.getCount();i++)
//            {
//                if(p1.team.get(i).getPointsHealth()==0)
//                    p1.removeWarrior(p1.team.get(i));
//            }
//            for(int i=0;i<p2.getCount();i++)
//            {
//                if(p2.team.get(i).getPointsHealth()==0)
//                    p2.removeWarrior(p2.team.get(i));
//            }
        
        if(p1.getCount()==0)
        {
           
            System.out.println("Armia kosmitow pokonala armie ludzi w "+ilosc_rund +" rundach");
            System.out.println("Koniec gry");
            break;
        }
        
        if(p2.getCount()==0)
        {
            System.out.println("Armia ludzi pokonala armie kosmitow w "+ilosc_rund +" rundach");
            System.out.println("Koniec gry");
            break;
        }
       }
//        System.out.println("Przed Atakiem " + SecondCreature.getPointsHealth());
//        
//    for(int i=0; i< ileAtakow ;i++){
//             FirstCreature.Attack(SecondCreature);}
//                
//       
//        System.out.println("Po " +  ileAtakow + " Ataku " + SecondCreature.getPointsHealth());
//        
//        String out = "Overall : " + FirstCreature.getAttackWithMove() + ",  Att : " + FirstCreature.getPointsAttack() + ", Move : " + FirstCreature.getPointsMove();
//        
//        System.out.println(out);
//        System.out.println("\n");
//         
//         
//        
//    System.out.println("Przed Atakiem " + FirstCreature.getPointsHealth());
//    
//    for(int i=0; i< ileAtakow ;i++){
//             SecondCreature.Attack(FirstCreature);}
//                
//       
//        System.out.println("Po " +  ileAtakow + " Ataku " + FirstCreature.getPointsHealth());
//        
//        String out2 = "Overall : " + SecondCreature.getAttackWithMove() + ",  Att : " + SecondCreature.getPointsAttack() + ", Move : " + SecondCreature.getPointsMove();
//        
//        System.out.println(out2);
        
    }
}
