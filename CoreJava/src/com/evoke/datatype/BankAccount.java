package com.evoke.datatype;

public class BankAccount {

	static String bankname = "HDFC BANK";
	String AccountHolderName;
	String AccountNumber;
	float Balance;

	public static void main(String[] args) {
		System.out.println(BankAccount.bankname);
		BankAccount bankaccount = new BankAccount();
		bankaccount.AccountHolderName = "john";
		bankaccount.AccountNumber = "123456789";
		bankaccount.Balance = 25000f;
		System.out.println(bankaccount.AccountHolderName);
		System.out.println(bankaccount.AccountNumber);
		System.out.println(bankaccount.Balance);

	}

}
