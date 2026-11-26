import java.util.Scanner;
public class LetterGradeConversion
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("What is your letter grade: ");
	    String letter = in.nextLine();
	    
	   //using if statement
	 /* if (letter.equals("F") || letter.equals("f")) {
		System.out.println("Your GPA is: " + 0);
		
	} else if (letter.equals("D") || letter.equals("d")) {
		System.out.println("Your GPA is: " + 1.0);
		
	} else if (letter.equals("C") || letter.equals("c")) {
		System.out.println("Your GPA is: " + 2.0);
		
	} else if (letter.equals("B") || letter.equals("b")) {
		System.out.println("Your GPA is: " + 3.0);
		
	} else if (letter.equals("A") || letter.equals("a")) {
		System.out.println("Your GPA is: " + 4.0);
		
	} else {
		System.out.println("invalid entry");
	} */
	    
	    //using switch statement
	    switch (letter) {
	    case "F", "f": 
	    	System.out.println("Your GPA is: " + 0);
	    	break;
	    	
	    case "D", "d": 
	    	System.out.println("Your GPA is: " + 1.0);
	    	break;
	    	
	    case "C", "c": 
	    	System.out.println("Your GPA is: " + 2.0);
	    	break;
	    	
	    case "B", "b": 
	    	System.out.println("Your GPA is: " + 3.0);
	    	break;
	    	
	    case "A", "a": 
	    	System.out.println("Your GPA is: " + 4.0);
	    	break;
	    	
	    default:
	    	System.out.println("invalid entry");
	    }
	    
	in.close();
}
}
