/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author akshay anand
 */
public class Permutation {
    
    //Replace space by %20 in a string.
    // length is known.
    
    public static String inPlaceSpace(String s){
        for(int i =s.length()-1;i>=0;i--){
            
            if(s.charAt(i)== ' '){
                s = s.substring(0,i)+"%20"+s.substring(i+1,s.length());
            } 
        }
        return s;
    }
    
    public static StringBuilder replaceSpace(String s){
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
            
                str.append("%20",0,3);
            } else{
                str.append(""+s.charAt(i),0,1);
            }
        }
        
        
        
        return str;
    }
}
