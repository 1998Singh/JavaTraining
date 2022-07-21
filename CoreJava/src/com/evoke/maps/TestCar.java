package com.evoke.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestCar {

	public static void main(String[] args) {
		
		TreeMap<Integer, Car> tree = new TreeMap<Integer, Car>();
		Car car = new Car("Jaguar", "Sedan", "Red", "XE", 250);
		Car car1 = new Car("Mercedes-Benz", "Off-Roading", "Black", "G-Wagon", 199);
		Car car2 = new Car("Range Rover", "SUV", "Red", "Discover", 209);

		tree.put(2, car);
		tree.put(3, car1);
		tree.put(1, car2);

		for (Map.Entry<Integer, Car> entry : tree.entrySet()) {
			int key = entry.getKey();
			Car cr = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(cr.getCarname() + ", " + cr.getCartype() + ", " + cr.getColour() + ", " + cr.getModel()
					+ "," + cr.getCarspeed() + "Km/h");
		}

	}

}
