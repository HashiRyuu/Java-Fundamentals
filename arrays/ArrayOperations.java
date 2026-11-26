import java.util.Scanner;
public class ArrayOperations {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    int[] nums = new int[8];
		    
		    System.out.print("Enter 8 integers to populate the array: ");
		    populateArray(nums);//called the method for user's input
		    
		    
		    System.out.print("The array elements are: ");
		    array(nums);//print the array that user provided
		    
		    //called total method
		    System.out.println("The total of the array elements is: " + total(nums));
		    
		    //called double method to set array to double value
		    doubleNum(nums);
		    System.out.print("The array elements doubled are: ");
		    array(nums);
		   
		    //create a new array to contain the return values
		    int[] evenNums = even(nums);//int[] evenNums = {10, 14, 22, 0} or address; visualize
		    System.out.print("The elements of the even indices are: ");
		    array(evenNums);
		    
		    in.close();
		}
	
	//User input the numbers for the array
	public static void populateArray(int[] nums) {
		Scanner in = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
        	nums[i] = in.nextInt();
     
        }
 in.close();
    }

	//method for print the array	
	public static void array(int[] nums){
	    for (int element: nums)
	    System.out.print(element + " ");
	    System.out.println();
	}
		
	
	//method for double the existed array and replace with the value with doubled value
	public static void doubleNum(int[] nums){
		for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
	     }
			
	}

	//method for find the total of array
	public static int total(int[] nums){
	    int k = 0;
	     for (int i: nums) {
	         k += i;
			
		    }
		    return k;
	    }

	//method for find even indices in the array
	public static int[] even(int[] nums){
		
		//divided the length of the array
	    int len = nums.length;
	    int len2 = len / 2;
	    
	    //created a new array using the len2 value for the size of the array
	    int[] evenNums = new int[len2];
	    
	    //variable for counter
	    int j = 0;
	    
	    //using for loop to set the value for the array
	    for (int i = 0; i < len; i = i + 2){
	    	
	    	//set the existed value of nums array for new array, evenNums
	    	/*when evenNums[j] = nums[i] means 
	    	 * evenNums posistion equal to or set to nums[i]
	    	 * example nums[0] is 10 in the existed array so 
	    	 * evenNums posistion at 0 (evenNums[0]) equal to 10 (nums[0])
	    	 */
	        evenNums[j] = nums[i];
	        j++;
	    }
	    return evenNums;//return {10, 14, 22, 0} or the address; visualize
	}
	}
