package com.evoke.oopsconcepts;

public class TestCalculater {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Addtion of two no = " + c1.add(20, 40));
		System.out.println("Addition of three no = " + c1.add(20, 50, 90));
		System.out.println("Multiplication = " + c1.Multiplay(25, 25));
		System.out.println("Multiplication = " + c1.Multiplay(20.12, 12.21));
	}

}
