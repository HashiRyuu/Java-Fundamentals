import java.util.Scanner;
public class CoinValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				//variables
				final int QUARTER = 25;
				final int DIME = 10;
				final int NICKEL = 5;
				final int PENNY = 1;
				
				//userinput
				System.out.print("Enter number of coins: ");
				int change = in.nextInt();
				
				System.out.print("Enter coin type (P,N,D or Q): ");
				String type = in.next();

				
				//process  
				switch (type) {
				case "p": case "P": 
				 double pennies = change * PENNY;
				pennies /= 100; 
				System.out.printf("You have: $ %.2f", pennies);
				break;
				
				case "n": case "N": 
				double nickles = change * NICKEL;
				nickles /= 100;
				System.out.printf("You have: $ %.2f", nickles);
				break;
				
				case "d": case "D": 
				double dimes = change * DIME;
				dimes /= 100;
				System.out.printf("You have: $ %.2f", dimes);
				break;
				
				case "q": case "Q": 
				double quaters = change * QUARTER;
				quaters /= 100;
				System.out.printf("You have: $ %.2f", quaters);
				break;
				
				default: 
					System.out.print("Error");
					
				}
				
				
				in.close();
				

			}

	}
