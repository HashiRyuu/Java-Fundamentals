public class PowerTable {

	public static void main(String[] args) {
		
		//Header 
		 System.out.println("power 1" + "\t| " + "power 2"+ "\t| " + "power 3"+ "\t| " + "power 4"+ "\t| " + "power 5"+ "\t|");
		 System.out.println("-------------------------------------------------------------------------");
		 
		 /* This for how many times repeat; 
		  outer loop will continue when the inner loop met the condition
		  and escape */
		 for (int even = 10; even <= 20; even += 2)
		  {
			 
			 /* The inner loop always continue running the loop until the 
			 condition are met and then escape; return to outer loop */
		      for (int power = 1; power <= 5; power++)
		      {
		    	  int calculate = (int) Math.pow(even,power);
		          System.out.print( calculate + "\t|\t");
		      }
		      System.out.println();//This will run when the inner loop done running and escape
		  }
		 //print when outer loop done running and escape
		 System.out.print("-------------------------------------------------------------------------");
	}

}
