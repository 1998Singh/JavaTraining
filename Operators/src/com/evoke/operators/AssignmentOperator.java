package com.evoke.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 100;
		int x, y, z;
		x = y = z = 200;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		int b = 60; // compound assignment operator
		b += 40; // b=b+40
		System.out.println("\n value of b =" + b);
	}

}
