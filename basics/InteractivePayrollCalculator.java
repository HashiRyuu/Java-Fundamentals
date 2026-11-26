import java.util.Scanner;
public class InteractivePayrollCalculator {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        boolean restart = true;
	        final double OVER_TIME_RATE = 1.5;
	        final int weeklyHours = 40;
	        while (restart) {

	           
	            System.out.println("\nWelcome, here I will help you caculate your salary\n");
	    		System.out.println("How many hours did you work this week?");
	    		System.out.print("Enter your number: ");
	    		int totalHours = in.nextInt();
	    		int yourOverTime = totalHours - weeklyHours;
	    		if (yourOverTime >= 0) {
	    		System.out.println("\nYour over time hours is: " + yourOverTime);
	    		} else {
	    			System.out.println("\nYour over time hours is: " + Math.max(0, yourOverTime));
	    		}
	    		
	    		System.out.println("How many hours overtime?");
	    		System.out.print("Enter your number: ");
	    		int overTimeHours = in.nextInt();
	    		
	    		System.out.println("What is your hourly wage?");
	    		System.out.print("Enter your number: ");
	    		int hourlyWage = in.nextInt();
	    		
	    		int hoursWorkNotIncludeOverTime = totalHours - overTimeHours;
	    		
	    		if (hoursWorkNotIncludeOverTime >= 40) {
	    		double payCheck = (hoursWorkNotIncludeOverTime * hourlyWage) + ((overTimeHours * OVER_TIME_RATE) * hourlyWage);
	    		System.out.printf("\nThis week I worked " + totalHours +" hours and my paycheck is %.2f ", payCheck);
	    		} else {
	    		double payCheck = (totalHours * hourlyWage) + ((overTimeHours * OVER_TIME_RATE) * hourlyWage);
	    		System.out.printf("\nThis week I worked " + totalHours +" hours and my paycheck is %.2f ", payCheck);
	    		}
	                
	            System.out.print("\nDo you want to restart the program? (yes/no): ");
	            String userInput = in.next();

	            if (userInput.equalsIgnoreCase("yes")) {
	                // The user wants to restart, so continue to the next iteration of the loop.
	                continue;
	                
	            } else if (userInput.equalsIgnoreCase("no")) {
	                // The user does not want to restart, so exit the loop.
	                restart = false;
	            } else {
	                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	            }
	            
	        }

	        
	        in.close();
	       
	        
	        System.out.println("Program has ended. Goodbye!");
	    }
	        
	}
