/*
 * example class to make use of the Point class
 */

public class PointDemo {
    public static void main(String[] args) {
        Double x = 2.5;
        Double y = 1.0;

        Point<Double> point = new Point<Double>(x, y);

        // Create an interger point
        Point<Integer> q = new Point<Integer>(3, 4);
        System.out.println(q.getX());
        System.out.println(q.getY());
        System.out.println(q.toString());

        // Create a string point
        Point<String> r = new Point<String>("Hello", "World");
    }
}
