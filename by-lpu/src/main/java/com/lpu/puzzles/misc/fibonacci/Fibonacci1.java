package com.lpu.puzzles.misc.fibonacci;

/*
 * 2022-10-22: cannot compile this
 */
public class Fibonacci1 {
    public static void fibanacci() {
        int sum;
        int next;

        sum = 0;
        next = 1;

        sum = next;
        System.out.println("sum =" + sum);
        // next = sum + next;
        while (sum < 100) {
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

    public static void main(String[] args) {
        fibanacci();
    }
}
