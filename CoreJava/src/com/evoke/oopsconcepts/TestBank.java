package com.evoke.oopsconcepts;

public class TestBank {

	public static void main(String[] args) {

		Bank b1 = new SBI();
		System.out.println("Bank name =" + b1.bankname);
		System.out.println("Bank Accountholdername =" + b1.accountholder);
		System.out.println("Bank AccountNo =" + b1.getAccountNo());
		System.out.println("Rate of Interest SBI  is = " + b1.getRateOfInterest() + "%");
		System.out.println("--------------------------");

		Bank b2 = new PNB();
		System.out.println("Bank name =" + b2.bankname1);
		System.out.println("Bank Accountholdername =" + b2.accountholder);
		System.out.println("Bank AccountNo =" + b2.getAccountNo());
		System.out.println("Rate of Interest PNB is = " + b2.getRateOfInterest() + "%");
		System.out.println("----------------------------");

		Bank b3 = new HDFC();
		System.out.println("Bank name =" + b3.bankname2);
		System.out.println("Bank Accountholdername =" + b3.accountholder);
		System.out.println("Bank AccountNo =" + b3.getAccountNo());
		System.out.println("Rate of Interest HDFC is = " + b3.getRateOfInterest() + "%");
	}

}
