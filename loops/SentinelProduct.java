import java.util.Scanner;
public class SentinelProduct
{
   public static void main(String[] args)
   {  
      //declare variables
      double num = 0.0;
      double num2 = 1.0;//can't set as 0 because when multiply the value always be 0
      boolean done = true;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter any number(positive or negative), Q to quit: ");
      //loop will run until the done is false
      while (done)
      {  
    	 
    	 
    	 //sentinel; when user input not a number the loop will end  
    	 if (in.hasNextDouble()) {
    		 //doing multiply
    		 num = in.nextDouble();
    		 num2 = num2 * num;
    		 
    	 } else {
    		 System.out.printf("The product of the numbers is: %.2f", num2);
    		 done = false;
    	 }
      
      }
      in.close();      
    }   
}
