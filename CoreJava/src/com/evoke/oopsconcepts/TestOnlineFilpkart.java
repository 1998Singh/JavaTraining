package com.evoke.oopsconcepts;

public class TestOnlineFilpkart {

	public static void main(String[] args) {

		OnlineShopping O1 = new Filpkart("K20 Pro", "Mobile", 28000);
		System.out.println("Order Name = " + O1.getOrdername());
		System.out.println("Order Type = " + O1.getIteamtype());
		O1.returntime();
		O1.feedback(5);

	}

}
