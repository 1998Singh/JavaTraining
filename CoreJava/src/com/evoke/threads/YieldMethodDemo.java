package com.evoke.threads;

public class YieldMethodDemo extends Thread {

	public void run() {

		Thread.yield();

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {

		YieldMethodDemo y1 = new YieldMethodDemo();
		y1.start();

		// Thread.yield();

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
