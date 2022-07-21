package com.evoke.threads;

// join () is used blocks the calling of threads.

public class DrivingLicence extends Thread {

	public void run() {
		try {

			System.out.println("Medical Started");
			Thread.sleep(3000);
			System.out.println("Medical End");

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

class DrivingTest extends Thread {

	public void run() {
		try {

			System.out.println("Driving Test Started");
			Thread.sleep(5000);
			System.out.println("Driving Test  End");

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

class OfficerSignature extends Thread {

	public void run() {
		try {

			System.out.println("Officer signature  Started");
			Thread.sleep(2000);
			System.out.println("Officer signature  End");

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
