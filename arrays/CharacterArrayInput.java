import java.util.Scanner;
public class CharacterArrayInput
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.print("Please enter numbers of character that had in your first name: ");
		int l = in.nextInt();//user's input
		char[] num = new char[l];//use user's input for the array 
		
		int len = num.length;//find the length of array
		
		//using for loop for user input their name character
	    for (int i = 0; i < len; i++)
		num[i]=in.next().charAt(0);
		System.out.println("   ");
		
		//using for loop to print out user's name
		for (int i = 0; i < len; i++)
		
		System.out.print(num[i]);
		
		in.close();
	}

	
}
