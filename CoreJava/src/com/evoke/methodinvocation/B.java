package com.evoke.methodinvocation;

public class B {

	public static void main(String[] args) {

		A a1 = new A();
		a1.m1();
		A.m2();

		A b1 = new A();
		b1.add(30, 50);

	}

}
