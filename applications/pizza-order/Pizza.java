// Collaborative example; co-author: Cole Devine.

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Pizza 

{
	// Collaborative example; co-author: Cole Devine.

		/** Allows the user to order a pizza and produces a receipt.
 * @author Cole Devine (co-author)
 */

		public static void main(String[] args) 

		{

			Scanner in = new Scanner (System.in);

			
			//name variable

			String name;
			//size variable 

			int size;

			//total price variable

			double total = 0;

			//rate variable

			double rate = 0.0795;

			double ending = total * rate; 

			/////call one -- welcome message///////

			name = welcome();

			//discount message
			menu();
			System.out.println("");
			

			if(discount(name) == true)

			{

				System.out.println("You are eligible for a $2.00 discount.");

			}

			System.out.println("");
		

			System.out.println("What size pizza would you like?\n10, 12, 14, or 16 (enter the number only): ");

			size = in.nextInt();

			double price = pizzaPrice(size);

			if( size != 10 && size != 12 && size != 14 && size != 16)

			{

				size = 12;

			}

			//update statement -- adds price to total

			total = total + price;

			//prompt for crust USE SWITCH STATEMENT

			System.out.print("What type of crust do you want?\n(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");

			String input = in.next();
			String crust = crust(input);
			System.out.println("");

			//crust switch statementcrustType
			//top variable

			String top = "Cheese ";
			
			System.out.print("All pizzas come with cheese.\nAdditional toppings are $1.25 each, choose from: \nPepperoni, Sausage, Onion, Mushroom\n");

			//prompt for pepperoni

			System.out.print("Do you want Pepperoni? (Y/N): ");

			String pep = in.next();

			pep = pep.toUpperCase();

			if (pep.equals("Y"))

			{

				top = top + "Pepperoni ";

				total = total + 1.25;

			}

			//prompt for sausage

			System.out.print("Do you want Sausage? (Y/N): ");

			String sausage = in.next();

			sausage = sausage.toUpperCase();

			if (sausage.equals("Y"))

			{

				top = top + "Sausage ";

				total = total + 1.25;

			}
			//prompt for onion

			System.out.print("Do you want Onion? (Y/N): ");

			String onion = in.next();

			onion = onion.toUpperCase();

			if (onion.equals("Y"))

			{

				top = top + "Onion ";

				total = total + 1.25;

			}

			//prompt for mushroom

			System.out.print("Do you want Mushroom? (Y/N): ");

			String mushroom = in.next();

			mushroom = mushroom.toUpperCase();

			if (mushroom.equals("Y"))

			{

				top = top + "Mushroom ";

				total = total + 1.25;

			}
			
			System.out.println("");
			//declare discount

			if (discount(name) == true)

			{

				total = total - 2;

			}

			//return receipt

			//System.out.println();

			System.out.print("Your order is as follows: \n");

			System.out.println(size + "-inch pizza");

			System.out.println(crust + " crust");

			System.out.println(top);

			System.out.printf("The cost of your order is: $%.2f" , total);

			System.out.println();

			System.out.printf("The tax is: $%.2f" , (total * rate));

			System.out.println();

			System.out.printf("The total due is: $%.2f" , (total + (total * rate)));

			System.out.println();

			System.out.println("Your order will be ready for pickup in 30 minutes.");

		}
		

	/**

	* This method asks for their name

	* @return the name of the user

	*/
		public static String crust(String crust){

			switch (crust)

			{

			case "h": 

			case "H": crust = "Hand-tossed"; break;

			case "t":

			case "T": crust = "Thin-"; break;

			case "d":

			case "D": crust = "Deep-dish"; break;

			default: crust = "Hand-Tossed";

			}
			return crust;
			}

	public static String welcome()

	{
		
		String name;
		JOptionPane.showMessageDialog(null, "Welcome to Our Pizzeria");

		name = JOptionPane.showInputDialog("Enter your first name: ");



		//new scanner object

		

		//variable for user name

		

		//return name variable to main

		return name; 

	}


	/**

	 * this void method displays the pizza menu in our restaurant with the base cost

	 */

	//void method menu- prints menu

	public static void menu()

	{

		//size and pricing below

	    System.out.println("Pizza Size(inches)   \tCost");

	    System.out.println("\t10" + "\t\t$10.99");

	    System.out.println("\t12" + "\t\t$12.99");

	    System.out.println("\t14" + "\t\t$14.99");

	    System.out.println("\t16" + "\t\t$16.99");

	    //System.out.println();

	}


	/**

	 * this method compares the name of the customer to the owners and determines if they should receive a discount

	 * @param name: pass in the name of the customer

	 * @return: a true or false if the name of the customer matches one of the names of the owners

	 */



	public static boolean discount(String name) 

	{

		final String OWNER1 = "DemoOwner1";

		final String OWNER2 = "DemoOwner2";

		return name.equalsIgnoreCase(OWNER1) || name.equalsIgnoreCase(OWNER2);

	}

	/** This method prompts the user to enter and integer corresponding to 

	 * 	the size they desire and returns the cost

	 * 

	 * @param int size

	 * @return double cost

	 */

	public static double pizzaPrice(int size)

	{

		double price = 0;

		if (size == 10) 

		{

			price = 10.99;

		} 

		else if (size == 12) 

		{

			price = 12.99;

		} 

		else if (size == 14) 

		{

			price = 14.99;

		} 

		else if (size == 16) 

		{

			price = 16.99;

		} 

		else 

		{

			size = 12;

			return 12.99;

		}

		return price;

	}

	//end of methods

	}
