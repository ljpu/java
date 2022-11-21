package com.lpu.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int[] delete(int[] arr, int indexToBeRmoved) {
        int j = indexToBeRmoved;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != indexToBeRmoved) {
                newArr[k] = arr[i];
                k++;
            }

        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr_old = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int[] newArr1 = delete(arr_old, 3);

        System.out.println("Original Array : " + Arrays.toString(arr_old));

        System.out.println("After deletion :" + Arrays.toString(newArr1));

    }
}
