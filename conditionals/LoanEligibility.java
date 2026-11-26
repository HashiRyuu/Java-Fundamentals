import java.util.Scanner;
public class LoanEligibility
{
	public static void main(String[] args) {
		 final double MAX_SAL = 40000;
	      final double MAX_YEARS = 2;
	      
	      Scanner in = new Scanner(System.in);

	      System.out.print("Enter your salary: ");
	      
	      if (in.hasNextInt())
	      { 
	        
	         int income = in.nextInt();//define the input is number or not
	         
	         if (income >= MAX_SAL)// define salary is qualify or not 
	         {
	        	 
	             System.out.print("Enter years on the job: ");
	            if (in.hasNextInt()) 
	            {
	               int year = in.nextInt(); //define the input is number or not
	            
	               if (year >= MAX_YEARS)//define year is qualify or not
	               { 
	            
	                  System.out.print("You qualify for a loan");
	               }
	               else
	               {
	                  System.out.print("Minimum years at current job not met");
	               }
	            } 
	            
	         } else 
	        
	         {
	            System.out.print("Minimum salary requirement not met");
	         
	         }
	     
	      } 
	     in.close();
	   }
	}
