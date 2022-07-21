package com.evoke.arrays;

public class EvenNo {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 15, 19, 10, 8, 88,90,78 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even valus are = " + arr[i]);
			}
		}
	}

}
