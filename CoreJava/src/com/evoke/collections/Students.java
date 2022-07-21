package com.evoke.collections;

public class Students {
	String name;
	int id;
	String branch;
	
	
	public Students(String name, int id, String branch)   // Parameterize  constructor
	{
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	

}
