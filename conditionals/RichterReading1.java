import java.util.Scanner;
public class RichterReading1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print ("Enter the richter reading: ");
		    double richter = in.nextDouble ();
		    
		    //Richter finder using multiple alternatives
		    if (richter >= 8)
		      {
			System.out.println ("Most structures fall");
		      }
		    else if (richter >= 7)
		      {
			System.out.println ("Many buildings destroyed");
		      }
		    else if (richter >= 6)
		      {
			System.out.println ("Many buildings considerably damaged, some collapse");
		      }
		    else if (richter >= 4.5 )
		      {
			System.out.println ("Damage to poorly constructed buildings");
		      }
		    else if (richter < 0)
		      {
			System.out.print ("invalid numbers");
		      } else {
		    	  System.out.println("No destruction of buildings");
		      }
		    in.close();
	}
}
