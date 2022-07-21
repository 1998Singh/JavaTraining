package com.evoke.collections;

import java.util.Set;

public class TestOnline {

	public static void main(String[] args) {
	
		OnlineOrder online = new OnlineOrder("FlipKart", "Laptop", "Electronics");
		OrderDetails odetails = new OrderDetails();
		odetails.setCore("Intel Core ");
		odetails.setGraphiccard(4);
		odetails.setPrice(100000);
		odetails.setRam(16);
		OrderDetails odetails1 = new OrderDetails();
		odetails1.setCore("AMD Core ");
		odetails1.setGraphiccard(4);
		odetails1.setPrice(60000);
		odetails1.setRam(16);

		System.out.println("Adding Orderdetails in hash set");

		OnlineService os = new Products(online);
		System.out.println(online);
		os.addOrderDetails(odetails);
		os.addOrderDetails(odetails1);
		os.addOrderDetails(odetails1);  // Duplicate Value
		Set<OrderDetails> detail = os.getOnlineOrder();
		System.out.println(detail);
		System.out.println("size of set = " + detail.size()); // print the size of hash set
		System.out.println("hashcode = " + odetails1.hashCode()); // print the Hashcode value
		System.out.println("hashcode = " + odetails.hashCode());  // print the Hashcode value

	}

}
