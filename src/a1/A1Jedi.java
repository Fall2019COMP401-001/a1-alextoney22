package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Number of items input
		int item_count = 0;
		item_count = scan.nextInt();
		
		// Arrays for items
		String[] names_of_items = new String[item_count];
		double[] price_of_items = new double[item_count];
		int[] number_of_items = new int[item_count];
		
		// Need loop to determine items in arrays
		for( int i = 0; i < item_count; i++)
		{
			names_of_items[i] = scan.next();
			price_of_items[i] = scan.nextDouble();
		}
		
		// Customer count input after item arrays
		int customer_count = 0;
		customer_count = scan.nextInt();
		
		// Arrays for customers
		String[] first_name = new String[customer_count];
		String[] last_name = new String[customer_count];
		
		// Number of items bought
		int[] number_bought_by_customer = new int[item_count];
		
		// need boolean for items already bought
		boolean[] item_already_bought = new boolean[item_count];
		
		// Need item name array
		String[] item_name = new String[item_count];
		
		// Need number bought variable
		int number_bought = 0;
		
		// Taking each name of item and adding them together with boolean to test if already bought or not
		for (int i = 0; i < customer_count; i++)
		{
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			number_bought = scan.nextInt();
			int[] amount = new int[number_bought];
			for (int n = 0; n < number_bought; n ++)
			{
				amount[n] = scan.nextInt();
				item_name[n] = scan.next();
				for (int j = 0; j < item_count; j ++)
				{
					if(item_name[n].equals(names_of_items[j]))
					{
						number_of_items[j] += amount[n];
						if (!item_already_bought[j])
						{
							item_already_bought[j] = true;
							number_bought_by_customer[j] ++;
						}
					}
				}
			}
			// reset items to false
			for (int k = 0; k < item_already_bought.length; k ++ )
			{
				item_already_bought[k] = false;
			}
		}

		// Reset each item in array to false
		for(int i = 0; i < item_already_bought.length; i ++)
		{
			item_already_bought[i] = false;
		}
		
		// Printing out the specific amount of items customers bought
		for (int i = 0; i < item_count; i ++)
		{
			if (number_of_items[i] == 0)
			{
				System.out.println("No customers bought " + names_of_items[i]);
			}
			else
			{
				System.out.println(number_bought_by_customer[i] +" customers bought" + number_of_items[i] + " " + names_of_items[i] );
			}
		}
	}
}
