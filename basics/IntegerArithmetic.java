import java.util.Scanner;
public class IntegerArithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//userinput
		System.out.print("Enter the your first interger: ");
		int firstNumber = input.nextInt();
		
		//userinput
		System.out.print("Enter the your second interger: ");
		int secondNumber = input.nextInt();
		
		//sum
		int sum = firstNumber + secondNumber;
		System.out.println("The sum of your two intergers is " + sum);
		
		//product
		int product = firstNumber * secondNumber;
		System.out.println("The product of your two intergers is " + product);
		
		//quotient
		int quotient = firstNumber / secondNumber;
		System.out.println("The quotient of your two intergers is " + quotient);
		
		//modulus
		int modulus = firstNumber % secondNumber;
		System.out.println("The modulus of your two intergers is " + modulus);
		input.close();
	}

}
