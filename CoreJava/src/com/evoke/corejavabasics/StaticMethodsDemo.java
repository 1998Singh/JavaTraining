package com.evoke.corejavabasics;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method1();

	}

	static void method1() {
		System.out.println("Inside method 1");

	}

	static {
		System.out.println("Inside the Static block");
		StaticMethodsDemo.method1();
	}
}
