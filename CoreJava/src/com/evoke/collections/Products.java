package com.evoke.collections;

import java.util.Set;

public class Products implements OnlineService {
	private OnlineOrder onlineorder;   // Variable

	public Products(OnlineOrder onlineorder) {
		super();
		this.onlineorder = onlineorder;
	}

	@Override
	public void addOrderDetails(OrderDetails orderdetails) {
		this.onlineorder.getOrderdetaillist().add(orderdetails);

	}

	@Override
	public Set<OrderDetails> getOnlineOrder() {
      return onlineorder.getOrderdetaillist();
	}

}
