package com.evoke.presentation;

//Hierarchical Inheritance

public class Employee  // Parent Class
{

	double salary = 50000;

	void displaySalary() {
		System.out.println("Employee Salary: Rs." + salary);
	}
}

// child class
class FullTimeEmployee extends Employee {
	double hike = 0.50;

	void incrementSalary() {
		salary = salary + (salary * hike);
	}
}

// child class
class InternEmployee extends Employee {

	double hike = 0.25;

	void incrementSalary() {
		salary = salary + (salary * hike);
	}
}
