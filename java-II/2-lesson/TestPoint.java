/*
 * Java class to test the Point class.
 */

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x and y coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        Point<Double> p = new Point<>(x, y);
        System.out.println("The distance from the origin is " + p.distanceFromOrigin());

        // Create different types of points.
        Point<Integer> p1 = new Point<>(1, 2);
        Point<Double> p2 = new Point<>(3.0, 4.0);
        Point<String> p3 = new Point<>("5", "6");
    }
}
