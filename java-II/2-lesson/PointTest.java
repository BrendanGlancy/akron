
// Test class to test the Point class
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        // Create two double objects to use as coordinates
        double dblx = 1.0;
        double dbly = 2.0;

        // Create a point object that can hold a double x and double y
        Point<Double> dPoint = new Point<Double>(dblx, dbly);

        // Create two Integer objects to use as coordinates
        int intx = 10;
        int inty = 20;

        // Create a point object that can hold a Integer x and Integer y
        Point<Integer> iPoint = new Point<Integer>(intx, inty);

        // Display the point objects
        System.out.println("Here are the coordinates of dPoint: " + dPoint.getX() + ", " + dPoint.getY());
        System.out.println("Here are the coordinates of iPoint: " + iPoint.getX() + ", " + iPoint.getY());

        // Create a string point and display its value
        Point<String> sPoint = new Point<String>("Hello", "World");
        System.out.println("Here is the string point: " + sPoint.getX() + ", " + sPoint.getY());

        // Raw types -- Don't use this, it's bad practice
        // Java wont let you compile this anyway

        /*
         * Point rawPoint = new Point("Hello", inty);
         * System.out.println("Here is the raw point: " + rawPoint.getX() + ", " +
         * rawPoint.getY());
         */

        // Use generic Objects as parameters
        Point<Object> oPoint = new Point<Object>("Hello", "World");
        System.out.println("Here is the generic point: " + oPoint.getX() + ", " + oPoint.getY());
    }

    // Create a method to square the value of a point, should return an int
    public static int squarePoint(Point<Integer> point) {
        return point.getX() * point.getY();
    }
}
