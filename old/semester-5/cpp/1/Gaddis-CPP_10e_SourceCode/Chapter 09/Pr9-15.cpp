// This program demonstrates a function that returns a pointer.
#include <iostream>
#include <random>
using namespace std;

// Function prototype
int *getRandomNumbers(int);

int main()
{
   int* numbers;  // To point to the numbers

   // Get an array of five random numbers.
   numbers = getRandomNumbers(5);

   // Display the numbers.
   for (int count = 0; count < 5; count++)
      cout << numbers[count] << endl;

   // Free the memory.
   delete[] numbers;
   numbers = nullptr;
   return 0;
}

//********************************************************
// The getRandomNumbers function returns a pointer to an *
// array of random integers. The num parameter is the    *
// number of numbers requested.                          *
//********************************************************

int *getRandomNumbers(int num)
{
   const int MIN = 0;     // Minimum random number
   const int MAX = 100;   // Maximum random number
   int* arr = nullptr;     // Array to hold the numbers
   
   // Random number engine and distribution object
   random_device engine;
   uniform_int_distribution<int> randInt(MIN, MAX);

   // Return null if num is zero or negative.
   if (num <= 0)
      return nullptr;

   // Dynamically allocate the array.
   arr = new int[num];

   // Populate the array with random numbers.
   for (int count = 0; count < num; count++)
      arr[count] = randInt(engine);

   // Return a pointer to the array.
   return arr;
}