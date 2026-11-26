import java.util.*;
import java.io.*;//io package
public class MusicCatalogReader
{
	public static void main(String[] args) throws FileNotFoundException
	{
	    String[] cd = new String[6];
	    
	    File input = new File("classics.txt");
	    
	    //Scanner use the data that stored in the variable input
	    Scanner in = new Scanner(input);
	    
	    //declared variable
	    String title = "";
	    String artist = "";
	    int count = 0;
	    
	    //using while loop because we don't know the length of the data
	    while(in.hasNext()) {
	    	//The first call reads the current line, which is the title of the song.
	         title = in.nextLine();
	         
	        //The second call reads the next line, which is the artist of the song.
	         artist = in.nextLine();
	         
	         //fill the title + by + artist to the array
	         cd[count] = title + " by " + artist;
	         
	         count++;//update for the array
	    }
	    
	    //print header
	    System.out.println("Contents of Compact Disc");
        System.out.println("========================");
        
        //using enhanced loop to print out the value from array  
        for(String element: cd){
            System.out.println(element);
        }
   
        in.close();
    }

}
