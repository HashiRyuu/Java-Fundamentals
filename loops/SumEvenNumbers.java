public class SumEvenNumbers {

	public static void main(String[] args) {
		
		//declare a variable for sum so we can use in the for loop
		 int sum = 0;
		 
		 //sum all the even numbers can found in the range between 0 and 50  
		    for (int i = 2; i <= 50; i+= 2){
		        sum += i; 
		    }
		    System.out.println("The result of all the even numbers between 0 and 50 is "+ sum);

	}

}
