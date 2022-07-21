package com.evoke.aggression;

public class Dell implements Laptop {

	@Override
	public void brandname()   // methods
	{
		System.out.println("Dell Gaming G5 Series");
	}

	@Override
	public void getFeatureDetails() {
		System.out.println("from dell= 8GB ram, 1TB HardDisk,4 GB Graphic Card");
	}

	@Override
	public void cost() {
		System.out.println("Cost is 70k rs");
	}

}
