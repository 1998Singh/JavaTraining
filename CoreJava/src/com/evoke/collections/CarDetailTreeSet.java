package com.evoke.collections;

import java.util.Set;
import java.util.TreeSet;

public class CarDetailTreeSet {
	private int carcc;
	private String enginetype;

	Set<CarTreeSet> cardetails = new TreeSet<CarTreeSet>();

	public CarDetailTreeSet(int carcc, String enginetype) {
		super();
		this.carcc = carcc;
		this.enginetype = enginetype;

	}

	public int getCarcc() {
		return carcc;
	}

	public void setCarcc(int carcc) {
		this.carcc = carcc;
	}

	public String getEnginetype() {
		return enginetype;
	}

	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}

	public Set<CarTreeSet> getCardetails() {
		return cardetails;
	}

	public void setCardetails(Set<CarTreeSet> cardetails) {
		this.cardetails = cardetails;
	}

	@Override
	public String toString() {
		return "CarDetailTreeSet [carcc=" + carcc + "cc" + ", enginetype=" + enginetype + ", cardetails=" + cardetails
				+ "]";
	}

}
