import java.util.Scanner;
public class MaximumWithRetry
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    //declare the variables 
	    boolean done = true;
	    int num = 0;
	    int max = 0;
	  
	    
	    //repeat until the done is false
	    while (done) {
	    	System.out.print("Enter a positive number, -1 to finish: ");
	        num = in.nextInt();
	        
	        //if user input -1 the loop will end
	       if (num > 0){
	          
	    	   //stored the maximum number to compared the user's input number
	            if (max < num) {
	            	max = num;
	            }
	            //max = Math.max(max, num);
	        } else if ( num < 0)
	        	{
	        		System.out.println("Do you want to try again? Press y to continue or n to stop");
	        		String answer = in.next();
	        		if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")) {
	        			System.out.print("Enter a positive number, -1 to finish: ");
	        			num = in.nextInt();
	        			if (max < num) {
	    	            	max = num;
	    	            }
	        		} 
	        		
	        		else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n"))
	        		{
	        			System.out.print("the maximun number is: " + max);
	        			done = false;
	        		} 

	        		else 
	        		{
	        			System.out.println("Incorecct input please try again");
	        			System.out.println("Press y for yes, n for no");
	        			answer = in.next();
	        			if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")) {
		        			System.out.print("Enter a positive number, -1 to finish: ");
		        			num = in.nextInt();
		        			if (max < num) {
		    	            	max = num;
		    	            }
		        		} 
	        			else
		        		{
		        			System.out.print("the maximun number is: " + max);
		        			done = false;
		        		} 
	        			
	        		}
	        	}
	        	
	    }
		in.close();
	}
}
