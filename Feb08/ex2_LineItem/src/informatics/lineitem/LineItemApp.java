package informatics.lineitem;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
		String productCode;
		String description;
		
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter product code: ");
            productCode = sc.nextLine();

            System.out.print("Enter quantity:     ");
            int quantity = Integer.parseInt(sc.nextLine());

            // set product price based on product code
            double price;
            if (productCode.equalsIgnoreCase("java")) {
				description = "Java Proramming";
                price = 57.50;
            } else if (productCode.equalsIgnoreCase("jsp")) {
				description = "Java Server Pages";
                price = 57.50;
            } else if (productCode.equalsIgnoreCase("mysql")) {
				description = "MySQL";
                price = 54.50;
            } else if (productCode.equalsIgnoreCase("android")) {
				description = "Android For Dummies";
                price = 79.50;
            } else {
				description = "NOT Found";
                price = 0;
            }
            
            // calculate total
            double total = price * quantity;
            
            // format and display output
            NumberFormat currency = NumberFormat.getCurrencyInstance();

            String message = "\nLINE ITEM\n" +
                "Code:        " + productCode + "\n" +
				"Description: " + description + "\n" +
                "Price:       " + currency.format(price) + "\n" +
                "Quantity:    " + quantity + "\n" +
                "Total:       " + currency.format(total) + "\n";
            System.out.println(message);

            // see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			//while (choice != 'y' || choice != 'x')
            System.out.println();
        }
        System.out.println("Bye!");
    }
}