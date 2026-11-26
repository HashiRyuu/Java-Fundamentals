import java.util.Scanner;

public class UniqueCharacters
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String word = in.next();

      String result = "";
      for (int i = 0; i < word.length(); i++) 
      {
         char currentChar = word.charAt(i);
          boolean isUnique = true;
         for (int j = 0; j < word.length(); j++) 
         {
            if (i != j && currentChar == word.charAt(j)) {
                    isUnique = false;
                    break;
                }
         }
          if (isUnique) {
                result += currentChar;
            }
      }
      System.out.println(result);
   }
}
