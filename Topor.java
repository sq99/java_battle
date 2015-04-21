/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author fzeglen
 */
public class Topor extends Weapon {
    
    float dlugosc = 1;
    float jakosc = 5;
    
    float zasieg = 1;
    
    public Topor()
    { 
        
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints() * (int)dlugosc + (int)jakosc;
    }
    
//    @Override
//    public int getRangePoints()
//    {
//        return super.getRangePoints()* (1/2) * (int)zasieg;
//    }
}

