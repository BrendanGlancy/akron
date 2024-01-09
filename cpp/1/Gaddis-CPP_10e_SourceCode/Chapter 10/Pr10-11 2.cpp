// This program demonstrates how the getline function can
// be used for all of a program's input.
#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int main()
{
   string input;       // To hold a line of input
   string name;        // To hold a name
   int idNumber;       // To hold an ID number.
   int age;            // To hold an age
   double income;      // To hold income
   
   // Get the user's ID number.
   cout << "What is your ID number? ";
   getline(cin, input);            // Read as a string
   idNumber = stoi(input);         // Convert to int
   
   // Get the user's name. No conversion necessary.
   cout << "What is your name? ";
   getline(cin, name);
   
   // Get the user's age.
   cout << "How old are you? ";
   getline(cin, input);            // Read as a string
   age = stoi(input);              // Convert to int

   // Get the user's income.
   cout << "What is your annual income? ";
   getline(cin, input);            // Read as a string
   income = stod(input);           // Convert to double

   // Show the resulting data.
   cout << setprecision(2) << fixed << showpoint;
   cout << "Your name is " << name
        <<", you are " << age 
        << " years old,\nand you make $" 
        << income << " per year.\n";

   return 0;
} 