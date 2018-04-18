package com.pluralsight.letsgetlogical;

public class Main {

	public static void main(String[] args) {
		int students = 150;
		int rooms = 0;
		
		/*	
		 * LOGICAL AND vs CONDITIONAL LOGICAL AND
		 * 
		 *  if you use & it results in error because it will try to execute
		 *  the right side of the expression, which tries to divide by zero.
		 */
		if (rooms > 0 && students / rooms > 30)
			System.out.println("Crowded!!");
		System.out.println();
		System.out.println("** end program **");

	}

}
