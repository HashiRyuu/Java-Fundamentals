import java.util.Scanner;
public class VolumeMethods {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		 System.out.println("Please enter the length, width, and height dimensions: ");
		 //user's inputs
		 	int input = in.nextInt(); 

		    int input2 = in.nextInt(); 
		    
		    int input3 = in.nextInt(); 
		    
		    //print or call methods 
		    System.out.println("The volume of the cube is: " + cubeVolume(input));
		    System.out.println("The volume of the cube is: " + cubeVolume(input2));
		    System.out.println("The volume of the rectangular prise is: " + regtangularForPrismVolume(input, input2, input3));

		 	in.close();
	}
	
	//calculate the cube of length and width
	public static double cubeVolume(double length) {
	    return length * length * length;
	    
	}
	
	//calculate the rectangular prism volume of length, width, height.
	public static double regtangularForPrismVolume(double length, double width, double heigth) {
	    return length * width * heigth;
	}
}
