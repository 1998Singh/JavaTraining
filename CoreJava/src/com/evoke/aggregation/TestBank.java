package com.evoke.aggregation;

public class TestBank {

	public static void main(String[] args) {
		
		BankCompare ban = new BankCompare();   // Aggregation
		
		Bank sbi = new SBI();
		
		Bank pnb = new PNB();
		
		ban.setBank(pnb);
		int interest = ban.getrateofinterest();
		System.out.println("Bank Rate of Interest = " + interest + "%");

	}

}
