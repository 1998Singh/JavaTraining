package com.evoke.methodinvocation;

public class A {

	int a;
	int b;

	void m1() {
		System.out.println("inside non static method");
	}

	static void m2() {
		System.out.println("inside static method");
	}

	void add(int a, int b) {

		this.a = a;
		this.b = b;
		int c = a + b;
		System.out.println(" sum is =" + c);

	}

}
