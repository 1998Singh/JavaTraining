package com.evoke.threads;

// Thread class provides methods to change and get the name of a thread.
//By default, each thread has a name, i.e. thread-0, thread-1 and so on.

public class ThreadNaming extends Thread {

	public void run() {
		
		System.out.println("Naming Methods in Thread");

	}

	public static void main(String[] args) {

		ThreadNaming naming = new ThreadNaming();
		ThreadNaming naming1 = new ThreadNaming();

		System.out.println("Name of naming object = " + naming.getName()); // 0
		System.out.println("Name of naming1 object  = " + naming1.getName()); // 1

		naming.start();
		naming1.start();

		naming.setName("Java");
		System.out.println("After changing the name of thread naming : " + naming.getName());

	}

}
