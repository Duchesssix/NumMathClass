package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TIP CALCULATOR
        DecimalFormat priceFormatter = new DecimalFormat("$#,###.00"); //setting the format
        Scanner scanner = new Scanner(System.in);  //create scanner to read user input

        double subtotal = 0;  //variable for subtotal
        double input = 0; //variable for user input

        do {
            //prompt user for item costs while input is not equal to 0 (exit)
            System.out.print("Enter item cost (enter 0 to exit): ");
            input = scanner.nextDouble();  //get user input
            priceFormatter.format(subtotal += input); //add user input to subtotal in rounded currency format
        } while (input != 0.00);  //stop getting user input when 0 is input

        System.out.println("Subtotal: " + priceFormatter.format(subtotal));  //display subtotal of all items entered
        System.out.println("Tax: " + priceFormatter.format(subtotal * .025));  //display subtotal tax at 2.5%
        System.out.println("Total with tax: " + priceFormatter.format(subtotal * 1.025));  //display subtotal with 2.5% tax
        System.out.println("Suggested tip at 17.5%:  " + priceFormatter.format((subtotal * 1.025) * .175));  //display suggested tip of 17.5%
    }
}
