package com.evoke.collections;

import java.util.HashSet;
import java.util.Set;

public class OnlineOrder {
	private String orderapps;
	private String ordername;
	private String ordertype;

	Set<OrderDetails> orderdetaillist = new HashSet<OrderDetails>();

	public OnlineOrder(String orderapps, String ordername, String ordertype)  // Parameterize Constructors
	{
		super();
		this.orderapps = orderapps;
		this.ordername = ordername;
		this.ordertype = ordertype;
	}

	public String getOrderapps() {
		return orderapps;
	}

	public void setOrderapps(String orderapps) {
		this.orderapps = orderapps;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public Set<OrderDetails> getOrderdetaillist() {
		return orderdetaillist;
	}

	public void setOrderdetaillist(Set<OrderDetails> orderdetaillist) {
		this.orderdetaillist = orderdetaillist;
	}

	@Override
	public String toString() {
		return "OnlineOrder [orderapps=" + orderapps + ", ordername=" + ordername + ", ordertype=" + ordertype
				+ ", orderdetaillist=" + orderdetaillist + "]";
	}

}
