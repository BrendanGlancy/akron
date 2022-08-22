# Classes and Objects

For some reason he is talking about building a house to relate to Objects and Inheritance

**Object:** Instance of the class. We can store different data's to objects
Object Creation: with new keyword.

```java
ClassName obj = new ExistingConstructor
```

## Example code for a lightsaber object

```java
public class Lightsaber {
  // properties
  // private for information hiding
  private boolean isOn;
  private Color color;

  // constructor
  public Lightsaber(Color color) {
    this.isOn = false;
    this.color = color;
  }

  // getters
  public Color getColor() {
    return color;
  }
  public boolean getOnStatus() {
    return isOn;
  }

  // setters
  public void turnOn() {
    isOn = true;
  }
  public void turnOff() {
    isOn = false;
  }
}



// Implementation in main method:
public class test {
  public static void main(String[] args) {
    Lightsaber yoda = new Lightsaber(green);
    yoda.turnOn();
  }
}
```

## Inheritance

Builds relations between classes, main purpose:
create a TEST BASE CLASS and use it in other classes.

**Inheritance** allows a class to inherit properties (objects, variables, methods) from another source

Allows code reusability and easy to maintain.

**Super Class** (also known asa parent or base class):
is the class where fields are being inherited from.

**Sub Class** (also known as the child or derived class):
is the class inheriting the properties

## Inheritance Example

In my framework I have a TestBase class where I store all my reusable code and methods.
My test execution classes, and elements classes will extend the TestBase in order to reuse the code.
My framework follows PPOM and some pages have siliar actions, so I can easily use those similare actions and fields by inheriting them from the ready class.


## Example code of Bicycle and MountainBike inheritance

```java
// Java program to illustrate the
// concept of inheritance

// base class
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

     // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
```

## Constructors in Java

A constructor in Java is a **special method** that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for objects attributes:
Basically used to init memory for an object.

## Information hiding and Encapsulation

**Encapsulation**

Ensures that the behavior of an object ca obly be affected through its API. It lets us control how much a change to one object will impact other parts of the system by ensuring that there are no unexpected dependencies between unrelated components.

**Information hiding**

Conceals how an object implements its functionality behind the abstraction of its API. It lets us work with higher abstractions by ignoring lower-level details that are unrelated to the task at hand.

```java
class NoEncapsulationNoInformationHiding {
    public List widths = new ArrayList();
}

class EncapsulationNoInformationHiding {
    private ArrayList widths = new ArrayList();

    public ArrayList getWidths() {
        return this.widths;
    }
}

class EncapsulationInformationHiding {
    private List widths = new ArrayList();

    public List getWidths() {
        return this.widths;
    }
}
```

- **Encapsulation**: combining things, such as data and the procedures that operate on these data (making up an object). Encapsulation implies that hiding of an objects data because any procedure can operate on public data.
- **Information Hiding**: abstracting things, such as an object's implementation i.e. an objects data, the implementaiton of its procedures, and the classes of the parameters and return values of its procedures. Information hiding implies encapsulation, but not the other way around.

## These concepts are closely related but there are differences

| Data Hiding   | Encapsulation    |
|--------------- | --------------- |
| Data hiding is the process that ensures exclusive data access to class members and projects object integrity by preventing unintended or intended changes.   |  Encapsulation is an OOP methodology, that bundles the data with the methods operating on that data.  |
| Data hiding focuses on securing the data while hiding the complexity.   | Encapsulation focus on hiding the complexity of the system.    |
| Data hiding is data protecting process.  | Encapsulation is a method of achieving data hiding.    |
| Data hiding uses private access modifier.  |  Encapsulation uses private, protected, public access modifiers.   |


