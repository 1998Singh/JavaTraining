package com.evoke.oopsconcepts;
// Compile Time Polymorphism (Method Overloading)

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) // method overloading
	{
		return a + b + c;
	}

	public int Multiplay(int e, int f) {
		return e * f;
	}

	public double Multiplay(double e, double f) // method overloading
	{
		return e * f;
	}

}
