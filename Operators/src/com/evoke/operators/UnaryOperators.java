package com.evoke.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int x = 20;
		int y = ++x; // Pre-Increment
		System.out.println("value of x =" + x);
		System.out.println("value of y =" + y);

		int a = 20;
		int b = a++;   //Post-Increment
		System.out.println("\n value of a =" + a);
		System.out.println("value of b =" + b);
		
		
		int c = 20;
		int d = --c;   //Pre-Increment
		System.out.println("\n value of a =" + c);
		System.out.println("value of b =" + d);
	}

}
