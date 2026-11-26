import java.util.Scanner;
public class HourConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//variables
		final int HOUR = 1;
		final int WEEK = 168;
		final int DAY = 24;
	
		//userinput
		System.out.print("Enter a number of hours\n");
		int time = in.nextInt();
		int calculate = time;
		
		//calculate
		int weeks = calculate/WEEK;
		calculate = calculate%WEEK;
		
		int days = calculate/DAY;
		calculate = calculate%DAY;
		
		int hours = calculate/HOUR;
		calculate = calculate%HOUR;
		
		
		System.out.println("" + time + " hours is " + weeks +" weeks , "+ days + " days, and " + hours + " hours");
		
		in.close();

	}

}
