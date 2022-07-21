package com.evoke.threads;

public class SleepMethodDemo extends Thread {

	public void run() {

		try {

			for (int i = 0; i <= 5; i++) {

				Thread.sleep(1000); // sleep for 1000 milsec.

				System.out.println(i);

			}
		}

		catch (

		InterruptedException e) {
			
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		SleepMethodDemo method = new SleepMethodDemo();

		method.start();

	}

}
