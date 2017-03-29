/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.awt.RenderingHints;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author akshay anand
 */
public class Graphs {
    
    
    public HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    
    
    public static void main(String [] args){
        
        Graphs g = new Graphs();
    }

    public Graphs() {
    
       Node m = new Node(0);
       
       map.put(0, m);
       
       m.addEdge(0, 1, 1);
       m.addEdge(0, 2, 10);
       m.addEdge(1, 2, 1);
       m.addEdge(1, 4, 1);
       m.addEdge(4, 3, 1);
       m.addEdge(2, 3, 5);
       
       m.hasPath(0, 5);
      // m.printMST(0);
    }
    
    
    
    public class Node{
        
        // edges load to {key , load)
        public HashMap<Integer, Integer> edge = new HashMap<Integer, Integer>();
        
        private int id;
        
        private boolean visited;
        
        // adj Node list (nodes)
        LinkedList<Node> adj = new LinkedList<Node>();
        
        public Node(int i)
        {
            id = i;
        }
        
        private Node getNode(int id){
            
            if(map.containsKey(id)){
               
                return map.get(id);
               
            }
            
            return null;
        }
        
        private void addEdge(int source, int dest, int load){
            
            if(map.containsKey(source)){
               Node s = map.get(source);
               Node d = new Node(dest);
               map.put(dest,d);
               s.adj.add(d);
               s.edge.put(dest, load);
               System.out.println(map);
               System.out.println("Source :" +source+" --- "+load+" --- Dest :"+ dest);
            }
            
        }

        // DFS _____________________________ START
        
        public boolean hasPath(int a, int b){
            
            Node s = getNode(a);
            Node d = getNode(b);
            
            HashSet<Integer> visited = new HashSet<Integer>();
            
            boolean val = itHasPath(s,d,visited);
            
            if(val)
                System.out.println("It has path from "+a +" to "+ b);
            else
                 System.out.println("No path found from "+a +" to "+ b);
            
            return val;
        }
            
        public boolean itHasPath(Node s, Node d, HashSet<Integer> v){
            
            if(v.contains(s.id)){
                return false;
            }
            
            v.add(s.id);
            
            if(d == null){
                return false;
            }
            
            if(s.id == d.id && s == d){
                return true;
            }
            
            for(Node child: s.adj){
                if(itHasPath(child, d, v)){
                    return true;
                }
            }
            
            return false;
        }
        // DFS _____________________________ ENDS
        
        
        // MST _____________________________ START
        public void printMST(int source){
            
            int [] list = new int [10];
            
            int minSum = 0;
            
            int curr =0;
            
            Set<Integer> loop = new HashSet<Integer>();
            
            loop.add(source);
            
            Set<Integer> viss = new HashSet<Integer>();
            
            //if(false){
            while(!loop.isEmpty()){
                    
                Node s = getNode(source);
                
                int minVal = Integer.MIN_VALUE;
            
                int minEdge = -1;
            
                for(Integer m : viss){
                   
                    Node vis =  getNode(m);
                   
                    vis.visited = true;
                }
                
                viss.add(source);
                
               for(Map.Entry<Integer, Integer> l : s.edge.entrySet())
               {
             
                int m = l.getKey();
               
                System.out.print(m);
                
               
                    
                    loop.add(m);
                    
                    if(s.edge.get(m) < minVal)
                    {
                        minVal  = s.edge.get(m);
                        minEdge = m;
                    }   
                }
                
                loop.remove(source);
                
                source = minEdge;
                
                minSum+=minVal;
                
                list[curr++] = minEdge;
                
            }

            System.out.println(" SUM:"+ minSum+"  -> "+ list);
           
            
        }
        
    }
    
}
