import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//userinput
		System.out.print("Enter a temperature in Fahrenheit: ");
		double fahrenheit = in.nextDouble();
		
		//calculate
		double celTemp = (fahrenheit - 32) * 5/9;
		System.out.printf("The temperature in Celsius is: %.3f", celTemp);
		in.close();
	}

}
