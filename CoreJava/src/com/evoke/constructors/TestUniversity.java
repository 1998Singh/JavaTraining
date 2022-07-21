package com.evoke.constructors;

public class TestUniversity {

	public static void main(String[] args) {

		// no argument constructor and method
		Universitys u1 = new Universitys();
		System.out.println("University 1 :\n" + u1.universityName + "\n" + u1.rank + "\n" + u1.totalStudents);

		String uname = u1.getUniversityname();
		System.out.println("university name = " + uname);

		String updatename = u1.updateUniversityname("Delhi University");
		System.out.println(" the  updated university name = " + updatename);

		String rak = u1.getUniversityname(1);
		System.out.println("university name = " + rak);

		Universitys univ = Universitys.createUniversity();
		System.out.println(univ.universityName);
		System.out.println(univ.rank);

		// Parameterize Constructor

		Universitys u2 = new Universitys("Punjab University", 2, 8000);
		System.out.println("University 2 : \n" + u2.universityName + "\n" + u2.rank + "\n" + u2.totalStudents);

		int total = u2.addStudents(500);
		System.out.println("\n new total =" + total);

	}

}
