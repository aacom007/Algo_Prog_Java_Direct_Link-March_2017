/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package March.Algorithms.src.algorithms;

import java.util.Comparator;

/**
 *
 * @author akshay anand
 */
public class ComparatorPQ implements Comparator<PQ>{

    @Override
    public int compare(PQ t, PQ s){
    
     return  Integer.compare(s.fuel,t.fuel);
            

            
        
    }    
}
