package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Takes number of items in the store
		int items_in_store = scan.nextInt();
		
		// Number of customers and total cost
		int customers = scan.nextInt();
		double total_cost = 0;
		
		// Arrays for items and prices
		double[] prices = new double[items_in_store];
		String[] names_of_items = new String[items_in_store];
		
		// Array for customer names and total cost of customers
		String[] customer_names = new String[customers];
		double[] total = new double[customers];
		
		
		// Putting the items into the arrays
		for( int i = 0; i < items_in_store; i++)
		{
			names_of_items[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		// Finding price and computing total amount
		for( int n = 0; n < customers; n++)
		{
			customer_names[n] = scan.next() + " " + scan.next();
			int numberOfItems = 0;
			numberOfItems = scan.nextInt();
			for ( int i = 0; i < numberOfItems; i ++)
			{
				total[n] += scan.nextInt() * findPrice(scan.next(), names_of_items, prices);
			}
			
			
		}
		
		
		
		// Printing out biggest, smallest and average
		System.out.println("Biggest: " + customer_names[max(total)] + "(" + String.format("%.2f", total[max(total)]) + ")");
		System.out.println("Smallest: " + customer_names[min(total)] + "(" + String.format("%.2f", total[min(total)]) + ")");
		System.out.println("Average: " + average(total) );
		
	}
	
	// Methods for max, min and average
	static double average(double total[])
	{
		double average = 0.0;
		int sum = 0;
		for (int i = 0; i < total.length; i++)
		{
			sum += total[i];
		}
		
		average = sum / total.length;
		return average;
	}
	static int max(double total[])
	{
		double max = 0;
		int tempmax = 0;
		for (int i = 0; i < total.length; i++ )
		{
			if(total[i] > max)
			{
				tempmax = i;
				max = total[i];
				
			}
		}

		return tempmax;
	}
	static int min(double total[])
	{
		double min = 0;
		int tempmin = 0;
		for (int i = 0; i < total.length; i++)
		{
			if(total[i] < min)
			{
				tempmin = i;
				min = total[i];
			}
		}
		
		return tempmin;
	}
	
	// Need helper method to find price
	static double findPrice(String foodItems, String[] names_of_items, double[] prices )
	{
		for ( int j = 0; j < names_of_items.length; j++)
		{
			if(foodItems.contentEquals(names_of_items[j]))
			{
				return prices[j];
			}
		}
		return 0;
	}
}
