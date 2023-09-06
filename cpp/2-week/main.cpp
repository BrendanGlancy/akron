#include <iostream>  // This lets us use things like 'cout'.
#include <array>     // For using 'array'.
#include <vector>    // For using 'vector'.
#include <list>      // For using 'list'.
#include <map>       // For using 'map'.
#include <set>       // For using 'set'.
#include <tuple>     // For using 'tuple'.
#include <utility>   // For using 'pair'.
#include <string>    // For using 'string'.

using namespace std;

void printNonPrims(string s, array<int, 5> a) {
  
  cout << "string: " << s << endl;

  cout << "array: ";
  for (int i = 0; i < a.size(); i++) {
    cout << a[i] << " ";
  }
  cout << endl;
}

/**
 * @brief Declare and pass some variables
 *
 * C++ is a statically typed language, meaning that variables must be declared
 * before they can be used. The type of a variable cannot change after it has
 * been declared.
 *
 * C++ also uses pass-by-value by default, meaning that the value of a variable
 * is copied when it is passed to a function. This means that the original
 * variable is not modified by the function.
 *
 * C++ is also a strongly typed language, meaning that the type of a variable
 * cannot be changed. For example, a variable of type int cannot be assigned to
 * a variable of type string.
 *
 * Below are the params for all primitive types in C++:
 * @param bool: true or false
 * @param char: single character
 * @param int: integer
 * @param float: single-precision floating point number
 * @param double: double-precision floating point number
 * @param void: no type
 * @param nullptr: null pointer
 */

// Function to print non-primitive types
int main() {
  
  // Basic types of data
  bool myBool = true;
  char myChar = 'C';
  int myInt = 10;
  float myFloat = 10.5;
  double myDouble = 10.55;

  // Print these basic types
  cout << "bool: " << myBool << endl;
  cout << "char: " << myChar << endl;
  cout << "int: " << myInt << endl;
  cout << "float: " << myFloat << endl;
  cout << "double: " << myDouble << endl;

  // More complex types of data
  string myString = "Hello";
  array<int, 5> myArray = {1, 2, 3, 4, 5};

  // Print these complex types using our function
  printNonPrims(myString, myArray);

  return 0;
}
