/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package March.Algorithms.src.algorithms;

/**
 *
 * @author akshay anand
 */
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.lang.*;

public  class PQ {
    String s;
    int fuel;
    
    
    public PQ(String s, int f){
        this.s =s ;
        this.fuel = f;
    }
    
    public void print(){
        
        System.out.print(this.s +"  FUEL: "+ this.fuel);
    }
  
}

