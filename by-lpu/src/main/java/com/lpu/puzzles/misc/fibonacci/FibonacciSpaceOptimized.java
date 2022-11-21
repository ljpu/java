package com.lpu.puzzles.misc.fibonacci;

public class FibonacciSpaceOptimized {
    /*
     * Update:
     * I add the print each Fibancci number print line.
     * References: https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
     */
    static int fib(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            System.out.println(a);
            return a;
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
            return b;
        }
    }

    public static void main(String args[]) {
        int n = 9;
        fib(n);
        // System.out.println(fib(n));
    }
}
