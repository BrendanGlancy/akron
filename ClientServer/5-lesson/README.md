# Lesson 5: Looping Structures in JavaScript + Arrays

### Structures of Loop:
- Initialization
- Test Condition
- Iteration
  - Decrement
  - Increment

**Important Note**:

JavaScript is single threaded meaning that no other processes can run while you are going through a loop

```JavaScript
// This code will cause everything in a page of a browser to stop working if it is written in the console
while(true){
}
```

### Types of loops in JavaScript
- for
    - Loops through a block of code a number of times=
- for/in
    - Loops through the properties of an object
- for/of
    loops through the values of an iterable object
- while
    - loops through a block of code while a specified condition is true
- do/while
    - also loops through a block of code while a specified condition is true

  ** Examples of loops in JavaScript**

```javascript
for (initialExpression; condition; updateExpression) {
  // for loop body
}
```

- The initial expression initalized or declares variables and executes only once
- The condition is evaluated
  - if the condition is false the loop is terminated
  - if its true the block of code inside the for loop is executed
- The updateExpression updates the value of initialExpression when the condition is true.
- The condition is evaluated again. This process continues until the condition is false.

**For/In**

```javascript
// Example of an array in JavaScript
let arry = {
    name: "Rakibul Islam",
    class: "Tane",
    grup: "A",
    roll: 10,
    sub: "Arse"
}

// for in loop used to object
for(let i in arry){
    console.log(i,arry[i]);
}

// for/of loop
for (let i of arry) {
  console.log(i, arry[i]);
}

var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

//  while loop
 let j= 0;
 while(j < arr.length)
 {
     console.log(arr[j]);
     j++;
 }

// Do/While

let i =0
do{
console.log(i)
  i++;
}
while(i>10);
```

### Example of Array in JS with different datatypes:

```javascript
arr = ["text", 1, true, 1.0]

// Two dimensional array
arr2 = [[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]]
```

## JavaScript array methods
- push()
    - Insert an element at the end of the array
- unshift()
    - Insert an element at the beginning of the array
- pop()
    - Remove an element from the end of the array
- shift()
    - Remove an element from the beginning of the array
- slice()
    - Create a shallow copy of an array
- ...nameOfArray
    - Insert an array into an array


