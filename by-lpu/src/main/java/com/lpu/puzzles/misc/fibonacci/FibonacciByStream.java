package com.lpu.puzzles.misc.fibonacci;

import java.util.stream.Stream;

public class FibonacciByStream {
    
    public static void fib(int count)
    {    Stream
        //Generate a stream of arrays like this {0,1}, {1, 1}, {1, 2}, {2, 3}, {3, 5}...etc.
        .iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] })
        //Keep only the 1st element of each array.
        .map(n -> n[0])
        //Drop only 0.
        .dropWhile(i -> i < 1)
        //Take any number which is <= 100.
        .takeWhile(i -> i <= count)
        .forEach(System.out::println);

    }

    public static void main(String [] args){
        fib(100);
    }

}