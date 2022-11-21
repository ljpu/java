package com.lpu.puzzles.misc.fibonacci;

public class Fibonacci 
 {
     public static void fibanacci()
     {
        int sum;
        int next; 

        sum = 1;
        next = 0;
        
        while (sum < 100){
            sum = next + sum;
   
            System.out.println("sum =" + sum);
            
            next = sum + next;
            
            System.out.println("sum =" + next);

            try {
                if (sum >= 100) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("OutofIndexException: " + "out of 100" + " sum =" + sum);
                // System.out.println("n =" + n);
            }

        }
        
     }
     
     public static void main(String[] args)
     {
        fibanacci();
     }
}
