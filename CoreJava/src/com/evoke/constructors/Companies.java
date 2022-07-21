package com.evoke.constructors;

public class Companies {
	String company_name;
	String emplyee_name;
	int emp_id;
	double salary;

	Companies() { // No Argument Constructor

		company_name = "Evoke";
		emplyee_name = "Rajan";
		emp_id = 121;
		salary = 20000;
	}

	Companies(String company_name, String emplyee_name, int emp_id, double salary)   // Parameterize Constructor
	{
		
		this.company_name=company_name;
		this.emplyee_name=emplyee_name;
		this.emp_id=emp_id;
		this.salary=salary;

	}
	
	public double getSalary() {
		return salary;
	}
public double addBon(double amount) {
	salary=salary+amount;
	return salary;
	
}
}
