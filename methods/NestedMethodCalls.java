public class NestedMethodCalls {

	public static void main(String[] args) {
		
		//call or invoke method in the main
		//only call fruit because fruit contain veggie and chips method in it
				fruit();
				//lunch();
				System.out.println("I hope you enjoyed your luch, I wonder what's for dinner?");
			}
			
			//fruit method
			public static void fruit() {
				
			    System.out.println("Im so sweet");
			    //put veggie at the end because order matter
			    veggie();/*when invoke a veggie in fruit method the 
			    fruit will contain what veggie method have*/
			}
			
			//veggie method
			public static void veggie() {
			
			    System.out.println("Im so cruchy");
			    //put chips at the end because order matter
				chips();/*when invoke a chips in veggie method the 
			    veggie will contain what chips method have*/
			}
			
			//chips method
			public static void chips() {
			    
			    System.out.println("Im so savory");
			}
			
			//extra method just for fun :))
			public static void lunch() {
			
			    System.out.println("I hope you enjoyed your luch, I wonder what's for dinner?");
			}
			

	}
