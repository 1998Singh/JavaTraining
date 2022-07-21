package com.evoke.arrays;

public class OddEven {

	public static void main(String[] args) {
		int[] array = { 19, 10, 30, 12, 5, 99, 25, 7 };
		int odd = 0, even = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i] % 2 == 0)
				even++;
			else
				odd++;

		}
		System.out.println("\nNo of even valuse =" + even);
		System.out.println("No of odd valuse =" + odd);
	}

}
