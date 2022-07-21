package com.evoke.iostreams;

//BufferWriter

public class Bank {
	private String bankname;
	private String accountholdername;
	private int accountno;

	public Bank(String bankname, String accountholdername, int accountno) {
		super();
		this.bankname = bankname;
		this.accountholdername = accountholdername;
		this.accountno = accountno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", accountholdername=" + accountholdername + ", accountno=" + accountno
				+ "]";
	}

}
