package com.evoke.constructors;

public class TestBank {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		b1.displaybankname();
		// Bank b2=new Bank();
		b1.balanceadd(18000);
		Bank b3 = new Bank("sbi", "raj", 12345, 12778.99);
		System.out.println("Bank 2 =" + b3.bankname + "\n" + b3.bankholder_name + "\n" + b3.bankaccount_number + "\n"
				+ b3.bank_balance);
	}

}
