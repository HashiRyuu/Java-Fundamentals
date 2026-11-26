import java.util.Scanner;
public class SwapEndCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//userinput
		System.out.print("Enter a String: ");
		String word = in.nextLine();
		
		//output
		int count = word.length();
		String middle = word.substring(1, count-1);
		char first = word.charAt(0);
		char last = word.charAt(count-1);
		
		System.out.print(last + middle + first);
		in.close();
	}

}
