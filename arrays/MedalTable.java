import java.util.Scanner;
public class MedalTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String [] countries = {"Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States"};
	    String [] medals = {"Gold", "Silver", "Bronze"};
	    
	    final int CONTRIES = 7;
	    final int MEDALS = 3;
	    
	    int[][] counts = { {1, 0, 1}, 
	                       {1, 1, 0},
	                       {0, 0, 1},
	                       {1, 0, 0},
	                       {0, 1, 1},
	                       {0, 1, 1},
	                       {1, 1, 0},
	                                   };
	  //replace d to s in %15s because it a String
	    System.out.printf("%15s", "Country");
	
	    array(medals);
	    
	  //replace d to s in %10s because it a String
	    System.out.printf("%10s", "Total");
	    
	    System.out.println();
	    
	  //create a array to contain variable of totalMedals method
	    int[] totalMedals = totalMedals(counts, CONTRIES, MEDALS);
	    
	    //using for loop to print out the countries array
	    for (int i = 0; i < countries.length; i++) {
	    	//replace d to s in %15s because it a String
		    System.out.printf("%15s", countries[i]);
		    
		    //using for loop to print out the count or the 2-D array
		    for (int j = 0; j < medals.length; j++) {
		    	System.out.printf("%10d", counts[i][j]);
		    }
		    
		    //print out the total medals for each countries
		    System.out.printf("%10d", totalMedals[i]);
		    System.out.println();
	    }
	 
	    in.close();
	}
	
	//method for print array
	public static void array(String[] y){
	    for (String element: y)
	    System.out.printf("%10s", element);
	    
	}
	
	//method for calculate the total
	public static int[] totalMedals(int[][] count, int row, int colum ) {
		//create a new array
	    int[] Nums = new int[row]; 
	    
	    //for loop to calculate the total
	    for (int i = 0; i < row; i++) {
	        int totalMedalsForCountry = 0;
	        for (int j = 0; j < colum; j++) {
	        //take the value from count array and to totalMedalsForCountry
	            totalMedalsForCountry += count[i][j];
	        }
	        Nums[i] = totalMedalsForCountry;//set the value to the array
	    }
	    return Nums;
		}
	
}
