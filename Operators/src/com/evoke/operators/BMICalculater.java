package com.evoke.operators;

public class BMICalculater {

	// bmi = weight in kg*(height*height)

	public static void main(String[] args) {
		double height = 5.9;
		double weight = 65;

		double heightInMeters = height * 0.4536;

		double bmi = weight * (heightInMeters * heightInMeters);
		System.out.println("bmi =" + bmi);

	}

}
