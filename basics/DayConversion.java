import java.util.Scanner;
public class DayConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//variables
		final int minutes = 60;
		final int hours = 24;
		final int seconds = 60;
		
		//userinput
		System.out.print("Enter a number of days: ");
		int days = in.nextInt();
		
		//calculate
		int dayToHour = days * hours;
		int hourToMinute = dayToHour * minutes;
		int minuteToSecond = hourToMinute * seconds;
		System.out.print(days + " days is " + dayToHour + " hours or " + hourToMinute + " minutes or " + minuteToSecond + " seconds");
		in.close();
	}

}
