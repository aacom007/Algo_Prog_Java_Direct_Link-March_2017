/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParsingJSON;

import java.util.Scanner;

/**
 *
 * @author akshay anand
 */
public class ithBitOfUnsignedInt {
    
    public static void main(String [] args){
    
        ithBitOfUnsignedInt obj = new ithBitOfUnsignedInt();
        
    }

    public ithBitOfUnsignedInt(){
        
        int m = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        m = Integer.bitCount(k);
        //System.out.println(" bianry format :" + ithbitofK( k));
        int i =0;
        while(i<=m){
            
            System.out.println(ithBitofKValue(k, i)+" ==  "+ ithBitofKValue(k, m-i));
            if(ithBitofKValue(k, i) != ithBitofKValue(k, m-i)){
                System.out.print("FALSE NOT A PALINDROME");
            }
            i++;
        }
         System.out.print("IS A PALINDROME");
    }
    
    public int ithBitofKValue(int k , int j){
        k = k >> j;
        return k%2;
    }
    
    
    public String ithbitofK(int k){
        int f = k;
        StringBuilder sb = new StringBuilder();
        int j =0;
        while((k >>1 )!=0){
            sb.append(k%2);
            k = k >> 1;
            System.out.println(j+ " th bit of k "+f +" is: "+ k%2  );
            j++;
        }
        sb.append(1);
        return sb.toString();
    }
            
            
}
