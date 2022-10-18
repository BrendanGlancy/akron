/*
 * Example of Prototypes, Classes and Modules
 *
 * This file contains the code for the lecture on prototypes, classes and modules.
 */

/*
 * Prototypes:
 * - Prototypes are the basis for inheritance in JavaScript.
 *   - Inheritance is a way to reuse code.
 *   - Inheritance is a way to create new objects based on existing objects.
 *   - In JavaScript, inheritance is implemented using prototypes.
 *   - A prototype is a template object that other objects can inherit from.
 *
 *
 * Below we will first create and Object and then create a new object based on it
 *
 */

// Create an object
var person = {
  height: 180,
  weight: 80,
  name: "John",
  age: 30,
  job: "programmer",
};


// Create a new object based on the person object
var programmer = Object.create(person);

// Add a new property to the programmer object
// This property will not be available in the person object
programmer.favoriteLanguage = "JavaScript";


/*
 * Classes and Constructors:
 *
 * Below we will create a class called shape, and then create a new object based on it.
 */

class Shape {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }

  // Getter
  get area() {
    return this.calcArea();
  }

  // Method
  calcArea() {
    return this.height * this.width;
  }

  // Method
  printArea() {
    console.log(this.area);
  }
}

// Create a new object based on the Shape class
const square = new Shape(10, 10);
square.printArea(); // 100

// Create a rectangle using the setPrototypeOf method
// This method is used to set the prototype of an object to another object or null
const rectangle = Object.setPrototypeOf({ height: 20, width: 10 }, Shape.prototype);

// Create a triangle using the setPrototypeOf method, and then add a new property
// This triangle should have properties for the height, width, area, and type
const triangle = Object.setPrototypeOf({ height: 20, width: 10, type: "equilateral" }, Shape.prototype);

/*
 * Modules:
 * - Modules are a way to reuse code.
 *   - Modules are a way to create new objects based on existing objects.
 *
 * Below we will demonstrate how to create a module.
 */

// Create a module
var myModule = (function () {
  // Private variables
  var privateVariable = "Hello World";

  // Private function
  function privateFunction() {
    console.log(privateVariable);
  }

  // Return an object exposed to the public
  return {
    publicProperty: "Foobar",
    publicMethod: function () {
      privateFunction();
    },
  };
})();


/*
 * More on Classes
 */

class Car {
  constructor(brand) {
    this.carname = brand;
    }

  present() {
    return 'I have a ' + this.carname;
  }
}

class Model extends Car {
  constructor(brand, mod) {
    super(brand);
    this.model = mod;
  }

  show() {
    return this.present() + ', it is a ' + this.model;
  }
}

/*
 * Asynchronous JavaScript
 * - Asynchronous JavaScript is a way to run code in the background.
 *   - This is useful for running code that takes a long time to run.
 *   - This is useful for running code that is not dependent on other code.
 *
 * Below we will demonstrate how to use asynchronous JavaScript.
 * We will use asynchronous JavaScript to run code in the background.
 *
 *
 */

// Create an asynchronous function that will call an the github api
// This function will return a promise

async function getRepos() {
  const response = await fetch("https://api.github.com/users/brendanglancy/repos");
  const data = await response.json();
  console.log(data);
}

