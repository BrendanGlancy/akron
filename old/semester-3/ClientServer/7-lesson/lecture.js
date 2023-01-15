// JavaScript Code we went over in the lecture.


// Array of students
var students = ["John", "Jane", "Joe", "Jill", "Jack"];

// Example of different types of loops

// For loop
for (var i = 0; i < students.length; i++) {
  console.log(students[i]);
}

// While loop
var i = 0;
while (i < students.length) {
  console.log(students[i]);
  i++;
}

// Do while loop
// This loop will always run at least once
var i = 0;
do {
  console.log(students[i]);
  i++;
}
while (i < students.length);

// For each loop
// This loop is used to loop through arrays
// It is a lot easier to use than the other loops
// It is also a lot slower than the other loops
students.forEach(function(student) {
  console.log(student);
});

// For in loop
// This loop is used to loop through objects
// It is a lot easier to use than the other loops
// It is also a lot slower than the other loops
// This loop will loop through the properties of an object

// Student object
// This object has 3 properties
// name, age, and grade
// The properties are accessed using the dot notation
var student = {
  name: "John",
  age: 15,
  grade: 10
};

student.name = "Jane";
student.age = 21;
student.grade = 11;


for (var property in student) {
  console.log(property);
}


/*
 * Using the find method, sort method and filter method
 */


/*
 * Find method
 * This method is used to find a specific element in an array
 * It returns the first element that matches the condition
 * If no element is found, it returns undefined
 * The find method takes a function as a parameter
 * The function takes an element as a parameter
 * The function returns true or false
 */

// Find the first student that is 15 years old
var student = students.find(function(student) {
  return student.age === 15;
});

console.log("find method example:", student);

/*
 * Sort method
 * This method is used to sort an array
 * It sorts the array in ascending order
 * The sort method takes a function as a parameter
 */

// Sort the students array by age
students.sort(function(a, b) {
  return a.age - b.age;
});

console.log("sort method example:", students);

/*
 * Filter method
 * This method is used to filter an array
 * It returns an array with all the elements that match the condition
 * The filter method takes a function as a parameter
 */

// Filter the students array to get all the students that are 15 years old
var students = students.filter(function(student) {
  return student.age === 15;
});

console.log("filter method example:", students);

