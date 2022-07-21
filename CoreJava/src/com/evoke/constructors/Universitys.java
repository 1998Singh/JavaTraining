package com.evoke.constructors;

public class Universitys {
	String universityName;
	int rank;
	int totalStudents;
	Students s1;

	Universitys() // No argument constructor
	{
		universityName = "Chandigarh University";
		rank = 1;
		totalStudents = 6000;
		s1 = new Students("Raja", 5, 5, 455, 91);
	}

	Universitys(String universityName, int rank, int totalStudents) // Parameterize Constructor
	{
		this.universityName = universityName;
		this.rank = rank;
		this.totalStudents = totalStudents;

	}

	public String getUniversityname() // method to get university name
	{
		return universityName;
	}

	public String updateUniversityname(String universityName) // method to update University name
	{
		return universityName;
	}

	public String getUniversityname(int rank) // method get university name and rank
	{
		return universityName + " " + "rank is " + rank;
	}

	public int addStudents(int add) // method to add more students
	{
		totalStudents = totalStudents + add;
		return totalStudents;

	}

	public static Universitys createUniversity() {
		return new Universitys("LPU", 3, 5000);
	}

	public Bank updateBank(Bank b1) {
		b1.bankname = "ICICI BANK";
		return b1;

	}

	public Universitys(Students s1) {
		s1.name = "Pavan";
	}
}
