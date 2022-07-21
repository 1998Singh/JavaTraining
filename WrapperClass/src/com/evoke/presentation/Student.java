package com.evoke.presentation;

public class Student {
	private String studentname;
	private int rollno;
	private String school;
	public Student(String studentname, int rollno, String school) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.school = school;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", school=" + school + "]";
	}
	

}
