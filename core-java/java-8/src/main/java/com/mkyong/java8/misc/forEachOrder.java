package com.mkyong.java8.misc;

import java.util.stream.Stream;

public class forEachOrder {

  public static void main(String[] args) {

    Stream<String> s = Stream.of("1", "a", "b", "c", "1", "2", "3", "d");

    // Does not guarantee to the encounter order of the stream
    // s.parallel().forEach(x -> System.out.println(x));

    // keep order, it is always 1,a,b,c,1,2,3,d

    // lambda expression in java
    // s.parallel().forEachOrdered(x -> System.out.println(x));

    // Method reference
    s.parallel()
        .forEachOrdered(
            System.out::println); // stream has already been operated upon or closed if the Lambda one is not commented
  }
}
