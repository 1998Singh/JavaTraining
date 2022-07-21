package com.evoke.collections;

import java.util.Set;

public class TestCarTree {

	public static void main(String[] args) {

		CarDetailTreeSet cardetail = new CarDetailTreeSet(49999, "V6 engine");

		CarTreeSet cartreeset = new CarTreeSet("Jaguar F-Phace", 7400000, "SVR");
		CarTreeSet cartreeset1 = new CarTreeSet("Audi", 6000000, "A4");
		CarTreeSet cartreeset2 = new CarTreeSet("Land Rover ", 8600000, "Defender");

		CarServiceTree carimp = new CarServiceImp(cardetail);
		carimp.addCarDetail(cartreeset);
		carimp.addCarDetail(cartreeset1);
		carimp.addCarDetail(cartreeset2);
		carimp.addCarDetail(cartreeset2); // duplicate value

		Set<CarTreeSet> cardetails = carimp.getCarDetail();

		System.out.println("Size is = " + cardetails.size());

		for (CarTreeSet car : cardetails) {
			System.out.println(car);
		}

	}

}
