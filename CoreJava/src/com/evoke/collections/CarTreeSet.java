package com.evoke.collections;

// TreeSet

public class CarTreeSet implements Comparable <Object>{
	private String carname;
	private int carcost;
	private String carmodel;

	public CarTreeSet(String carname, int carcost, String carmodel) {
		super();
		this.carname = carname;
		this.carcost = carcost;
		this.carmodel = carmodel;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getCarcost() {
		return carcost;
	}

	public void setCarcost(int carcost) {
		this.carcost = carcost;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "CarTreeSet [carname=" + carname + ", carcost=" + carcost +"Lakh" + ", carmodel=" + carmodel + "]";
	}

	@Override
	public int compareTo(Object o) {
        int carcost1 = this.carcost;
		CarTreeSet CarTreeSet = (CarTreeSet) o;
		int carcost2 = CarTreeSet.carcost;
		if (carcost1 < carcost2) {
			return -1;
		} else if (carcost1 > carcost2) {
			return 1;
		} else {
			return 0;
		}

	}

}
