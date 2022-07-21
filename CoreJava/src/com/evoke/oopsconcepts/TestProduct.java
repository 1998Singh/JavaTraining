package com.evoke.oopsconcepts;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product("Acer Predator Laptop", "Gaming Laptop", 16, 100000);
		
		System.out.println("Product Name = " + p1.getProductname() + "\nType = " + p1.getProducttype() + "\nRam = "
				+ p1.getRam() + "GB" + "\nPrice = " + p1.getPrice() + "L");
	}

}
