package com.evoke.collections;
// hashSet 4
import java.util.Set;

public class CarsDetail implements CarService {
	private Cars cars;

	public CarsDetail(Cars cars) {
		super();
		this.cars = cars;
	}

	@Override
	public void addCarDetails(CarDetails CarDetails) {
		this.cars.getCardetailslist().add(CarDetails);

	}

	@Override
	public Set<CarDetails> getCars() {
		
		return this.cars.getCardetailslist();
	}

}
