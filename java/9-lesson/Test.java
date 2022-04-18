public static void main(String[] args) {
  System.out.println("Hello World");

}

public static void sayHello() {
  System.out.println("Hello");
}

// write a java public class method named add which takes two double parameters named x and y and returns the result of adding
// the two numbers
public static double add(double x, double y) {
  return x + y;
}

// create an object of a class named c2 using the default constructorC
class C2 {
  public C2() {
    System.out.println("C2");
  }

}

Square sq2 = new Square();


public class Square {
  private double height;
  private double width;

  // create a constructor
  public Square(double h, double w) {
    height = h;
    width = w;
  }
}

public class Circle {
  private double radius;

  public static double getArea(double r) {
    return Math.PI * r * r;
  }
}

// write Java code to create a public class named Circle with the following:
// private double radius;
// private string constant named COLOR initialized to "Red"
// a public constructor whith takes a double parameter named radius

public class Circle {
  private double radius;
  private static final String COLOR = "Red";

  public Circle(double r) {
    radius = r;
  }
}


public class Vehicle {
  public abstract double getMPG();
}

public interface Car implements Vehicle {
  private double mpg;
  public double getMPG(mpg){
    return mpg;
  }
}

// declare a pubilc class named Undergrad which inherits a class named Student and makes use of an interface named University
public class Undergrad extends Student implements University {
}
