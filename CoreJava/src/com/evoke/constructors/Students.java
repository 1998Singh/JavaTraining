package com.evoke.constructors;

public class Students {
	String name;
	int rollno;
	int subjects;
	double total_marks;
	double percentage;

	Students() // no argument constructor
	{
		name = "Aman";
		rollno = 1;
		subjects = 5;
		total_marks = 400;
		percentage = 80;

		name = "stu";
		rollno = 3;
		subjects = 5;
		total_marks = 400;
		percentage = 80;
	}

	Students(String name, int rollno, int subjects, double total_marks, double percentage) // Parameterize constructor
	{
		this.name = name;
		this.rollno = rollno;
		this.subjects = subjects;
		this.total_marks = total_marks;
		this.percentage = percentage;

	}

//	public void Add(int a, int b) {
//	
//		int c = a + b;
//		System.out.println("Sum Of a and b is =" + c);
//	}

}
