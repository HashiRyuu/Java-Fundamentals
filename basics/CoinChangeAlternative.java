import java.util.Scanner;
public class CoinChangeAlternative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//variables
		final int DOLLAR =100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;
		
		//userinput
		System.out.print("How many pennies do you have: ");
		int change = in.nextInt();
		
		//calculate
		int dollars = change/DOLLAR;
		change = change%DOLLAR;
		
		int quarters = change/QUARTER;
		change = change%QUARTER;
		
		int dimes = change/DIME;
		change = change%DIME;
		
		int nickels = change/NICKEL;
		change = change%NICKEL;
		
		int pennies = change/PENNY;
		change = change%PENNY;
		
		System.out.println("Your change is " + dollars + " dollar, " + quarters + " quarer, " + dimes + " dime, " + nickels + " nickel, " + pennies + " pennies.");
		
		in.close();

	}

}
