package com.evoke.iostreams;

// Buffered reader & writer

public class Student {
	private String studentname;
	private String universityname;
	private String branch;
	private int fee;

	public Student(String studentname, String universityname, String branch, int fee) {
		super();
		this.studentname = studentname;
		this.universityname = universityname;
		this.branch = branch;
		this.fee = fee;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", universityname=" + universityname + ", branch=" + branch
				+ ", fee=" + fee + "]";
	}

}
