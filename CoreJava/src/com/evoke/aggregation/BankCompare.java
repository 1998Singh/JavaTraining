package com.evoke.aggregation;

public class BankCompare {

	private Bank bank;  // variable

	public BankCompare() // constructor without parameter
	{

	}
	
	// Using getter and setter methods

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	
	public int getrateofinterest() {
		
		System.out.println("Using getter and Setter methods");
        return bank.rateofinterest();
	}

}
