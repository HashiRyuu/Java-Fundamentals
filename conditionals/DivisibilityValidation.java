import java.util.Scanner;

public class DivisibilityValidation
{
   public static void main(String[] args)
   {   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers, I’ll check if one is divisible by the other: ");

        if (in.hasNextInt()) {
            	  
                 int num = in.nextInt();//define number or not
                
                 if (in.hasNextInt()) {
                	 
                	 int num2 = in.nextInt();//define number or not
                	 
                	 if (num % num2 == 0) //find it divisible or not 
                		 { 
                		 
                		 System.out.print("" + num + " and " + num2 + " are divisible");
                	 } else if (num2 % num == 0) //find it divisible or not 
                	 	{
                	     System.out.print("" + num2 + " and " + num + " are divisible");
                	    } else {
                		 
                    System.out.print("" + num + " and " + num2 + " are not divisible");
                	 }
                 } else {
                	 System.out.print("Input is not an integer");
                 }
              }

              else {  
                    System.out.print("Input is not an integer");
              }
              
          
     in.close();
   }
}
