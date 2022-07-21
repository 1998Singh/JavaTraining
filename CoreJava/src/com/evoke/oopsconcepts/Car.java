package com.evoke.oopsconcepts;
// Compile Time Polymorphism (Method Overloading)

public class Car {

	void carDetails(String companyName, String headquarter, String parentCompany) {
		System.out.println("Company Name = " + companyName);
		System.out.println("Headquarter = " + headquarter);
		System.out.println("Parent Company = " + parentCompany);

	}

	void carDetails(String carName, String model, int price) // method overloading
	{
		System.out.println("Car Name = " + carName);
		System.out.println("Model Name = " + model);
		System.out.println("Price = " + price + "Lakh");

	}

	void carDetails(int maxSpeed, int engineCapacity) {
		System.out.println("Max Speed = " + maxSpeed + "km/h");
		System.out.println("Engine Capacity = " + engineCapacity + "cc");

	}

}
