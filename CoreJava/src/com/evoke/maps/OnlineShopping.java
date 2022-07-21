package com.evoke.maps;

public class OnlineShopping {

	private String productname;
	private String producttype;
	private int price;
	private String productmodel;

	public OnlineShopping(String productname, String producttype, int price, String productmodel) {
		super();
		this.productname = productname;
		this.producttype = producttype;
		this.price = price;
		this.productmodel = productmodel;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	@Override
	public String toString() {
		return "OnlineShopping [productname=" + productname + ", producttype=" + producttype + ", price=" + price
				+ ", productmodel=" + productmodel + "]";
	}

}
