package com.evoke.oopsconcepts;

public class Cu extends University {

	public Cu(String universityname, String state, int totalstudents) {
		super(universityname, state, totalstudents);
	}

	void rank()   // method Overriding
	{
		System.out.println("In top 5 University");
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public int getTotalstudents() // method Overriding
	{
		return totalstudents;
	}

	public void setTotalstudents(int totalstudents) {
		this.totalstudents = totalstudents;
	}

}
