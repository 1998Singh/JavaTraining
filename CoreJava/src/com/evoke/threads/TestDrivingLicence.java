package com.evoke.threads;

public class TestDrivingLicence {

	public static void main(String[] args) throws InterruptedException  {

		DrivingLicence dl = new DrivingLicence();
		dl.start();
		dl.join();

		DrivingTest dt = new DrivingTest();
		dt.start();
		dt.join();

		OfficerSignature os = new OfficerSignature();
		os.start();

	}

}
