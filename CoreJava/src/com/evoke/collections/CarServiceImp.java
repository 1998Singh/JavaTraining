package com.evoke.collections;

import java.util.Set;

public class CarServiceImp implements CarServiceTree {
	private CarDetailTreeSet cardetailtreeSet;

	public CarServiceImp(CarDetailTreeSet cardetailtreeSet) {
		super();
		this.cardetailtreeSet = cardetailtreeSet;
	}

	@Override
	public void addCarDetail(CarTreeSet cartreeset) {

		this.getCarDetail().add(cartreeset);

	}

	@Override
	public Set<CarTreeSet> getCarDetail() {

		return this.cardetailtreeSet.getCardetails();
	}

}
