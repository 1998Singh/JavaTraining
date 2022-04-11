package com.evoke.nonstaticmembers;

public class NonStaticMembersDemo {
	int num;

	NonStaticMembersDemo() {
		System.out.println("inside the constructors");
	}

	{
		System.out.println("inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("inside the main method");
		new NonStaticMembersDemo();

	}

}
