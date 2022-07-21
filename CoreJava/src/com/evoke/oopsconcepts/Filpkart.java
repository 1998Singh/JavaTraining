package com.evoke.oopsconcepts;

public class Filpkart extends OnlineShopping {
	protected double rating;

	public Filpkart(String ordername, String iteamtype, int price) {
		super(ordername, iteamtype, price);
	}

	void returntime() // Method Overriding
	{
		System.out.println("7 days from date of Purchase ");
	}

	void feedback(int feedback) {
		if (feedback == 5)
			System.out.println("Best product u can buy it ");
		else
			System.out.println("Average Product");
	}

	public String getOrdername() // method Overriding
	{
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

}
