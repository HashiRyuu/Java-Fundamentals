import java.util.Scanner;
public class FuelGauge
{
	public static void main(String[] args) {
		 
	      Scanner in = new Scanner(System.in);
	      System.out.print("enter the fuel gauge reading:");
	      double fuelGauge = 0;
	      fuelGauge = in.nextDouble();
	      
	      System.out.println("first with braces");
	      
	      if (fuelGauge < 0.75) 
	      {
	    	  if (fuelGauge < 0.25) 
	    		  System.out.println("fuel is very low caution");
	    	  } 
	      else 
	      {
	    		  System.out.println("fuel over 3/4. Don't stop now!");
	    	  } 
	      
	
	      System.out.println("now without braces");
	     if (fuelGauge < 0.75) 
	    	  if (fuelGauge < 0.25) 
	    		  System.out.println("fuel is very low caution");
	      
	    	  else 
	    		  System.out.println("fuel over 3/4. Don't stop now!");
	
	  in.close();
	}
}
