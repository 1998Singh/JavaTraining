package com.evoke.loops;
// prime no is the no which can divide by itself or 1.

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = in.nextInt();
		int fact = 0;
		for (int n = 1; n <= num; n++) {
			if (num % n == 0) // n is factor of num
				fact++;
		}
		if (fact == 2)
			System.out.println("Prime No= " + num);
		else
			System.out.println("Not a Prime No= " + num);

	}

}
