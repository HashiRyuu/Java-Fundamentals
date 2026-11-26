import java.util.Scanner;
public class ArrayElementCounts
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

		int[] num = {4,0,7,2,11,6,0,3,0,9};
		
		//declared variables
		int len = num.length;
		int zeroCounter = 0;
		int oddCounter = 0;
		
		 //using an for loop to tranverse through my entire array
	    for (int i = 0; i < len; i++){
	    	
	    	//check if there is zero in the array
	        if (num[i] == 0){ 
	            zeroCounter++;
	        }
	        
	        //check if there are odd numbers in the array
	        if(num[i]%2 == 1){
	            oddCounter++;
	        }
	    }
	   	
		System.out.println("The array contains " + zeroCounter + " zeros.");
		System.out.println("The array contains " + oddCounter + " odd numbers.");
		
		in.close();
	}

	
}
