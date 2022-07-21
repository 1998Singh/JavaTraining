package com.evoke.aggregation;

public class SBI implements Bank {

	@Override
	public String bankname() {
		return "State Bank Of India";
	}

	@Override
	public int accountno() {
		return 123456;
	}

	@Override
	public String accountholdername() {
		return "Pavan";
	}

	@Override
	public int rateofinterest() {
		return 7;
	}

}
