package com.evoke.maps;

public class Car {
	private String carname;
	private String cartype;
	private String colour;
	private String Model;
	private int carspeed;

	public Car(String carname, String cartype, String colour, String model, int carspeed) {
		super();
		this.carname = carname;
		this.cartype = cartype;
		this.colour = colour;
		this.Model = model;
		this.carspeed = carspeed;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getCarspeed() {
		return carspeed;
	}

	public void setCarspeed(int carspeed) {
		this.carspeed = carspeed;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", cartype=" + cartype + ", colour=" + colour + ", Model=" + Model
				+ ", carspeed=" + carspeed + "]";
	}

}
