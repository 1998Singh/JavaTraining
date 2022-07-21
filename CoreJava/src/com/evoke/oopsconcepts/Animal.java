package com.evoke.oopsconcepts;       
// Multilevel Inheritance

public class Animal {

	void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println(" Dogs barks...");
	}
}

class BabyDog extends Dog {
	
	void play() {
		System.out.println(" BabyDog is  playing...");
	}
}
