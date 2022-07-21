package com.evoke.maps;

import java.util.*;

public class TestOnline {

	public static void main(String[] args) {

		Map<Integer, OnlineShopping> map = new LinkedHashMap<Integer, OnlineShopping>();

		OnlineShopping online = new OnlineShopping("Laptops", "Electronics", 120000, "Acer Predator");
		OnlineShopping online1 = new OnlineShopping("Mobiles", "Electronics", 150000, "I Phone");
		OnlineShopping online2 = new OnlineShopping("Sports Kits", "Sports", 50000, " Crickets");

		map.put(1, online);
		map.put(2, online2);
		map.put(3, online1);

		for (Map.Entry<Integer, OnlineShopping> entry : map.entrySet()) {
			int key = entry.getKey();
			OnlineShopping os = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(os.getProductname() + ", " + os.getProducttype() + ", " + os.getPrice() +"Rs" + ", " + os.getProductmodel());

		}

	}

}
