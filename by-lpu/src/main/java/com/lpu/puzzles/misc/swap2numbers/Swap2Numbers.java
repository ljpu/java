package com.lpu.puzzles.misc.swap2numbers;

public class Swap2Numbers {

    public static void swapWith3rdVariable(int x, int y) {

        int temp = x;

        x = y;
        y = temp;

        System.out.println("After swapped");
        System.out.println("first = " + x);
        System.out.println("second = " + y);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        System.out.println("Before swapped");

        System.out.println("first = " + x);
        System.out.println("second = " + y);
        swapWith3rdVariable(x, y);

    }
}