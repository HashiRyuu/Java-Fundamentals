import java.util.Scanner;
public class DaysInMonth
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter a month (1-12) and I will print the number of the days in that month: ");
	    int num = in.nextInt();
	     
	    //find days using switch statement 
	    switch (num)  {
	    case 2:
	    	System.out.println("This month has 28 or 29 days");
	    	break;
	    
	    case 1, 3, 5, 7, 8, 10, 12:
	    	System.out.println("This month has 31 days");
	    	break;
	    
	    case 4, 6, 9, 11:
        	System.out.println("This month has 30 days");
            break;
            
        default:
        	System.out.println("Invalid Month");
  
	} 
	in.close();
}
}
