package com.evoke.aggression;

public class TestLaptop {

	public static void main(String[] args) {

		Laptop acer = new Acer();

		acer.brandname();

		Laptop dell = new Dell();

		dell.brandname();

		GamingLaptop gaming = new GamingLaptop();
		gaming.setLaptop(dell);
        gaming.featureoflaptop();

	}

}
