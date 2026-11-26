import java.util.Scanner;

public class SquareMethods {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//user's input for square 1
		 System.out.print("Input an interger: ");
		 	int num = in.nextInt();
		 	/*for void method we don't needs store it in a variable 
		 	  we can call it or invoke*/
		    square1(num);
		  
		  //user's input for square 2
		  System.out.print("Input an interger: ");
		  	int num2 = in.nextInt(); 
		  //for non-void method we can print it out or stored it in a variable
		    System.out.println("The result is " + square2(num2));
		    
		    in.close();
		    
		    } 
	
			/*void method they do not return any value. 
			 *They are used when you want the method to perform a task
			 *if we put a return in void the method will be eliminate*/
		   public static void square1(int y)
		   {
		          int result = y*y;
		        System.out.println("The result is " + result);
		        
		    }
		   
		   /*Non-void methods are methods that return a value. 
		    * The return type is specified before the method name in 
		    * the method declaration. 
		    * These methods are used when you want to perform a task and 
		    * return a result of a specific data type.
		    */
		    public static int square2(int x)
		    {
		        return x*x;
		    }
	
	}
