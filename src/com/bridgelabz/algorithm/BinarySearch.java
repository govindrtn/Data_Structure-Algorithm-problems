package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number or Words you wish to input: - ");
		int n = sc.nextInt();
		String[] words = new String[n];

		System.out.println("Enter Words :- ");
		for (int i = 0; i < words.length; i++) {
			System.out.println("Word " + (i + 1) + " : ");
			words[i] = sc.next();
		}

		for (int j = 0; j < words.length; j++) {
			for (int k = 0; k < words.length - 1 - j; k++) {
				if (words[j].compareTo(words[j + 1]) > 0) {
					String tempVar = words[j];
					words[j] = words[j + 1];
					words[j + 1] = tempVar;
				}
			}

		}

		for (int l = 0; l < words.length; l++) {
			System.out.println(words[l]);
		}

		System.out.println("Enter the word you want to search for : ");
		String word = sc.next();

		int li = 0;
		int hi = 0;
		int mi = 0;

		while (li <= hi) {
			mi = (li + hi) / 2;
			if (words[mi].equals(word)) {
				System.out.println(word + " is word no.= " + (mi + 1));
				break;
			} else if ((words[mi].compareTo(word)) < 0) {
				li = mi + 1;
			} else {
				hi = mi;
			}
		}
		System.out.println(word + " is word no. = " + (mi + 1));
	}
}
