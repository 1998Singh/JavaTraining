package com.evoke.oopsconcepts;

//Immutable class 

final public class Interview {

	private final String companyname;
	private final String jobrole;
	private final int noOfRound;
	private final double ctc;

	public Interview(String companyname, String jobrole, int noOfRound, double ctc) {
		super();
		this.companyname = companyname;
		this.jobrole = jobrole;
		this.noOfRound = noOfRound;
		this.ctc = ctc;
	}

	public String getCompanyname() {
		return companyname;
	}

	public String getJobrole() {
		return jobrole;
	}

	public int getNoOfRound() {
		return noOfRound;
	}

	public double getCtc() {
		return ctc;
	}

}
