import java.util.Scanner;

public class ConditionalNumberSelection {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter your value: ");
	    double num = in.nextDouble();
	    
	    if (num >2) {
		num = (num%2 == 0)? 10 : 20;
		System.out.print(num);
	} else {
		num = (num%2 == 1)? 15 : 25;
		System.out.print(num);
	}
	in.close();

	}

}
