import java.util.Scanner;
public class AlphabeticalComparison
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter your first word using all lowercase: ");
	    String name = in.next();
	    System.out.print("Enter your first word using all lowercase: ");
	    String name2 = in.next();
	    int compare = name.compareTo(name2);/*compare two string to see 
	    which one is come before or after*/
	    if (compare < 0) {
		System.out.println(name + " comes before " + name2 + " in the alphabet");
	} else if ( compare > 0) {
	    System.out.println(name + " comes after " + name2 + " in the alphabet");
	} else {
		System.out.println(name + " and " + name2 + " are equal");
	}
	in.close();
}
}
