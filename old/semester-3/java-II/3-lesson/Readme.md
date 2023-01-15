# Week 3 lecture

How are generics compiled in Java?

```java
// T is replaced by the built in class, Object
public class Point<T>
```

Restrictions on generics
- Cannot instantiate generic types with primitive types
- Cannot create instances of type parameters
- Cannot declare static fields whose types are type parameters
