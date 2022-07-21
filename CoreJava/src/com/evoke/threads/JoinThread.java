package com.evoke.threads;

public class JoinThread extends Thread {

	public void run() 
	{

		try {

			for (int i = 1; i <= 5; i++) {

				System.out.println("Child Thread " + i);
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
