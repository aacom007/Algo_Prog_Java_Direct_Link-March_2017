/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
  
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author akshay anand
 */
public class printingNonRepeatingCharInStream {
 
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Testcases: ");
        
        int testcases = sc.nextInt();
        // loop through all each test case
        for(int testcase=0;testcase< testcases;testcase++){
            
            System.out.println();
            System.out.println("--------------------------------------------------------");
            System.out.println("Enter the number of values for testcase "+testcase+1+" :");
            
            int values = sc.nextInt();
            // create a set to store unique characters
            Set<Character> set = new HashSet<Character>();
            // add to another set to contain all removed characters till now
            Set<Character>  removed = new HashSet<Character>();
            // linked list to store the sequence and always print first value ( print -1 if enpty )
            LinkedList<Character> ar = new LinkedList<Character>();
            // store next input character
            Character ch = ' ';
            // loop and get next character
            for(int k=0; k< values; k++){

                System.out.println("Enter next Character: ");
                // input character
                ch = sc.next().charAt(0);
                // check if set already contains this character
                if(set.contains(ch) ){
                    // add this to removed character set
                    removed.add(ch);
                    // remove all the characters from
                    ar.removeAll(removed);
                }
                else{
                    // add new character to linked list
                    ar.add(ch);
                    // add new character to set
                    set.add(ch);
                }
                // print result
                System.out.print("First non Repeatable character: ");
                System.out.println(ar.isEmpty()? -1: ar.getFirst()+" ");
            }
        }
    
    }
}
