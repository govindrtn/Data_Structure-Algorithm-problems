package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second String : ");
		String str2 = sc.nextLine();

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 == len2) {

			char[] firstArray = str1.toCharArray();
			Arrays.sort(firstArray);

			char[] lastArray = str1.toCharArray();
			Arrays.sort(lastArray);

			if (firstArray == lastArray) {
				System.out.println("The two String are Anagram : ");
			} else {
				System.out.println("the two String are not Anagram : ");
			}

		} else {
			System.out.println("the Two String are not of same length : ");
		}

	}

}
