package com.lpu.puzzles.CoinChanges;

import java.util.*;
import java.util.function.UnaryOperator;

import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

public class CoinChange {
    public static int count(int[] coins, int number, int target) {
        if (target == 0) {
            return 1;
        }
        if (target < 0 || number < 0) {
            return 0;
        }
        int first = count(coins, number, target - coins[number]);
        int second = count(coins, number - 1, target);
        return first + second;
    }

    // Generates singleton factory pattern
    private static UnaryOperator<Object> IDENTIFY_FN = (t) -> t;
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identifyFunction() {
        return (UnaryOperator<T>) IDENTIFY_FN;
    }

   

    public static void main(String[] args) {
        int[] coinArray = { 1, 2, 3, 4 };
        int target = 4;
        System.out.print("The total number of ways to get the desired change is "
                + count(coinArray, coinArray.length - 1, target));
        
        

    }
}