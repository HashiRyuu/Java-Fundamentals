import java.util.Scanner;
public class BracketPatterns
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    //ask user input
		System.out.println("Please enter an interger value:");
		int input = in.nextInt();
		
		//call the method to print out the output
		draw(input);
		
		in.close();
	}  
	
	//method to draw []
	public static void draw(int k) {
		
		//important for recursion
	   if (k < 1) {
	       return;
	   } 
	   draw(k -1);/*recursion; call the method it self; this go 
	   on until the method it exist*/
	   
	   //this print the []
	    for (int i = 0; i < k; i++) {
	            System.out.print("[]");
	        }
	        System.out.println("");
	    }
	}

//others way without using recursion
/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		System.out.println("Please enter an interger value:");
		int input = in.nextInt();
		draw(input);
		
	}
	public static void  draw(int k) {
	    
	    for (int i = 1; i <= k; i++) {
	        for (int y = 0; y < i; y++){
	            System.out.print("[]");
	        }
	        System.out.println();
	    }
	}
}*/
