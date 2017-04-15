/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author akshay anand
 */
public class ThreeSUM {
    public static void main(String [] args){
        int [] arr = {-3,-2,0, -1,4,3,2,1,6};
        List<List<Integer>> sets = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int x =0,m=0,n=0;
        Scanner sc = new Scanner(System.in);
        
        
        
        int k =3;
        k = sc.nextInt();
        
        for(int i =0;i<arr.length;i++){
            x = arr[i];
            m =0;
            n = arr.length-1;
            
            while(m<i && n>i){
            
                if(x+arr[m]+arr[n] == k)
                {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(x);
                    list.add(arr[m]);
                    list.add(arr[n]);
                    sets.add(list);
                    m++;
                    n--;
                } 
                else if(x+arr[m]+arr[n] > k){
                
                    n--;
                } 
                else if(x+arr[m]+arr[n] < k){
                    
                    m++;
                }
            }
        }
        
        System.out.print(sets);
        
    }
}
