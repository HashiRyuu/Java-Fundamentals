public class InvestmentGrowth {

	public static void main(String[] args) {
		
		 	int year = 0;
		    double interest = 0;
		    double balance = 10000;
		    
		    //constant variables
		    final double rate = 0.07;
		    final double tarbet = 20000;
		    
		    while (balance < tarbet) {
			    interest = balance * rate;
			    balance += interest;
			    year++;
		    }
		    System.out.print("The investment doubled after " + year + " years and the balance is " + balance);

	}

}
