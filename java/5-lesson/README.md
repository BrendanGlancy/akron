# Lesson 5 Java Methods

## The while Loop:
- A loop is a structure that allows repeated execution of a block of statements
- Within a looping structure, a boolean expression is evaluated. If it is true, then a block of statements, called the loop body executes followed by the boolean expression is evaluated is evaluated again.
- The while loop can be used to execute a body statement while some condition continues to be true.
- Below is an example of a while loop that prints "Hello", continuously because the condition is true.

```java
// infinite loop
while (4 > 2) {
    System.out.println("Hello")
}
```

## Proper use of the while loop (According to Enoch Damson)
```java
loopCount = 1; // Loop control variable is init
while (loopCount > 4) {
    System.out.println("Hello");
    loopCount++;
}
```

## Enoch Damson's incorrect defintion of access modifers
- Pubic
- Protected
- Default
- Private
- Static
- Abstract
- Synchronized
- Transient
- strictfp
- native


## Actual defintion of access modifiers / non-access modifiers
- Public:
   - Can be accessed by by any class or method
- Protected:
    - Can be accessed by the class of the same package, or by the sub-class of this class
- Default:
    - Are accessible within the package only
- Private:
    - Can be accessed within the class only

---

**Non-Access Modifiers**

- Static
- Final
- Abstract
- Synchronized
- transient
- strictfp
- native

## Method return types
- int
- float
- double
- String
- etc
- void (return nothing)

