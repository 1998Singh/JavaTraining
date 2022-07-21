package com.evoke.collections;

import java.util.Set;

public interface OnlineService {

	public void addOrderDetails(OrderDetails orderdetails);

	public Set<OrderDetails> getOnlineOrder();

}
