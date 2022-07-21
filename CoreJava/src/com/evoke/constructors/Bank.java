package com.evoke.constructors;

public class Bank {
	public String bankname;
	public String bankholder_name;
	public int bankaccount_number;
	public double bank_balance;

	public Bank() // No Argument Constructor
	{
		bankname = "State Bank Of India";
		bankholder_name = "Raj Sharma";
		bankaccount_number = 1234567;
		bank_balance = 100000.67;

	}

	public Bank(String bankname, String bankholder_name, int bankaccount_number, double bank_balance) // Parameterize
	// constructor
	{
		this.bankname = bankname;
		this.bankholder_name = bankholder_name;
		this.bankaccount_number = bankaccount_number;
		this.bank_balance = bank_balance;

	}
	

	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankholder_name=" + bankholder_name + ", bankaccount_number="
				+ bankaccount_number + ", bank_balance=" + bank_balance + "]";
	}

	public void displaybankname() {
		System.out.println("bank name is " + bankname);
	}

	public void balanceadd(int amount) {
		bank_balance = bank_balance + amount;
		System.out.println("balance is" + bank_balance);
	}

}
