/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * Recursive solution to find if Tree B is a SubTree of Tree A
 * @author akshay anand
 */
public class isSubTree {
    
     public static void main(String[] s) {
        isSubTree f = new  isSubTree();
        System.out.println(f.check(makeSampleTreeA(), makeSampleTreeB()));
    }
    
    public boolean check(Node A, Node B){
    
        if(B == null){
            return true;
        }
        
        if(A== null){
            return false;
        }
        
        return ( check(A.left, B.left) && check(A.right , B.right));

    }
    
    public static Node makeSampleTreeA() {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();
        Node g = new Node();
        Node h = new Node();
        Node i = new Node();
        a.val = 'a';
        b.val = 'b';
        c.val = 'c';
        d.val = 'd';
        e.val = 'e';
        f.val = 'f';
        g.val = 'g';
        h.val = 'h';
        i.val = 'i';
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        d.left = f;
        e.right = g;
        f.left = h;
        f.right = i;
        return a;
    }
    
    public static Node makeSampleTreeB() {
        
        Node e = new Node();
        Node f = new Node();
        Node g = new Node();
        Node h = new Node();
        Node i = new Node();
        e.val = 'e';
        f.val = 'f';
        g.val = 'g';
        h.val = 'h';
        i.val = 'i';
        e.right = g;
        f.left = h;
        f.right = i;
        return e;
    }

}

 class Node {
    Node left;
    Node right;
    char val;
}
    

