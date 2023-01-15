// Demonstrate a generic class.

// Point is a generic class.
public class Point<T> {
    private T xCoord;
    private T yCoord;

    // Constructor.
    public Point(T x, T y) {
        xCoord = x;
        yCoord = y;
    }

    // Getters.
    public T getX() {
        return xCoord;
    }

    public T getY() {
        return yCoord;
    }

    // Setters.
    public void setX(T x) {
        xCoord = x;
    }

    public void setY(T y) {
        yCoord = y;
    }

}
