import java.util.Scanner;

public class EnhancedForElementCounts {
	
	public static void main(String[] args) {
			    Scanner in = new Scanner(System.in);
				int[] num = {4,0,7,2,11,6,0,3,0,9};
				
				//int len = num.length; using enhanced for loop no needs to find length
				
				//declared variables
				int zeroCounter = 0;
				int oddCounter = 0;
				
			   //using an enhanced for loop to tranverse through my entire array
			   for(int element : num){
				   
				 //check if there is zero in the array
			       if (element == 0){
			           zeroCounter++;
			       } 
			       
			       //check if there are odd numbers in the array
			       if(element % 2 == 1){
			           oddCounter++;
			       }
			   }
			
				
			   System.out.println("The array contains " + zeroCounter + " zeros.");
			   System.out.println("The array contains " + oddCounter + " odd numbers.");
				
				in.close();
	 }

			
}
