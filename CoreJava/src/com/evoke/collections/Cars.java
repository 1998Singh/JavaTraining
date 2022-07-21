package com.evoke.collections;
// hashset example using interface . 2
import java.util.HashSet;
import java.util.Set;

public class Cars {

	private String carname;
	private String model;
	private int cc;
	
	Set<CarDetails> cardetailslist = new HashSet<CarDetails>();

	public Cars(String carname, String model, int cc) // Parameterized Constructor
	{
		super();
		this.carname = carname;
		this.model = model;
		this.cc = cc;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Set<CarDetails> getCardetailslist() {
		return cardetailslist;
	}

	public void setCardetailslist(Set<CarDetails> cardetailslist) {
		this.cardetailslist = cardetailslist;
	}

	@Override
	public String toString() {
		return "Cars [carname=" + carname + ", model=" + model + ", cc=" + cc + ", cardetailslist=" + cardetailslist
				+ "]";
	}

}
