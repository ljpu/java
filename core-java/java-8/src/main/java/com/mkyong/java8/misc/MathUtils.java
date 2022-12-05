package com.mkyong.java8.misc;

public class MathUtils {
    public static double average(int a, int b) {
        double sum;
        sum = a + b;
        double avg;
        avg = sum/2;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
