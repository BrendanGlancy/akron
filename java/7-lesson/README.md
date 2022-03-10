# Lesson 7

Method Overloading vs Method Overriding

| Overloading  | Overriding   |
|--------------- | --------------- |
| Access modifier can be same or different   | After a method is inherited it is possible to change.   |
| Return-type can be same or different  | Parameter, and Return-type **MUST** be the same   |
| Parameters **MUST** be different, Methods must be the same   | @Override annotation MUST be applicable. We can use the @Override annotation before the method to declare overriding. This annotation will allow the complier to help ensure the method is overriden correctly.   |
| Any method can be overloaded   | Must happen in the sub class, access modifier MUST be the same  |

Basically went over the last lecture again, see lesson 6 for more notes about classes and objects.

## Overloading

```java
import java.io.*;

class MethodOverloadingEx {

    static int add(int a, int b) {
      return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
          System.out.println("add() with 2 parameters");
        System.out.println(add(4, 6));

          System.out.println("add() with 3 parameters");
        System.out.println(add(4, 6, 7));
    }
}
```

## Overriding

```java
class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
}

// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }
}
```
