package com.lpu.merge.strings;

public class Merge2StringFast {

	public static String merge(String s1, String s2) {
		return new StringBuilder(s1).append(s2).toString();
	}

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "forgeeks";
		System.out.println(merge(s1, s2));
	}
}
