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
public class BinaryTree {
    
    BinaryTree left;
    BinaryTree right;
    int val;
    
    public BinaryTree(int k){
        this.val = k;
    }
    
    // ADD NEW VALUE TO BST
    public void add(BinaryTree root, int val){
    
        if(root.val > val){
            if(root.left!=null){
                add(root.left, val);
            }
            else
            {   
                root.left = new BinaryTree(val);
            }
        }
        if( val > root.val){
            if(root.right!=null){
                add(root.right, val);
            }
            else
            {
                root.right = new BinaryTree(val);
            }
        }
    }
    
    // print Path
     public void printMe(int end, int start,int [] path){
         System.out.println("FOUND IT");
         System.out.println(" ");
         for(int i =start;i<=end;i++){
             System.out.print(path[i]+" -> ");
        }
          System.out.println();
     }
     
    public void findSum(int val, BinaryTree root, int level, int [] path){
        
        if(root == null){
            return;
        }
        System.out.print("Root value" + root.val);
        path[level] =  root.val;

        int sum =0;    
        
        for(int i=level;i>=0;i--){

           sum+=path[i];
           
           if(sum==val){
               printMe(level,i, path);
           }
        }
        
        findSum(val, root.left, level+1, path);
        
        findSum(val, root.right, level+1, path);
    }
}
