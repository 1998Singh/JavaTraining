package com.evoke.variable;

public class ClassLevelDemo {
	int a = 50; // instance variable
	static int b = 30; // static variable
	// int c;
	// int d;

	void add() {
		int c = 20, d; // local variable
		d = a + b + c;
		System.out.println("Sum is = " + d);
	}

	void Multi() {
		int e = 2, f;
		f = a * b * e;
		System.out.println("multiplication is = " + f);
	}

	int add1(int c, int d) {
//		this.c = ;
//		this.d = 30;
		return c+d;
		// System.out.println("sum is " + e);
//		return e;

	}

	public static void main(String[] args) {
		ClassLevelDemo cl1 = new ClassLevelDemo();
		cl1.add();
		cl1.Multi();
		int result = cl1.add1(2, 4);
		System.out.println(result);

	}
}
