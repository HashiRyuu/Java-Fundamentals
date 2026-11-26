import java.util.ArrayList;
public class ArrayListOperations
{
	public static void main(String[] args) {

	    ArrayList<String> friends = new ArrayList<>();
	    
	    //adding names 
	    friends.add("Carrie");
	    friends.add("Bob");
	    friends.add("Ali");
	    friends.add("Sarah");
	    friends.add("Ellen");
	    
	    //adding name at specific position
	    friends.add(4, "Richard");
	    
	    //change name at specific position
	    friends.set(5, "Ellie");
	    
	    //remove name at specific position
	    friends.remove(0);
	    
	    //find the ArrayList size
	    int size = friends.size();
	    
	    //prints
	    System.out.println("The last name on the list is: " + friends.get(friends.size() - 1));
	    
	    System.out.println("The size of your array list is: " + size);
	    
	    System.out.println("The friends list without a loop: " + friends);
	    
	    System.out.print("The friends list with a loop: ");
	   
	    //prints using enhanced loop
	    for (String element: friends){
	        System.out.print(element + " ");
	    }
	    
	    
	}
}
