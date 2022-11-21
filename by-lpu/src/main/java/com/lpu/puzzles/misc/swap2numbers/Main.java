package com.lpu.puzzles.misc.swap2numbers;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void compositionOfMultiple() {
    List<String> animals = new ArrayList<>(4);

    // numOfInvs.add(5);
    System.out.println(animals.size());

    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Dog");
    animals.add("Dog");

    System.out.println(animals);
  }

  public static void main(String[] args) {
    int temp;
    int x = 100;
    int y = 200;

    // Swapping in steps
    temp = x;
    x = y;
    y = temp;

    // Verify swapped values
    System.out.println("x = " + x + " and y = " + y);

    compositionOfMultiple();
  }

}