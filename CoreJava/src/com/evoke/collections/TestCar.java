package com.evoke.collections;

import java.util.Set;

public class TestCar {

	public static void main(String[] args) {
	
		Cars car = new Cars("Jaguar", "XE", 1997);
		CarDetails cardetail = new CarDetails();
		cardetail.setEnginetype("V6");
		cardetail.setPrice(46);
		cardetail.setSpeed(250);
		CarDetails cardetail1 = new CarDetails();
		cardetail1.setEnginetype("V8");
		cardetail1.setPrice(86);
		cardetail1.setSpeed(280);

		System.out.println("Adding cardetails in hash set");

		CarService cs = new CarsDetail(car);
		System.out.println(car);
		cs.addCarDetails(cardetail1);
		cs.addCarDetails(cardetail);
		cs.addCarDetails(cardetail);  // Duplicate value
		Set<CarDetails> cardetails = cs.getCars();   // methods
		System.out.println(cardetails);
		System.out.println("size of set = " + cardetails.size());   // print the size of hash set
		System.out.println("hashcode = " + cardetail1.hashCode());  // print the hashcode value
		System.out.println("hashcode = " + cardetail.hashCode());

	}

}
