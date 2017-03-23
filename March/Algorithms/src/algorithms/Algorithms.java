/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package March.Algorithms.src.algorithms;

import algorithms.BinaryTree;
import algorithms.Permutation;
import java.util.Iterator;
import java.util.PriorityQueue;


/**
 *
 * @author akshay anand
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //repace string
        //StringBuilder s = Permutation.replaceSpace("this is a car max");
        
        //System.out.print(s);
         
        String  s1 = Permutation.inPlaceSpace("this is a car max");
        
        System.out.print(s1);
        // replace string inplace 
        
        
        // Binary Search Tree Sum = X on any path ...
        // The return the path and print the path
       // BinaryTreePathSum();
        
        // Priority Queue
       // PriorityQueue();
       
        
        
    }
    
    //BinaryTreePathSum
    public static void BinaryTreePathSum(){
        
        int findSum = 10;
        
        BinaryTree root = CreateTree();
        int [] path = new int[10];
        root.findSum(findSum, root, 0, path);
    }
    
    public static BinaryTree CreateTree(){
        BinaryTree x = new BinaryTree(5);
        
        x.add(x, 4);
        x.add(x, 1);
        x.add(x, 3);
        x.add(x, 2);
        
        return x;
        
    }
    // Priority Queue
    public static void PriorityQueue(){
         System.out.println("Priority Queue Start");
        
        ComparatorPQ comp = new ComparatorPQ();
        PriorityQueue<PQ> pq = new PriorityQueue<PQ>(10,comp);
        
        for(int i=0;i <10;i++){
           
            pq.add(new PQ("e"+i, 10-i)); 
        }
        
        Iterator<PQ> it = pq.iterator();
        
        while(it.hasNext()){
            
               PQ qq = it.next(); 
            System.out.println(qq.s +" "+ 
                    qq.fuel);
        }
        
        System.out.println("Priority Queue End");
    }
    
}
