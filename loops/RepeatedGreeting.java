import java.util.Scanner;
public class RepeatedGreeting
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);

    //declare variable first
    boolean i = true;
    String input = "";
    
    //print the begin part
	System.out.println("Hello");
	System.out.println("Do want another greeting?");
	System.out.println("Press y for yes, n for no,");
	System.out.print("and then press return: ");
	input = in.next();
	 
    do
      { 

if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")) //if the input is yes print this part 
{
	System.out.println("Hello");
	System.out.println("Do want another greeting?");
	System.out.println("Press y for yes, n for no,");
	System.out.print("and then press return: ");
	input = in.next();	 
} 

else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n"))//if the input is no print this part
{
	i = false;
	
} 

else //if none of those two cases above print this part
{
	System.out.println("Incorecct input please try again");
	System.out.println("Press y for yes, n for no,");
	System.out.print("and then press return: ");
	input = in.next();
}
      }
    while (i);
    System.out.println("Good-bye");
   
in.close();
  }
}
