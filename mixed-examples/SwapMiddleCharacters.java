import java.util.Scanner;
public class SwapMiddleCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word of even length: ");
		String word = in.next();
		int len = word.length();
		
		//get the half or word first
	if (len % 2 == 0) 
	{	
		int countWords = len/2;
		String half = word.substring(0,countWords-1);
		String half2 = word.substring(countWords+1);
		
		//then get two middle word
	    char first = word.charAt(countWords-1);
		char second = word.charAt(countWords);
		
		System.out.println("The original word: " + word);
		System.out.println("The swapped word: " + half + second + first + half2);
		
	} else
	{
		System.out.println("The word not even length");
	}
		in.close();
	}

}
