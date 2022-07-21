package com.evoke.constructors;

public class Fruits {
	String fruitName;
	int quantity;
	int price;
	Universitys u;

	Fruits() {
		fruitName = "Mango";
		quantity = 10;
		price = 120;
	}

	Fruits(String fruitName, int quantity, int price) {

		this.fruitName = fruitName;
		this.quantity = quantity;
		this.price = price;
		u = new Universitys("GNDU", 6, 10000);

	}

	public String getfruitname() // return name of fruit
	{
		return fruitName;

	}

	public String updatefruitname(String FruitName) {
		return fruitName;
	}

	public int addquantity(int add) // return new quantity
	{
		quantity = quantity + add;
		return quantity;
	}

	public static Fruits createFruits() {
		return new Fruits("Banana", 4, 50);
	}

	public Universitys getupdate() {
		u.universityName = "PU";
		u.rank = 4;
		return u;

	}

}
