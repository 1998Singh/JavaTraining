package com.evoke.composition;

public class UniversityCompare {
	
	private University university; //variable

	
	public UniversityCompare(University university)  // Parameterized Constructor
	{
		this.university = university;
	}
	
	
	public int getUniversityRank() {
		return university.rank();
		
	}

}
