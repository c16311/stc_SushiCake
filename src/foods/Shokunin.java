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
public class Shokunin extends Maker{
    
   protected List owners =new ArrayList();
    protected static int num=100000;
    @Override
    protected Food cookFood(String owner){
        return new Sushi(owner);
    }
    public Shokunin(){
        System.out.println("寿司の注文をはじめました。");
    }
    @Override
    protected void risterFood(Food food){
        
    }
    public List getOwners(){
        return owners;
    } 
}
