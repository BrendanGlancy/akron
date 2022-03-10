// Name: Austin Coontz
// Date: 3/7/2022
// Description: This program will take a number and print out the number of
// times the number is divisible by 3, 5, and 7. Also it wil echo hello world to
// the command line.

// Importing the libraries
// Standard libraries
#include <stdio.h>
#include <stdlib.h>

// This program will include multiple variables and functions

// Function to see if a number is divisible by 3, 5, or 7
// This function will take in a number and return a boolean
int isDivisible(int number) {
  // If the number is divisible by 3, 5, or 7, return true
  if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
    return 1;
  }
  // If the number is not divisible by 3, 5, or 7, return false
  else {
    return 0;
  }
}

// Function to display hello world to the command line
// This function will take in no parameters and return nothing
void displayHelloWorld() {
  // Print out hello world to the command line
  // Do this 10 times
  for (int i = 0; i < 10; i++) {
    printf("Hello World!\n");
  }
}

// Function to do ifconfig
// This function will take in no parameters and return nothing
// This function will print out the ip address of the computer
void doIfconfig() {
  // Print out the ip address of the computer
  system("ifconfig");
}

// Main function
// This function will take in no parameters and return nothing
// This function will call the other functions
int main() {
  // Declare variables
  int number;
  int divisibleBy3;
  int divisibleBy5;
  int divisibleBy7;
  int divisibleBy3And5;
  int divisibleBy3And7;
  int divisibleBy5And7;
  int divisibleBy3And5And7;

  // Prompt the user to enter a number
  printf("Enter a number: ");
  // Read in the number
  scanf("%d", &number);

  // Call the isDivisible function to see if the number is divisible by 3, 5, or
  // 7
  divisibleBy3 = isDivisible(number);
  divisibleBy5 = isDivisible(number);
  divisibleBy7 = isDivisible(number);
  divisibleBy3And5 = isDivisible(number);
  divisibleBy3And7 = isDivisible(number);
  divisibleBy5And7 = isDivisible(number);
  divisibleBy3And5And7 = isDivisible(number);

  // Print out the number of times the number is divisible by 3, 5, or 7
  printf("The number is divisible by 3 %d times\n", divisibleBy3);
  printf("The number is divisible by 5 %d times\n", divisibleBy5);
  printf("The number is divisible by 7 %d times\n", divisibleBy7);
  printf("The number is divisible by 3 and 5 %d times\n", divisibleBy3And5);

  // print hello world to the command line
  displayHelloWorld();
  doIfconfig();
}
