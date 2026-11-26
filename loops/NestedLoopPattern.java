public class NestedLoopPattern {

	public static void main(String[] args) {
		
		//how many time we want to repeat
		for (int repeat = 0; repeat < 3; repeat++)
		{
			
			//how many time we want to print "-*"
		    for(int minusStar = 0; minusStar < 2; minusStar++ )
		    {
		        System.out.print("-*");
		    }
		    System.out.println("-\n");/* extra "-"; This will run when the inner 
		    loop done running and escape */
		}

	}

}
