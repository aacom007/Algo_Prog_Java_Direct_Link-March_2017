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
public class steps {
    
    int finalStep;
    int step1;
    int step2;
    
    public steps(int a, int b, int c)
    {
        finalStep = a;
        step1 = b;
        step2 = c;
    }    
    
    public long waysToReachFinalStep(){
        
       long [] m = new long [finalStep]; 
       m[0] = step1;
       m[1] = step2;
       
       for(int i=2;i<finalStep;i++)
       {
         m[i] =0;    
       }
       for(int i=2;i<finalStep;i++)
       {
           m[i] = reachFinalStep(i, m); 
       }
        return m[finalStep-1];
    }
    
    
    //main
    public static void main(String [] args){
        
        steps m = new steps(90,1,2);
       
        System.out.println(m.waysToReachFinalStep());
        
    }

    private long reachFinalStep(int i, long[] m) {
      
        if(i<=1){
            return m[0];
        }
        
        
        System.out.print(m[i-1]+ m[i-2]+" ");
        return m[i-1]+ m[i-2];
    }
}
