package mdc.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();
        
        //Initialize Name
        String firstName = "Harold";
        String lastName = "Lamostre";

        // calculate and display a total
        String productCode = "android";
        String description = "Murach's Android Programming";
        double price = 57.50;
        int quantity = 2;
        double taxPercent = .075;
        double total = price * quantity;
        
        double taxAmount = taxPercent * total;
        double grandTotal = total + taxAmount;
        
        String message = 
            "Code:     " + productCode + "\n" +
			"Description:" + description + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n" +
            "Tax Percent: " + taxPercent * 100 + "\n" +
            "Tax Amount: " + taxAmount + "\n" +
            "Grand Total: " + grandTotal + "\n";
        
        System.out.println(message);

        // display your name        
        // TODO: add code here
        firstName = "Christopher";
		
        System.out.println("Name :" + lastName + ", " + firstName);
        
        // calculate and display an average        
        double sum = 301.75;
        int count = 6;
        
        double average = sum/count;

		System.out.println("Sum: \t" + sum);
		System.out.println("Count: \t" + count);
        System.out.println("Average: " + average);
        System.out.println();
        // display a goodbye message
        System.out.println("Bye!");
    }
}
