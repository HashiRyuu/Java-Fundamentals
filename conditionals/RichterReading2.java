import java.util.Scanner;
public class RichterReading2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print ("Enter the richter reading: ");
		    double richter = in.nextDouble ();
		    
		    //Richter finder using if statements
		    if (richter >= 8)
		      {
			System.out.println ("Most structures fall");
		      }
		     if (richter >= 7)
		      {
			System.out.println ("Many buildings destroyed");
		      }
		     if (richter >= 6)
		      {
			System.out.println ("Many buildings considerably damaged, some collapse");
		      }
		     if (richter >= 4.5 )
		      {
			System.out.println ("Damage to poorly constructed buildings");
		      }
		    if (richter < 0)
		      {
			System.out.print ("invalid numbers");
		      }
		    if (richter < 4.5) {
		    	System.out.println("No destruction of buildings");
		    }
		    in.close();
	}
}
