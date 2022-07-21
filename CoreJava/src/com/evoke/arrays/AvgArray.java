package com.evoke.arrays;

public class AvgArray {

	public static void main(String[] args) {
		int[] a = { 10, 12, 45, 29, 25 };
		int sum = 0, avg;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.println("sum = " + sum);
		System.out.println("sum = " + avg);
	}

}
