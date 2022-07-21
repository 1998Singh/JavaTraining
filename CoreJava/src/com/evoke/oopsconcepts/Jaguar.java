package com.evoke.oopsconcepts;

public class Jaguar extends Audi {

	String parentCompany;

	public Jaguar(String companyName, String carName, String carModel, double price) {
		super(companyName, carName, carModel, price);

	}

	public String getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}

	public String getCarName()  // method Overriding
	{
		System.out.println("It is From Jaguar Class");
		return CarName;
	}

	public void setCarName(String carName) {

		this.CarName = carName;

	}

	public double getPrice()      // method overriding
	{
		return price;
	}

	public void setPrice(double price) {

		this.price = price;

	}

}
