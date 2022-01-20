# Parts of Information System

- Hardware
- Software
- Procedures
- Data
- People

# Hardware

Physical components of a computer Consists of=:

- Inpute devices
- Processor or Central Processing Unit
- Main memory
- Secondary Storage Devices
- Output devices

# Seconday Storage Devices

- Types of memory that hold data for long periods of time
- Measured in terms of their size in bytes
- Common types of secondary storage devices include:
-   Hard Disks
-   Jump drives
-   Zip disks
-   Floppy disks

# Output Devices

Monitors / Printers

# Programming Languages

Low level:
- Machine language
- Assembler language

High level:
- Java
- Python

# Expressions Chapter 2

All Java programs must be stored in a file with a .java extension
Comments are ignored by the compliers

A .java file may contain many classes, but may only have one public class

## Basic Java Programming tips...

- In a .java file with a public class, the class must have a method named main
- Every java application program must have a method named main
- For every opening brace { or parenthes (, there must be a corresponding closing brace { or parethesis ) in Java
- Java statements are terminated with semicolon (;), except comments, method headers, or braces

The Java Application Programmer Interface (API)

- A standard library of prewritten classes for performing specific operations such as standard input and outuput
- The classes and their methods are avaible to all Java programs

# Priciples of Object-Oriented Programming (OOP)

- Encapsulation - grouping data (fields, methods, etc) into a single object
- Information Hiding (Abstraction) - hiding an object's data from objects
    - The objects methods are used to directly access its data
    - Typically, the object's data is hidden but allows its methods to be accessed
- Inheritance deriving classes (subclasses) based on other existing classes (subclasses)
- Polymorphism using the same procedure name or operator with differnet types of arguments
    - There are 2 types of polymorphism: overloading and overriding

## Special Java Characters

|Character |    Name      |  Meaning |
|----------|:-------------:|------:|
| // | Double forward slash | Marks the beginning of a comment |
| () |    Opening and closing parethesis  | Used in a method header |
| {} | Opening and closing braces |    Encloses a group of statements |
| " " | Double quotation marks |    Encloses a string of characters |
| ' ' | Single quotation marks |    Encloses a single character |
| ; | Semicolon | Marks the end of a programming statement |

String [] args is also how you declare an array of Strings in Java. Explanation in simple laymans language
The main method expects us to provide some arguments when we driect our JVM to the class name.
That means, suppose your file name is Try java, now to execute this in command prompt you write "javac Try.java" to compile followed by "java Try" to execute. Now suppose instead of writing simply "java Try" you write "java Try 1". Here you have passed an argument "1". This will be taken by your main method even if you don't use it in your code.

In Java, access specifiers are the
keywords which are used to define
the access scope of the method, class, or a variable.
  In Java, there are four access specifiers.

  * Public: The classes, methods, or variables
  which are defined as public,
  can be accessed by any class or method.
  * Protected: Protected can be accessed
  by the class of the same package,
or by the sub-class of this class, or within the same class.
  * Default: Default are accessible
  within the package only.
    By default, all the classes, methods,
and variables are of default scope.
  * Private: The private class, methods,
or variables defined as private
    can be accessed within the class only

### Static

- In the Java programming language, the keyword static indicates that the particular member belongs to a type itself,
 rather than to an instance of that type.
- This means that only one instance of that static member is created which is shared across all instance of the class
- Static methods: methods that we can call through the class name.

**Ex: Webdriver driver = WebdriverFactory.getDriver();**
You can call Instance variable in Constructor.
You cannot call instance variable in static you have to create object first.
You can call non static (instance variable) in the instance block.
You can call static in the instance block
