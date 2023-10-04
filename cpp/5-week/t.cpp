#include <iostream>
using namespace std;

int main() {
  int counter = 0;

  // basic while loop with a counter
  while (counter < 10) {
    cout << "counter = " << counter << endl;
    counter++;
  }

  do {
    cout << "counter = " << counter << endl;
    counter++;
  } while (counter < 10);

  for (int i = 0; i < 10; i++) {
    cout << "i = " << i << endl;
  }

  // What types are appropriate for values 3 and '3' and “3”
  // int, char, string
  int a = 3;
  char b = '3';
  string c = "3";

  /**
    * Name too good practices for doing comments
    * 1. Use comments to explain why you are doing something
    * 2. Use comments to explain how you are doing something
    */

  // explain the usage of << and >>
  // << is used to output to the console
  // >> is used to input from the console
  
  // give the usage of the ++ operator, and explain the difference between ++i and i++
  // ++i is pre-increment, i++ is post-increment pre-increment increments the value of i before it is used
  
  /**
    * Section B (15 points).  Answer ALL parts of ALL three questions for five points each.  I'm expecting answers in words, but feel free to include code where appropriate. 
    *
    * 1. IDE:  describe our IDE and identify three specific points relative to our successful use: could be features that we use OR things, if done, wrong, will prevent us from running (and saving) our code.
    *
    * The IDE we use in class is Visual Studio Code. It is a text editor that allows us to write code in a variety of languages. It has a built in terminal that allows us to run our code. It also has a built in debugger that allows us to step through our code and see what is happening at each step. When you download VS code it doesn't come with anything to help us write and run cpp code. To run and write cpp code you must first download a compiler like g++ or clangd, and to help with code snippets and better syntax highlight VS Code provides cpp tool in their store.
    * 
    *
    * 2. Explain how to best obtain valid user input when we are seeking a valid character from a set of valid characters;  be sure to mention options like X or Q to exit or quitting.  For an extra point, explain what must be done with the extra \n that follows character entry.
    *
    * In programming there is soemthing commonly referred to as a game loop. This is a loop that runs until a certain condition is met. In our case we want to run a loop until the user enters a valid character. We can do this by using a while loop. We can use a while loop to run until the user enters a valid character. We can use a switch statement to check if the user entered a valid character. If the user enters a valid character we can break out of the loop. If the user enters an invalid character we can print an error message and continue the loop. We can also add a condition to exit the loop if the user enters a certain character like X or Q.
    *
    * 3. Compare and contrast use of if-else and switch-case commands.  To compare is to list similarities, to contrast is to list differences – two of each, minimum.
    *
    * The if-else statement is used to check if a condition is true or false. If the condition is true the code in the if block is executed. If the condition is false the code in the else block is executed. The switch-case statement is used to check if a variable is equal to a certain value. If the variable is equal to the value the code in the case block is executed. If the variable is not equal to the value the code in the default block is executed.
    * There are certain sceniros that are better suited for if-else statements and certain scenarios that are better suited for switch-case statements. If-else statements are better suited for checking if a condition is true or false. Switch-case statements are better suited for checking if a variable is equal to a certain value.
    *
    */
}

