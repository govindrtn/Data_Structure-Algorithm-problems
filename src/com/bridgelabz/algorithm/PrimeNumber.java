package com.bridgelabz.algorithm;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int first = 0 ; 
		int last = 1000;
		
		for (int i = 2 ; i <= last; i++) {
			int flag = 1;
			for (int j = 2; j<= (i/2); j++) {
				if( i% j == 0) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				System.out.println(i + " ");
			}
		}

	}

}
