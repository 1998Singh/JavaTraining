package com.evoke.constructors;

public class Employee {
	String name;
	int emp_id;
	double salary;

	Employee() { // No Argument Constructor

		name = "Ram";
		emp_id = 101;
		salary = 24000;

	}

	Employee(String name, int emp_id, double salary) { // Parameterized Constructor
		this.name = name;
		this.emp_id = emp_id;
		this.salary = salary;

	}

}
