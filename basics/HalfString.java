import java.util.Scanner;
public class HalfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//userinput
		System.out.print("Please enter an even length string: ");
		String words = in.nextLine();
		
		//get half string
		int len = words.length();
		int countWords = len/2;
		String half = words.substring(0,countWords);
		
		System.out.print("Half the string is: " + half);
		
		in.close();
	}

}
