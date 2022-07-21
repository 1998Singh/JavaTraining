package com.evoke.constructors;

public class TestCompanies {

	public static void main(String[] args) {
		Companies c1 = new Companies();
		System.out.println(
				"Company 1 :\n" + c1.company_name + "\n" + c1.emplyee_name + "\n" + c1.emp_id + "\n" + c1.salary);

		double sal = c1.getSalary();
		System.out.println("\nsalary is ="+sal);

		double netamount = c1.addBon(5000);
		System.out.println("\nnet salary ="+netamount);

		// Parameterize constructor

		Companies c2 = new Companies("Wipro", "Hritick", 112, 25000);

		System.out.println(
				"\nCompany 2 :\n" + c2.company_name + "\n" + c2.emplyee_name + "\n" + c2.emp_id + "\n" + c2.salary);

	}

}
