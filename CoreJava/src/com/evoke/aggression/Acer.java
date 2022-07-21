package com.evoke.aggression;

public class Acer implements Laptop {

	@Override
	public void brandname() {
		System.out.println("Acer Predator Gaming Laptop");

	}

	@Override
	public void getFeatureDetails() {
		
		System.out.println("from Acer = 16GB ram, 1TB HardDisk,4 GB Graphic Card");
	}

	@Override
	public void cost() {
		System.out.println("Cost is 1.5L Rs");
	}

}
