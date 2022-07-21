package com.evoke.maps;

public class Student {
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}


	public Integer getMarks() {
		return marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}

