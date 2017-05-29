/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foods;

import framework.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c16311
 */
public class Patissier extends Maker {
    protected List owners =new ArrayList();
    protected static int num=100000;
    
    public Patissier(){
        System.out.println("ケーキの注文を始めました。");
    }
    @Override
    protected Food cookFood(String owner){
        return new Cake(owner);
    }

    @Override
    protected void risterFood(Food food){
        
    }
    public List getOwners(){
        return owners;
    } 
}
