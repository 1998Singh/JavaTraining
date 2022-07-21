package com.evoke.constructors;

public class TestFruits {

	public static void main(String[] args) {
		// No Argument Constructor
		Fruits f1 = new Fruits();
		System.out.println("Fruit 1 :\n" + f1.fruitName + "\nquantity in kg= " + f1.quantity + "\nprice in Rs=" + f1.price);
		
		 String fru=f1.getfruitname();
		 System.out.println("fruit name ="+fru);
		 
		 int qunt=f1.addquantity(10);
		 System.out.println(" New Quantity ="+qunt);
		 
		Fruits frut= Fruits.createFruits();
		System.out.println(frut.fruitName);
		System.out.println(frut.price);
		
	 String fr= f1.updatefruitname("Grapes");
	System.out.println("Fruit name="+fr);
	
	
		 
		 
	
		// Parameterize Constructor
		
		Fruits f2 = new Fruits("Apple",20,285);
		System.out.println("Fruit 2 :\n" + f2.fruitName + "\nquantity in kg= " + f2.quantity + "\nprice in Rs=" + f2.price);
		Fruits f3 = new Fruits("Orange",5,60);
		System.out.println("Fruit 3 :\n" + f3.fruitName + "\nquantity in kg= " + f3.quantity + "\nprice in Rs=" + f3.price);
		System.out.println(f2.u.universityName);
		Universitys  s11=f2.getupdate();
		System.out.println(s11.universityName);
		
	//System.out.println(f2.u.universityName);
	}
	

}
