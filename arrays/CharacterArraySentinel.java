import java.util.Scanner;
public class CharacterArraySentinel
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.print("Enter up to 10 characters and end with a period: ");

		//declared variables
		char[] symbols = new char[10];
		boolean check = true;
		//int len = symbols.length;
		char letter = ' ';
		int index = 0;
		
		//using while loop for user's input
		while(check != false ){
			
			letter = in.next().charAt(0);//user input character
			
			
			//sentinel to stop 
			if(letter != '.')
			{
				 symbols[index] = letter;//user's input will be put into the array
				 index++;//update slot for user input in the array  
		 
		    } else {
		    	check = false;//when the sentinel triggered
		    }
		}
		
		//when user don't put anything
		if (index == 0) {
			System.out.println("The array is empty");
		}
		//using the for loop to print out the character contain in the array
		//using index to print character place that in the array
		for (int i = index -1; i >= 0; i--) {
		     System.out.print(symbols[i] + " ");
		} 
		
		in.close();
        }
	
	}
