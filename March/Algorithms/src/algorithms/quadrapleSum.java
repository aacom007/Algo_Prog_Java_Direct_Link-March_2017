/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author akshay anand
 */
public class quadrapleSum {
    
    public quadrapleSum(){
       sumup m = new sumup(); 
       int []arr = {0,0,1,1,2,4,5,6,7,7};       
       int [] used = {0,0,0,0,0,0,0,0,0,0};
       m.addSum(arr, used, 0, 23);
       System.out.println(m.map);
    }
    
    public class sumup{
        public Set<PriorityQueue<Integer>> map = new HashSet<PriorityQueue<Integer>>();
        
        public int addSum(int [] arr, int[] used, int curr, int sum){
            curr =0;
            for(int k=0;k<used.length;k++){
                //System.out.print(" "+used[k]);
                if(used[k]==1){
                    curr+=arr[k];
                }
            }
            
            if(curr>sum){
                return 0;
            }
            
            if(curr == sum)
            {
                PriorityQueue<Integer> m = new PriorityQueue<Integer>();
                int count = 0;
                for(int k = 0; k < used.length; k++)
                {
                    if(used[k]==1)
                    {
                        count++;
                        m.add(arr[k]);
                    }
                }
                
                if(count == 4)
                {
                    if(!map.contains(m))
                    map.add(m);
                }
            }
            
            else
            {
                for(int i=0;i<used.length;i++)
                {
                    if(used[i]==0)
                    {
                        used[i] = 1;
                        curr += arr[i];
                        int p = addSum(arr,used, curr,sum);                       
                        used[i] = 0;
                    }
                    System.out.println("");
                }
            }
            return 1;
        }
    }
    
      public static void main(String [] args){
        quadrapleSum k = new quadrapleSum();
    }
}
