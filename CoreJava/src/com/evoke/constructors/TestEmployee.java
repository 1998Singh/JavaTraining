package com.evoke.constructors;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Deepak", 101, 2500);
		Employee e3 = new Employee("Ram", 102, 30000);
		System.out.println("Employee 1 :" + e1.name + " " + e1.emp_id + " " + e1.salary);
		System.out.println("Employee 2 :" + e2.name + " " + e2.emp_id + " " + e3.salary);
		System.out.println("Employee 3 :" + e3.name + " " + e3.emp_id + " " + e3.salary);

	}

}
