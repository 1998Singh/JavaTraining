package com.evoke.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 20;
		a[1] = 30;
		a[2] = 40;
		a[3] = 60;
		int Sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

			Sum += a[i];

		}
		System.out.println("\nSum is = " + Sum);
	}

}
