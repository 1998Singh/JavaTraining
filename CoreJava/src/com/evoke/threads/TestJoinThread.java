package com.evoke.threads;

public class TestJoinThread {

	public static void main(String[] args) {

		JoinThread j1 = new JoinThread();
		j1.start();

		try {

			j1.join();

			for (int j = 1; j <= 5; j++) {
				System.out.println(" Main Thread " + j);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
