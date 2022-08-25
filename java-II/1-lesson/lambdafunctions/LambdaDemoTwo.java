import java.util.Scanner;

/*
 * Filename: intCalaculator.java
 * Author:   @author Brendan Glancy
 * Date: @date 08/25/22
 * Purpose: to demonstrate lambda expressions and how to implement a functional interface
 */

public class LambdaDemoTwo {
    public static void main(String[] args) {
        // init
        int num; // Local int variable
        final int FACTOR = 10; // Constant variable

        // For keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Create an object that implements the IntCalculator interface
        IntCalculator multiplier = (int x) -> {
            return x * FACTOR;
        };

        // Get a number to use for our lambda expression
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();

        // Display the result of our number multiplied by the constant factor
        System.out.println("The result of " + num + " multiplied by " + FACTOR + " is " + multiplier.calculate(num));

        // Redifine the lambda expression to do addition instead of multiplication
        IntCalculator adder = (int x) -> {
            return x + FACTOR;
        };

        // Get a number to use for our lambda expression
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();

        // Display the result of our number added by the constant factor
        System.out.println("The result of " + num + " added by " + FACTOR + " is " + adder.calculate(num));

        // Close keyboard input
        keyboard.close();
    }
}
