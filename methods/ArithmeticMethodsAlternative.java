import java.util.Scanner;
public class ArithmeticMethodsAlternative
{
	public static void main(String[] args) {
	    Scanner in =  new Scanner(System.in);
	    //user's inputs
		System.out.println("Please enter two integers:");
		double input = in.nextInt();
		double input2 = in.nextInt();
		double s, dif, mul, div;//declare variables
		//use methods to find different values giving by 2 integers
		s = sum(input, input2);
		dif = different(input, input2);
		mul = multiply(input, input2);
		div = division(input, input2);
		//print results; actually I can call the method in the print but never mind
		System.out.println("the sum of " + input + " and " + input2 + " is " + s);
		System.out.println("the difference of " + input + " and " + input2 + " is " + dif);
		System.out.println("the product of " + input + " and " + input2 + " is " + mul);
		System.out.println("the quotient of " + input + " and " + input2 + " is " + div);
		in.close();
	}
	//calculate the sum
	public static double sum(double x, double y){
	    return x + y;
	}
	//calculate the different
	public static double different(double x, double y) {
		/*if x greater than y then x - y. If not then y - x 
		 * this prevent the result not in the negative value
		 */
	    if (x>y) {
	    return x - y;
	    } 
	    
	    return y - x;
	    
	}
	//calculate the multiply
	public static double multiply(double x, double y) {
	    return x * y;
	    
	}
	//calculate the division
	public static double division(double x, double y) {
	   
		/*if x greater than y and y not = 0 then x/y. If x not = 0 then y/x
		 * or else return 0
		 * this prevent the program cashing when divide 0, also make reposition of two
		 * values giving to make divisible
		 */
	    if (  x > y &&  y!=0) {
	         return  x / y;
	    } 
	    if (x != 0){
	        return y/x;
	    }
	    return 0;
	  
	}
}
