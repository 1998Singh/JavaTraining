package com.evoke.aggression;

public class GamingLaptop {
	private Laptop Laptop;   //variable

	public GamingLaptop() // constructor
	{
		
	}
	
public Laptop getLaptop() {
		return Laptop;
	}

	public void setLaptop(Laptop laptop) {
		Laptop = laptop;
	}

public void featureoflaptop() {
	Laptop.getFeatureDetails();
	
}
}
