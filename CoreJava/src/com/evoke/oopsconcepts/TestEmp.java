package com.evoke.oopsconcepts;

public class TestEmp {

	public static void main(String[] args) {
		EmpioyeeEnc  e1=new EmpioyeeEnc();
		e1.setName("Raunak Singh");
		e1.setEmpid(1234);
		e1.setDep("Java Pratice");
		e1.setSalary(25000);
		System.out.println("Name ="+e1.getName());
		System.out.println("Empid ="+e1.getEmpid());
		System.out.println("Departement ="+e1.getDep());
		System.out.println("Salary ="+e1.getSalary());
		
		System.out.println("--------------------------");
		
		EmpioyeeEnc  e2=new EmpioyeeEnc();
		e2.setName("Abhishek Saini");
		e2.setEmpid(1245);
		e2.setDep(".Net");
		e2.setSalary(30000);
		System.out.println("Name ="+e2.getName());
		System.out.println("Empid ="+e2.getEmpid());
		System.out.println("Departement ="+e2.getDep());
		System.out.println("Salary ="+e2.getSalary());
		

	}

}
