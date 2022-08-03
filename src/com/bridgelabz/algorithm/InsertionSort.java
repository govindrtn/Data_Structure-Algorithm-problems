package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of String : ");
		int n = sc.nextInt();
		String[] array = new String[n];
		String item;
		int j;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter arrya of element :  ");
			array[i] = sc.next();
		}
		for (int i = 0; i < array.length; i++) {
			item = array[i];
			j = 1;
			while (j > 0 && array[j - 1].compareTo(item) > 0) {
				array[j] = array[j - 1];
				j = j - 1;

			}
			array[j] = item;
		}
		System.out.println("After sorting : ");
		for (int p = 0; p < array.length; p++) {
			System.out.println(array[p] + " ");
		}
	}

}
