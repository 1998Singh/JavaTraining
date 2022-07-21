package com.evoke.threads;

public class TestSleepmethod2 {

	public static void main(String[] args) {
		
		SleepMethod2 method = new  SleepMethod2 ();
		SleepMethod2 method1 = new  SleepMethod2 ();
		
		method.start();
		method1.start();

	}

}
