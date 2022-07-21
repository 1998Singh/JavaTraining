package com.evoke.threads;

public class SleepMethod2 extends Thread {

	public void run() {
		try {
			
			for (int i = 0; i <= 5; i++)
			{
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}

		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
