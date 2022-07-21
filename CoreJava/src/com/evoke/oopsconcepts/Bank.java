package com.evoke.oopsconcepts;

abstract class Bank {
	
	abstract int getAccountNo();        // abstract method

	abstract int getRateOfInterest();   // abstract method

	String bankname = "SBI";
	String bankname1 = "PNB";
	String bankname2 = "HDFC";
	String accountholder = "Ramesh Singh";

}

class SBI extends Bank {

	int getAccountNo() 
	{
		return 12345678;
	}

	int getRateOfInterest() {
		return 7;
	}

}

class PNB extends Bank {

	int getAccountNo()
	{
		return 24567898;
	}

	int getRateOfInterest() {
		return 8;
	}

}

class HDFC extends Bank {

	int getAccountNo()
	{
		return 345678907;
	}

	int getRateOfInterest() {
		return 9;
	}

}
