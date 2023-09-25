public class CreateRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        // print the output of the toString method
        // of the Rectangle object r
        System.out.println(r);
        // print the rest of the functions of the Rectangle class
        // let the use know we're not using the toString
        System.out.println("-- Rectangle class functions --");
        System.out.println("This is called in 4 lines of code");
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());

        // Create a new Rectangle object
        // with the width and height of 101
        // and print the output of the toString method
        Rectangle r2 = new Rectangle(101, 101);
        System.out.println("-- Output of a new Rectangle object, with length and height 101  --");
        System.out.println(r2);
    }
}

// Create a rectangle class with the following properties:
// width
// height
// area
// perimeter
// Create a constructor that takes the width and height as parameters.
// Create a method that returns the area of the rectangle.
// Create a method that returns the perimeter of the rectangle.

class Rectangle {
    // init of variables
    private int width;
    private int height;

    // constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Calling this returns the width
    public int getWidth() {
        return width;
    }

    // Calling this returns the height
    public int getHeight() {
        return height;
    }

    // Calling this returns the perimeter
    public int getPerimeter() {
        return (width + height) * 2;
    }

    // Calling this returns the area
    public int getArea() {
        return width * height;
    }

    // To String to format the output
    public String toString() {
        return "Width: " + width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
