package com.evoke.constructors;

public class TestStudents {

	public static void main(String[] args) {
		Students s1 = new Students();
		System.out.println("Student 1 :\n" + s1.name + "\n" + s1.rollno + "\n" + s1.subjects + "\n" + s1.total_marks
				+ "\n" + s1.percentage);
//		s1.Add(50, 40);
//		Students s2 = new Students("Rishabh", 20, 5, 415.68, 83.13);
//		System.out.println("\nStudent 2 :\n" + s2.name + "\n" + s2.rollno + "\n" + s2.subjects + "\n" + s2.total_marks
//				+ "\n" + s2.percentage);

		Students s3 = new Students("Daksh", 25, 5, 385.89, 76.77);
		System.out.println("\nStudent 3 :\n" + s3.name + "\n" + s3.rollno + "\n" + s3.subjects + "\n" + s3.total_marks
				+ "\n" + s3.percentage);

	}

}
