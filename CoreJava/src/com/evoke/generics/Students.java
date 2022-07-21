package com.evoke.generics;

public class Students {
	
	private String studentname;
	private int studentrollno;
	private double studentpercentage;
	
	public Students(String studentname, int studentrollno, double studentpercentage) {
		super();
		this.studentname = studentname;
		this.studentrollno = studentrollno;
		this.studentpercentage = studentpercentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentrollno() {
		return studentrollno;
	}

	public void setStudentrollno(int studentrollno) {
		this.studentrollno = studentrollno;
	}

	public double getStudentpercentage() {
		return studentpercentage;
	}

	public void setStudentpercentage(double studentpercentage) {
		this.studentpercentage = studentpercentage;
	}

	@Override
	public String toString() {
		return "Students [studentname=" + studentname + ", studentrollno=" + studentrollno + ", studentpercentage="
				+ studentpercentage + "%"+ "]";
	}
	
	
	
	
	

}
