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
import java.util.*;
import java.lang.*;
import java.io.*;

class Tries {
    
    public Tries(){
        
       
        
        
    }
    
    public void printMe(){
        
        Node nod = new Node();
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		 //System.out.println(testcase);
		while(testcase-->0){
		    
		    
		    int N = sc.nextInt();
		    //System.out.println(N);
		    String []arr = new String[N];
		    
		    for(int i=0;i<N;i++){
		        arr[i] = sc.next(); 
		        
		        
		        nod.add(arr[i]);
		    }
		    
		    String search = sc.next();
		    //System.out.println(search);
		    
		    System.out.println(nod.findCount(search,0));
		   
		   }
        
    }
    
	public static void main (String[] args) {
		//code
            Tries m = new Tries();
            
            m.printMe();
	}
	
	public class Node{
	    
	    char val;
	    
	    int size =0;
	    
	    public Node []child = new Node[26];
	    
	    public void setNode(char c, Node n){
	   	     child[getIndex(c)] = n;
	    }
	    
	    public void add(String s){
	        
	        add(s,0);
	    }
	    
	    public void add(String s, int i){
	        
	        if(s.length()==i){
	            
	            return;
	        }
	        
	        char current = s.charAt(i);
	        int c = getIndex(current);
	        Node n = getNode(current);
	        
	        if(n==null){
	            
	            n = new Node();
	            setNode(current, n);
	        }
	        size++;
	        n.add(s,i+1);
	    }
	    
	   public int getIndex(char c){
	       return c-'a';
	   }
	   
	   public Node getNode(char c){
	       
	       return child[getIndex(c)];
	   }
	    
	   public int  findCount(String s, int i){
	       if(i==s.length()){
	           return size;
	       }
	       
	       Node c = getNode(s.charAt(i));
	       if(c== null){
	           return 0;
	       }
	       
	       return c.findCount(s, i+1);
	   } 
	   
    }
	    
	
}
