package com.evoke.loops;

import java.util.Scanner;                  // input=123
							               // output=6
public class WhileLoopsDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no ");
		int num = in.nextInt();
		int Sum = 0;
		while (num != 0) {
			int rem = num % 10;
			Sum = Sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of Digit is = " + Sum);

	}

}
