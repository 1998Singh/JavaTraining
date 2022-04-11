package com.evoke.nonstaticmembers;

public class StaticVsNonstatic {
	int num;

	StaticVsNonstatic() {
		System.out.println("inside constructor");
	}

	{
		System.out.println("inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("inside the main method");
		new StaticVsNonstatic();
		new StaticVsNonstatic();
		new StaticVsNonstatic();

	}

	static {
		System.out.println("inside the static block");
	}

}
