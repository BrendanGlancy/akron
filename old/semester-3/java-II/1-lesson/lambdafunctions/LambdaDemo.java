import java.util.Scanner;

/*
 * Filename: intCalaculator.java
 * Author:   @author Brendan Glancy
 * Date: @date 08/25/22
 * Purpose: to demonstrate lambda expressions and how to implement a functional interface
 */

public class LambdaDemo {
    public static void main(String[] args) {
        int num; // Local int variable

        // For keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Create an object that implements the intCalaculator interface
        // If you need a lambda expression that doesn't take an argument, you just need an empty pair of braces
        IntCalculator square = (int x) -> {
            return x * x;
        };

        // Get a number to use for our lambda expression
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();
        System.out.println("The square of " + num + " is " + square.calculate(num));

        // Close keyboard input
        keyboard.close();
    }
}
