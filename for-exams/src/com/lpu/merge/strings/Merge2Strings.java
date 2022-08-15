package com.lpu.merge.strings;

public class Merge2Strings {

	public static String merge(String s1, String s2) {

		String result = s1.concat(s2);
		return result.toString();
	}

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "forgeeks";
		System.out.println(merge(s1, s2));
	}
}