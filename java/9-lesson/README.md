# Lesson 9 Inheritance:

## Inheritance in java

Builds relation between classes, main purpose:
create a TEST BASE CLASS and use it in other classes.
Inheritance allows a class to inherit properties (objects, variables, methods)
from another source (class or interface).
Allows code reusability and easy to maintain.

SUPER CLASS (also known as parent or base class):
is the class where the fields are being inherited from.

SUB CLASS (also known as the child or derived class):
is the class inheriting the properties

INHERITANCE EXAMPLE:
In my framework I have a TestBase class where I store all my reusable code and methods. My test execution classes,
and elements class will extend the TestBase in order to reuse the code.
My framework follow POM and some pages have similar actions,
so I can easily use those similar actions and fields
by inheriting them from the ready classes.
