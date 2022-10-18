# JavaScript Prototypes, Classes, Modules and APIs + React


**Prototypal inheritance**

The general idea of this is that everything in JavaScript is an object, and each object holds a link to it's prototype
This creates a prototype chain where object can inheritance behaviors from other objects

```JavaScript
const Dog = { bark: true }

const Pug = Object.create(Dog)

Pug.barks //> true
```

If you wanted to create some object based on other object, you can use prototypal inheritance

```JavaScript
const foo = {
  name: "foo",
  one: 1,
  two: 2
};

// Another object.
const bar = {
  two: "two",
  three: 3
};

/*
 * Object.setPrototypeOf() is a method introduced in ECMAScript 2015.
 * For the sake of simplicity, let us pretend
 * that the following line works regardless of the
 * engine used:
 */

Object.setPrototypeOf(bar, foo); // foo is now the prototype of bar.

// If we try to access foo's properties from bar
// from now on, we'll succeed.
bar.one; // Resolves to 1.

// The child object's properties are also accessible.
bar.three; // Resolves to 3.

// Own properties shadow prototype properties
bar.two; // Resolves to "two"
bar.name; // unaffected, resolves to "foo"
foo.name; // Resolves to "foo"
```

## Classes in JavaScript

```javascript
class ClassMates {

	constructor(name,age){
    	this.name=name;
      this.age=age;
    }

  displayInfo(){
    return this.name + "is " + this.age + " years old!";
  }
}

let classmate = new ClassMates("Mike Will", 15);
classmate.displayInfo();  // result: Mike Will is 15 years old!
```

## Regular Expressions

A regular expression (regex) is a sequence of characters that specifies a search pattern in text.
Usually such patterns are used by string-search algorithms for find or find and replace operations on strings, or for input validation.
