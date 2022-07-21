package com.evoke.iostreams;

//FileWriter

public class Cars {
	private String carname;
	private String cartype;
	private int speed;

	public Cars(String carname, String cartype, int speed) {
		super();
		this.carname = carname;
		this.cartype = cartype;
		this.speed = speed;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Cars [carname=" + carname + ", cartype=" + cartype + ", speed=" + speed +"Km/h"+ "]";
	}

}
