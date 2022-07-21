package com.evoke.oopsconcepts;

final public class Product {
	
	private final String productname;
	private final String producttype;
	private final int ram;
	private final int price;

	public Product(String productname, String producttype, int ram, int price) {
		super();
		this.productname = productname;
		this.producttype = producttype;
		this.ram = ram;
		this.price = price;

	}

	public String getProductname() {
		return productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public int getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}

}
