package com.evoke.oopsconcepts;   
// Hierarchial Inheritance 

public class Animals {
	void names()
	{
		System.out.println("From Animal Class");
		System.out.println("Dog");
		System.out.println("cat");
	}
}

class Dogs extends Animals {
	void bark() 
	{
		System.out.println(" From Dog Class = barking...");
	}
}

class Cats extends Animals {
	void sleep()
	{
		System.out.println("From cat class = sleeping...");
	}
	
}

