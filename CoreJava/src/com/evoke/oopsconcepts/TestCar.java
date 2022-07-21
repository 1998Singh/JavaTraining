package com.evoke.oopsconcepts;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carDetails("Jaguar", "United Kingdom", "Tata Motor");
		System.out.println("-------------------------------");
		c1.carDetails("Jaguar F Phace", "SVR", 74);
		System.out.println("---------------------------------");
		c1.carDetails(286, 49999);
	}

}
