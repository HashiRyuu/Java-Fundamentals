import java.util.Scanner;
public class PayrollCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final double OVER_TIME_RATE = 1.5;
		final int weeklyHours = 40;
		
		//userinput total hours worked
		System.out.println("Welcome, here I will help you caculate your salary\n");
		System.out.println("How many hours did you work this week?");
		System.out.print("Enter your number: ");
		int totalHours = in.nextInt();
		
		//calculate overtime hours
		int yourOverTime = totalHours - weeklyHours;
		if (yourOverTime >= 0) {
		System.out.println("\nYour over time hours is: " + yourOverTime);
		} else {
			System.out.println("\nYour over time hours is: " + Math.max(0, yourOverTime));
		}
		
		//userinput overtime hours
		System.out.println("\nHow many hours overtime?");
		System.out.print("Enter your number: ");
		int overTimeHours = in.nextInt();
		
		//hourly wage
		System.out.println("\nWhat is your hourly wage?");
		System.out.print("Enter your number: ");
		int hourlyWage = in.nextInt();
		
		//calculate salary
		int hoursWorkNotIncludeOverTime = totalHours - overTimeHours;
		
		if (hoursWorkNotIncludeOverTime >= 40) {
		double payCheck = (hoursWorkNotIncludeOverTime * hourlyWage) + ((overTimeHours * OVER_TIME_RATE) * hourlyWage);
		System.out.printf("\nThis week I worked " + totalHours +" hours and my paycheck is %.2f ", payCheck);
		} else {
		double payCheck = (totalHours * hourlyWage) + ((overTimeHours * OVER_TIME_RATE) * hourlyWage);
		System.out.printf("\nThis week I worked " + totalHours +" hours and my paycheck is %.2f ", payCheck);
		}
		
		System.out.print("\nThank you for using!");
		in.close();
	}
		
}
