import java.util.ArrayList;
public class ReverseArrayList
{
	public static void main(String[] args) {
	    ArrayList<String> friends = new ArrayList<>();

	    //adding names
	    friends.add("Allen");
	    friends.add("Cindy");
	    friends.add("Tran");
	    friends.add("Jose");

	    //prints
	    //call this first so it can print the Original array
	    System.out.println("Original array: " + friends);
	    
	    //method call
	    //when the method call and friends array is had been modified
	    //to avoid this I can create a new ArrayList
	    //ArrayList<String> reverseFriends = reverse(friends);
	    friends = reverse(friends);
	    System.out.println("Reversed array: " + friends);
	    
	 
	}
	
	//method for reverse 
	public static ArrayList<String> reverse(ArrayList<String> names){
		//create a ArrayList to store the reverse names
	    ArrayList<String> result = new ArrayList<>();
	    
	    //using for loop to fill
	    for (int i = names.size() - 1; i >= 0; i--){
	        result.add(names.get(i));
	    }
	    
	    //return a reference of result ArrayList
	    return result;
	}
}
