import java.util.Scanner;
public class Profits
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    final int YEAR = 365;
	    final int SOLD = 10;
	    final int BOTTLE = 12;
	    final int DECADE = 10;
	    
		System.out.print("Enter the profit per bottle: ");
		double profit = in.nextDouble();
		
		//calculate progress
		int total0 = SOLD * BOTTLE;
	    double total = profit * total0;
	    double total2 = total * YEAR;
	    double total3 = total2 * DECADE;
	    
	    System.out.printf("The profit in a day is: $%.2f\n", total);
	    System.out.printf("The profit in a year is: $%.2f\n", total2);
	    System.out.printf("The profit in ten years is: $%.2f\n", total3);
	    
	    
	    
		
	}
}
