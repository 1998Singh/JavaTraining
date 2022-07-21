package com.evoke.oopsconcepts;

public class Students {
	private String name;
	private int rollno;
	private String branch;
	private double percentage;

	public Students()    // No Argument Constructor
	
	{

		name = "Ram";
		rollno = 1;
		branch = "PCM";
		percentage = 80;

	}

	public Students(String name, int rollno, String branch, double percentage)     // Parameterize Constructor
	
	{

		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.percentage = percentage;
	}

	public static void main(String[] args) {

		Students s1 = new Students();
		System.out.println("Name = " + s1.name + "\nRollno = " + s1.rollno + "\nBranch =" + s1.branch
				+ "\nPercentage = " + s1.percentage + "%");

		System.out.println("------------------------------------------");

		Students s2 = new Students("Abhishek", 2, "PCB", 86.9);
		System.out.println("Name = " + s2.name + "\nRollno = " + s2.rollno + "\nBranch =" + s2.branch
				+ "\nPercentage = " + s2.percentage + "%");

	}
}
