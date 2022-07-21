package com.evoke.oopsconcepts;

//Run Time Polymorphism (Method Overriding)

public class OnlineShopping {
	protected String ordername;
	protected String iteamtype;
	protected int price;

	public OnlineShopping(String ordername, String iteamtype, int price) //Parameterize constructor
	{
		super();
		this.ordername = ordername;
		this.iteamtype = iteamtype;
		this.price = price;
	}

	void returntime() {
		System.out.println("30days from date of purchase");
	}

	void feedback(int feedback) {
		if (feedback == 5)
			System.out.println("Best product u can buy it ");
		else
			System.out.println("Average Product");
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getIteamtype() {
		return iteamtype;
	}

	public void setIteamtype(String iteamtype) {
		this.iteamtype = iteamtype;
	}

}
