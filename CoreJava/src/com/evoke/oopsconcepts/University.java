package com.evoke.oopsconcepts;

public class University {
	protected String universityname;
	protected String State;
	protected int totalstudents;

	public University(String universityname, String state, int totalstudents) // Parameterize constructor
	{
		super();
		this.universityname = universityname;
		State = state;
		this.totalstudents = totalstudents;
	}

	void rank() {
		System.out.println("In Top 10 University");
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public int getTotalstudents() {
		return totalstudents;
	}

	public void setTotalstudents(int totalstudents) {
		this.totalstudents = totalstudents;
	}

}
