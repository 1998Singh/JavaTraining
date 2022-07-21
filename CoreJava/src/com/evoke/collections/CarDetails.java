package com.evoke.collections;
// Hashset example 1
import java.util.Objects;

public class CarDetails {
	private String enginetype;
	private int price;
	private int speed;

	public CarDetails() {         // No argument constructors

	}

	public String getEnginetype() {
		return enginetype;
	}

	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "CarDetails [enginetype=" + enginetype + ", price=" + price +"L"+ ", speed=" + speed + "Km/h"+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, speed, enginetype);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		CarDetails other = (CarDetails) obj;
		return Objects.equals(price, other.price) && Objects.equals(speed, other.speed)
				&& Objects.equals(enginetype, other.enginetype);

	}

}
