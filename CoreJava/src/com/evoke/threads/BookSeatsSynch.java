package com.evoke.threads;

// Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

public class BookSeatsSynch {

	int totalseats = 10;

  synchronized	void bookseat(int seats)
	{
		if (totalseats >= seats)
		{
			System.out.println("Seats Booked Successfully.....");
			
			totalseats = totalseats - seats;
			
			System.out.println("seat left " + totalseats);
		}
		else 
		{
			System.out.println("seats cannot be booked ");
			
			System.out.println("seat left " + totalseats);
		}
	}

}
