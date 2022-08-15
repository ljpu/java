package com.lpu.merge.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MergeWordsFromFile {

	public static String mergeWithScanner(File file) {
		Scanner s = null;
		StringBuilder stringList = new StringBuilder("");

		try {
			s = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (s.hasNext()) {
			stringList.append(s.next());
		}
		s.close();
		return stringList.toString();
	}

	public static String mergeWithFileReader(File file) {
		FileReader in = null;
		String contents = null;
		StringBuilder sb = new StringBuilder();

		try {
			while (in.read() != -1) {
				sb.append(in.read());
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contents = sb.toString();
		return contents;
	}

	public static void main(String[] args) {
		File file = new File("D:\\wordlist.txt");
		System.out.println(mergeWithScanner(file));
	}
}