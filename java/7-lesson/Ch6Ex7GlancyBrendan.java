import java.util.*;

class Ch6Ex7GlancyBrendan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask the user for the circles radius
    System.out.print("Enter the radius of the circle: ");
    // read the radius
    double radius = input.nextDouble();

    // Create a circle object
    // and call the area method, diameter, and circumference methods
    // and print the results
    Circle circle = new Circle(radius);
    System.out.println("The area of the circle is " + circle.area());
    System.out.println("The diameter of the circle is " + circle.diameter());
    System.out.println("The circumference of the circle is " + circle.circumference());

    // Close the scanner
    input.close();
  }
}

/**
 * Write a Circle class that has the following fields:
 * @author Brendan Glancy
 * Date Created: 3/1/2022
 * @param: double radius
 * @param: Final double PI init to value 3.14159
 *
 * The class should have the following methods:
 * Constructor: Accepts the radius of the circle as an argument
 * Constructor: A no-arg constructor that sets the radius to 0.0
 * @param: double getRadius()
 * @param: double setRadius()
 * @param: double area = PI * radius * radius
 * @param: double diameter = 2 * radius
 * @param: double circumference = 2 * PI * radius
 */

class Circle {
  private double radius;
  private final double PI = 3.14159;

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
    this.radius = 0.0;
  }

  public double getRadius() {
    return radius;
  }

  public double setRadius(double radius) {
    this.radius = radius;
    return radius;
  }

  public double area() {
    return PI * radius * radius;
  }

  public double diameter() {
    return 2 * radius;
  }

  public double circumference() {
    return 2 * PI * radius;
  }
}
