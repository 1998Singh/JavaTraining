package com.evoke.composition;

public class Du implements University {

	@Override
	public String universityName() {
		return "Delhi University";
	}

	@Override
	public String universityType() {
		return "Public ";
	}

	@Override
	public int getNoOfStudent() {
		return 25000;
	}

	@Override
	public String getLocation() {
		return "New Delhi";
	}

	@Override
	public int rank() {
		return 2;
	}

}
