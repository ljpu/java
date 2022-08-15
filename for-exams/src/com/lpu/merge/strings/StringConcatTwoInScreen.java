package com.lpu.merge.strings;
import java.util.Scanner;

class StringConcatTwoInScreen {
	public static void main(String args[]) {
		String str1, str2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		str1 = sc.nextLine();
		System.out.println("Enter the 2nd string");
		str2 = sc.nextLine();
		result = str1 + str2;
		System.out.println("Concatenated String is ");
		
		System.out.println(result);

	}

}