package com.evoke.composition;

public class TestUniversity {

	public static void main(String[] args) {

		University cu = new Cu();
		
		System.out.println("University Name = "+cu.universityName()+" , "+ "Location = "+cu.getLocation());
		
		System.out.println("----------------------------------------------");

		University du = new Du();
		
		System.out.println("University Name = "+du.universityName()+" , " +"Location = "+du.getLocation());
		
		System.out.println("----------------------------------------------");
		
		UniversityCompare uc1= new UniversityCompare(du);   // Composition 
		
		System.out.println("University Rank = "+uc1.getUniversityRank());
			
		}
	}


