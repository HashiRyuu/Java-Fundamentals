import java.util.*;
import java.io.*;//io package
public class TextFileTokenization
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//store data in the a variable; declared a object so we can use the data
	    File input = new File("mary.txt");
	    
	    //create a object so we can use to print the data in the file txt
	    PrintWriter out2 = new PrintWriter("output.txt");
	    
	    //create a object so we can use to print the data in the file txt
	    PrintWriter out3 = new PrintWriter("wordOutput.txt");
	    
	    //Scanner use the data that stored in the variable input
	    Scanner in = new Scanner(input);
	    
	    //Scanner use the data that stored in the variable input
	    Scanner in2 = new Scanner(input);
		
		//using while loop because we don't know the length of the data
		while(in.hasNext()) {
		out2.println(in.nextLine());//print the data to the output.txt
		}
		
		in.close();
		out2.close();//important needs this at the end so the data can appear in the out.txt
		
		//using while loop because we don't know the length of the data
		while(in2.hasNext()) {
		out3.println(in2.next());//print the data to the wordOutput.txt
		}
		
		
		in2.close();
		out3.close();//important needs this at the end so the data can appear in the out.txt
	}
}
