package com.evoke.arrays;

public class Students {
	String name;
	int id;

	public Students(String name, int id)        // parameterize  constructor
	{
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "Students [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		Students[] stuarray = new Students[2];
		Students s1 = new Students("Daksh", 101);
		Students s2 = new Students("Abhit", 102);
		stuarray[0] = s1;
		stuarray[1] = s2;
		System.out.println(stuarray[0]);
		System.out.println(stuarray[1]);
		System.out.println(stuarray[1].getName());

	}
}
