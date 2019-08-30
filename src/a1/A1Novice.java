package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		// Your code follows here.
		Scanner scan = new Scanner(System.in);

		
		// Variable for number of customers
		int num_of_customers = scan.nextInt();
		
		// Variables for first name and last name
		String first_name = "";
		String last_name = "";
		
		// Variables for number of items bought
		int num_of_items = 0;
		int num_bought = 0;
		
		// Variables for item cost
		double item_cost = 0.0;
		
		// Total Cost of items
			double total_cost = 0.0;
		
		// Array for customers
		String customers[];
		customers = new String[num_of_customers];
		
		for(int i = 0; i < num_of_customers; i++)
		{
			
			
			// Scanning first name and taking first character then last name and number of items
			first_name = Character.toString(scan.next().charAt(0));
			last_name = scan.next();
			num_of_items = scan.nextInt();
			
			for(int j = 0; j < num_of_items; j++)
			{
				// Number of items bought by the customer
				num_bought = scan.nextInt();
				
				// Name of items 
				scan.next();
				
				// Item cost
				item_cost = scan.nextDouble();
				
				// Adding together cost of items
				total_cost += item_cost * num_bought;
				
			}
			
			customers[i] = first_name + ". " + last_name + " " + String.format("%.2f", total_cost);
			
			
		}	
		
		// Print everything
		for ( int i = 0; i < customers.length; i ++)
		{
			System.out.println(customers);
		}
		
		scan.close();
	
		
	}
}
