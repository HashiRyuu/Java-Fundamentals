import java.util.Scanner;
public class FrustumVolume {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//final value
		final double pi = Math.PI;
		final double a = 1.0/3.0;
		
		System.out.print("Enter the height: ");
		double h = in.nextDouble();
		
		System.out.print("Enter radius 1: ");
		double r1 = in.nextDouble();
		
		System.out.print("Enter radius 2: ");
		double r2 = in.nextDouble();
		
		double r1r2 = r1*r2;
		double mathPow = Math.pow(r1, 2) + Math.pow(r2, 2);
		
		double v = a * pi * h * ( mathPow + r1r2 );
		
		
		System.out.printf("The volume is %.3f", v);
		
in.close();
	}

}
