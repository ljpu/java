package com.lpu.puzzles.misc.infinite;

public class TestInfinite {

    public static void infinite() {
        int n = 0;
        while (n <= 100000) {
            // n++;
            ++n;
            try {
                if (n > 100000) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("OutofIndexException: " + "out of 1000000" + " n =" + n);
                System.out.println("n =" + n);
            }

        }
    }

    public static void divisionIsZero() {

        double num = 100.0 / 0.0;
        System.out.println(num);
        double num2 = -10.0 / 0.0;
        System.out.println(num2);
    }


    public static void main(String[] args) {
        infinite();
        divisionIsZero();
    }

}
