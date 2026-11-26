public class MathFunctions {

	public static void main(String[] args) {
		//Math.pow
		short x = 10;
		double result = x * Math.pow(2, 4);
		System.out.println("the result is: " + result);
	    
		//Math.abs
		byte y = 40;
		float result2 = Math.abs(10-y);
		System.out.println("the result 2 is: " + result2);
		
		//Math.round
		long c = 57;
		double result3 = Math.sqrt(c);
		float roundedResult3 = Math.round(result3);
		System.out.println("the result 3 is: " + roundedResult3);
		
		//Math.sqrt
		float b = 20;
		double result4 = Math.sqrt(b);
		System.out.println("the result 4 is: " + result4); 
		
		//Math.min
		short v = 10;
		short m = 20;
		float result5 = Math.min(m, v);
		System.out.println("the reuslt 5 is: " + result5);
		
		//Math.max
		long l = 10000;  
		short k = 5770;
		float result6 = Math.max(k, l);
		System.out.println("the result 6 is: " + result6);
		
	}

}
