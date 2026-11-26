import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter your number: ");
	    int num = in.nextInt();
	    int remainder = num%2;//find the remainder
	    
	    //remainder is 1 or 0
	    if (remainder == 0) {
		System.out.println("The number " + num + " is even");
	} else {
	    System.out.println("The number " + num + " is odd");
	} 
	in.close();
}
}
