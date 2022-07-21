package com.evoke.arrays;

public class MaxandMin {

	public static void main(String[] args) {
		int[] a = { 125, 188, 166, 120, 66, 190, 111, 88 };
		int max, min;
		max = min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			if (min > a[i])
				min = a[i];

		}
		System.out.println(" max value is = " + max);
		System.out.println(" min value is = " + min);
	}

}
