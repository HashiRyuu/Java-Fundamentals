// Collaborative example; co-author: Cole Devine.


import java.util.Scanner;

public class PizzaOriginal {

    public static void main(String[] args) {


         
        //Prompt the user to input the type of pizza that they want to order. 
        //In the end, you should print out the final order and price.  

        //new scanner object
        Scanner in = new Scanner(System.in);

        //cost variable
        double total = 0;
        double rate = 0.0795;
        double ending = total * rate;

        //prompt user name
        System.out.print("Welcome to the Pizza Shop.\nEnter your first name: ");
        String name = in.next();

        

        //size and pricing below
        System.out.println("Pizza Size(inches)   \tCost");
        System.out.println("\t10" + "\t\t$10.99");
        System.out.println("\t12" + "\t\t$12.99");
        System.out.println("\t14" + "\t\t$14.99");
        System.out.println("\t16" + "\t\t$16.99");
        System.out.println();

        //boolean discount
        int discount;
        boolean owner = false;
        if (name.equals("DemoOwner1")|| name.equals("DemoOwner2"))
        {
            owner = true;
            System.out.println();
            System.out.println("You are eligible for a $2.00 discount.");
            //discount = -2;
        }
        System.out.println();

        //prompt for size
        System.out.print("What size pizza would you like?\n10, 12, 14, or 16 (enter the number only): ");
        int size = in.nextInt();
        if (size == 10)
        {
            total = total + 10.99;
        }
        else if(size == 12)
        {
            total = total + 12.99;
        }
        else if (size == 14)
        {
            total = total + 14.99;
        }
        else if (size == 16)
        {
            total = total + 16.99;
        }
        else
        {
            System.out.println("Your input was not onew of the choices, so a 12 inch pizza will be made.");
            total = total + 12.99;
        }


        //prompt for crust USE SWITCH STATEMENT
        System.out.println();
        System.out.print("What type of crust do you want?\n(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish \n(enter H, T, or D):");
        String crust = in.next();

        //crust switch statementcrustType
        String crustType;
        switch (crust)
        {
        case "h": 
        case "H": crust = "Hand-tossed"; break;
        case "t":
        case "T": crust = "Thin-"; break;
        case "d":
        case "D": crust = "Deep-dish"; break;
        default: crust = "Hand=tossed";
                System.out.println("Your input was not one of the choices, so a Hand-tossed crust will be made.");
        }


        //top variable
        String top = "Cheese ";
        //prompt user topping(s)
        System.out.println();
        System.out.println("All pizzas come with cheese.\nAdditional toppings are $1.25 each, choose from:\nPepperoni, Sausage, Onion, Mushroom");

        //prompt for pepperoni
        System.out.print("Would you like Pepperoni?: (Y/N) ");
        String pep = in.next();
        pep = pep.toUpperCase();
        if (pep.equals("Y"))
        {
            top = top + "Pepperoni ";
            total = total + 1.25;
        }

        //prompt for sausage
        System.out.print("Would you like Sausage?: (Y/N) ");
        String sausage = in.next();
        sausage = sausage.toUpperCase();
        if (sausage.equals("Y"))
        {
            top = top + "Sausage ";
            total = total + 1.25;
        }

        //prompt for onion
        System.out.print("Would you like Onion?: (Y/N) ");
        String onion = in.next();
        onion = onion.toUpperCase();
        if (onion.equals("Y"))
        {
            top = top + "Onion ";
            total = total + 1.25;
        }

        //prompt for mushroom
        System.out.print("Would you like Mushroom?: (Y/N) ");
        String mushroom = in.next();
        mushroom = mushroom.toUpperCase();
        if (mushroom.equals("Y"))
        {
            top = top + "Mushsroom ";
            total = total + 1.25;
        }
        //declare discount
        discount = -2;
        if (owner == true)
        {
            total = total + discount;
        }

        //return receipt
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(size + "-inch pizza");
        System.out.println(crust + " crust");
        System.out.println(top);
        System.out.printf("The cost of your order is: $%.2f" , total);
        System.out.println();
        System.out.printf("The tax is: $%.2f" , (total * rate));
        System.out.println();
        System.out.printf("The total due is: $%.2f" , (total + (total * rate)));
        System.out.println();
        System.out.println("Your order will be ready for pickup in 30 minutes.");



    }

}
