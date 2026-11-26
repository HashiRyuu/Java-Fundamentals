import java.util.Scanner;

public class ValidatedIntegerInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a x: ");
		
		
	if (in.hasNextInt()) {
		int str = in.nextInt();
		System.out.print("Enter a y: ");
		
	if (in.hasNextInt()) {
		int str2 = in.nextInt();
	
		int x = str;
		
		int y = str2;
		
		double equation = x + y *(Math.pow(x, 2) * Math.sqrt(y));
		
		int min = Math.min(x, y);
		
		double result = min + equation;
		
		System.out.print(result); 
	} else {
		System.out.print("error");
	} 
	
	} else {
		System.out.print("error");
	}

in.close();
	}

}
