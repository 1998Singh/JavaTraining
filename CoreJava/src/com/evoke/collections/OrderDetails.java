package com.evoke.collections;

import java.util.Objects;

public class OrderDetails {
	private int ram;
	private int price;
	private String core;
	private int graphiccard;

	public OrderDetails() {   // No argument Constructors

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public int getGraphiccard() {
		return graphiccard;
	}

	public void setGraphiccard(int graphiccard) {
		this.graphiccard = graphiccard;
	}

	@Override
	public String toString() {
		return "\nOrderDetails [ram = " + ram +"GB"+ ", price = " + price +"Rs"+ ", core = " + core + ", graphiccard = " + graphiccard
				+"GB"+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, ram, core, graphiccard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		OrderDetails other = (OrderDetails) obj;
		return Objects.equals(price, other.price) && Objects.equals(ram, other.ram)
				&& Objects.equals(core, other.core) & Objects.equals(graphiccard, other.graphiccard);
	}

}
