package com.evoke.composition;

public class Cu implements University {

	@Override
	public String universityName() {
		return "Chandigarh University";
	}

	@Override
	public String universityType() {
		return "Private";
	}

	@Override
	public int getNoOfStudent() {
		return 20000;
	}

	@Override
	public String getLocation() {
		return "Mohali Punjab";
	}

	@Override
	public int rank() {
		return 1;
	}

}
