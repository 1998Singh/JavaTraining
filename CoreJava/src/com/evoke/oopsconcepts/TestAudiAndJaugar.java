package com.evoke.oopsconcepts;

public class TestAudiAndJaugar {

	public static void main(String[] args) {
		Audi A1 = new Audi("Audi", "Audi Q7", "Q7", 82.48);
		System.out.println("Company Name = " + A1.companyName + "\nCar Name = " + A1.CarName + " \nCar Model = "
				+ A1.carModel + " \nPrice = " + A1.price + "Lakh");
		System.out.println("-----------------------------------------");

		Audi a = new Jaguar("Jaguar", "Jaguar F Phase", "SVR", 74.84); // method overriding
		String ju = a.getCarName();
		System.out.println(ju);

	}

}
