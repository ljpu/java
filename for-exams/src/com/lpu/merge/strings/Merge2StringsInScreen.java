package com.lpu.merge.strings;
import java.util.Scanner;

public class Merge2StringsInScreen {
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first string: ");
  String str1 = sc.next();
  System.out.println("Enter the second string: ");
  String str2 = sc.next();
  //Concatenating the two Strings
  String result = str1.concat(str2);
  System.out.println(result);
}
}
