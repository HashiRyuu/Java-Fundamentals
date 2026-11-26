import java.util.*;
import java.io.*;//io package
public class IntegerFileCopy
{
	public static void main(String[] args) throws FileNotFoundException//terminate the main method if the exception occurs
	{
	    int[] array = new int[25];//create a array size of 25
	    
	    //store data in the a variable; declared a object so we can use the data
	    File input = new File("data.txt");
	    
	    //create a object so we can use to print the data in the file txt
	    PrintWriter out2 = new PrintWriter("out.txt");
	    
	    //Scanner use the data that stored in the variable input
	    Scanner in = new Scanner(input);
	    
	    //use for loop to fill the array
	    int k = 0;
	    for (int i = 0; i < array.length; i++){
	        array[i] = in.nextInt();
	        k += array[i];
	    }
	    in.close();
	    
	    //use enhanced loop to print 
	    for (int element: array)
		out2.println(element);//use out2 to print data to out.txt
		
	    out2.println("\nThe sum of numbers: " + k);
		out2.print("The average of numbers: " + k/array.length);
		
		out2.close();//important needs this at the end so the data can appear in the out.txt
	}
}
