package com.evoke.oopsconcepts;

public class TestInterview {

	public static void main(String[] args) {

		Interview i1 = new Interview("Wipro", "Project Engineer", 3, 3.5);

		System.out.println("Company Name = " + i1.getCompanyname() + "\nJob Role = " + i1.getJobrole()
				+ "\nNo Of Rounds = " + i1.getNoOfRound() + "\nCTC = " + i1.getCtc() + "L");

	}

}
