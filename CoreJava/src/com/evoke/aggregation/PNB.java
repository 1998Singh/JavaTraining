package com.evoke.aggregation;

public class PNB implements Bank {

	@Override
	public String bankname() {
		return "Punjab National Bank";
	}

	@Override
	public int accountno() {
		return 23456789;
	}

	@Override
	public String accountholdername() {
		return "Abhishek Saini";
	}

	@Override
	public int rateofinterest() {
		return 5;
	}

}
