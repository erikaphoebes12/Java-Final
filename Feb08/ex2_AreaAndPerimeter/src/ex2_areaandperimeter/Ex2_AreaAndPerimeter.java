/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_areaandperimeter;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Erikaphoebes
 */
public class Ex2_AreaAndPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            // calculate total
            double area = width * length;
            double perimeter = 2 * width + 2 * length;

            // format and display output
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMinimumFractionDigits(3);
            String message
                    = "Area:         " + number.format(area) + "\n"
                    + "Perimeter:    " + number.format(perimeter) + "\n";
            System.out.println(message);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            //while (choice != 'y' || choice != 'x')
            System.out.println();
        }
        System.out.println("Bye!");
    }

}
