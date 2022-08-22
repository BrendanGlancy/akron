import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Define the following 2 classes to represent 2-dimesional object
// Super Class: Shape: should have the following
// 2 member variables: x and y length and breadth of integer types
// 2 argument constructor for lenght and breadth which sotest eh arguments in the corresponding member
// A method called area(), which prints the length and breadth of the shape, delimited by a space
// Concrete Class: Rectangle should have
// 2 argument constructor for lenght and breadth, It should forward those arguments to the superclass contructor
// Override the area() method to print the area using the formula (length*breadth).

class Shape {
    int x, y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void area() {
        System.out.println(x + " " + y);
    }
}

class Rectangle extends Shape {
    Rectangle(int x, int y) {
        super(x, y);
    }
    void area() {
        System.out.println(x * y);
    }
}


public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l,b);
        shape.area();

        Shape rectangle = new Rectangle(l,b);
        rectangle.area();
    }
}
