/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author akshay anand
 */
public class slidingWindowMax {


   public class Window{
        int k =5;
        int val;
        int j =0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, new Comparator() {
            @Override
            public int compare(Object m , Object k){
            
                return compare(Integer.parseInt(m.toString()), Integer.parseInt(k.toString()));
            }
            
            public int compare(int t, int  t1) {
                 
                return t-t1;
            }
        });
        
        
       
        int [] am = {-1,-5,-3,0,2,1,4,3,6, 10};
        
        public  void printMe(){
            int i =0;
            for(int index=0; index<am.length;index++)
            {    q.add(am[index]);
                System.out.print(q.poll());
                System.out.println("-------");
            }
        }
    }

    public slidingWindowMax() {
   
     Window c = new Window();
        
        c.printMe();
    }
    
   
   
   
    public static void main(String[] args) {
        
       slidingWindowMax l = new slidingWindowMax();
        
    }
    
}
