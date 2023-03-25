	//
	// Copyright (c) 2023 Promineo Tech
	// Author:  Promineo Tech Academic Team
	// Subject:  Variables & Operations Lab
	// Java Week 01 Lab  
	//
	package week01;

	public class Week01VariablesAndOperationsLab {

		public static void main(String[] args) {

			// 1. Create a variable to hold the quantity of 
			//		available plane seats left on a flight		
			int available_seats = 6;

			
			// 2. Create a variable to hold the cost of groceries at checkout
			double cost_at_checkout = 124.56;

			
			// 3. Create a variable to hold a person's middle initial
			char middle_initial = 'J';

		
			// 4. Create a variable to hold true if it's hot outside 
			//		and false if it's cold outside
			int outside_temp_high = 85;
			boolean hot_outside = outside_temp_high == 85;
			boolean not_hot_outside = outside_temp_high == 65;
			
			
			// 5. Create a variable to hold a customer's first name
			String first_name = "Steve"; 

			
			// 6. Create a variable to hold a street address
			String street_address = "600 Main";
			

			// 7. Print all variables to the console
			System.out.println(available_seats);
			System.out.println(cost_at_checkout);
			System.out.println(middle_initial);
			System.out.println(hot_outside);
			System.out.println(not_hot_outside);
			System.out.println(first_name);
			System.out.println(street_address);
		

			// 8. A customer booked 2 plane seats, 
			//		remove 2 seats from the available seats variable
			available_seats = available_seats - 2;
		

			// 9. Impulse candy bar purchase, add 2.15 to the grocery total
			// 		costOfGroceries = costOfGroceries + 2.15;
			cost_at_checkout = cost_at_checkout +2.15;


			// 10.  The birth certificate was printed incorrectly, 
			//		change the middle initial to something else
			System.out.println(middle_initial == 'K');
			

			// 11.  The season has changed, update the hot outside 
			//			variable to be opposite of what it was
			int outside_temp_low = 65;
			boolean cold_outside = outside_temp_low == 65;
			boolean not_cold_outside = outside_temp_low == 85;
			System.out.println(cold_outside);
			System.out.println(not_cold_outside);

			// 12.  Create a new variable called full name using the customer's first name, 
			//			the middle initial, and a last name of your choice
			String full_name = first_name + " " + middle_initial + " " + "Smith";
		

			// 13.  Print a line to the console that introduces the customer and says they live
			// 			at the address variable
			System.out.println();

			
			
		}
	}