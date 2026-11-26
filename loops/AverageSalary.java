import java.util.Scanner;

public class AverageSalary
{
   public static void main(String[] args)
   {  
      double sum = 0;
      int count = 0;
      double salary = 0;
      System.out.print("Enter your salaries, or enter -1 to terminate: ");
      Scanner in = new Scanner(System.in);

     
//sentinel to end
      while (salary != -1)
      {  
         salary = in.nextDouble();
         if (salary != -1) 
         {  
            sum = sum + salary;
            count++;
         }
         
      }

  
//if the value count > 0 print average or else print No data
      if (count > 0)
      {
         double average = sum / count;
         System.out.printf("Your average salary is $%.2f", average);
      }
      else
      {
         System.out.println("No data");
      }
      in.close();
   }
}
