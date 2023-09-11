#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function prototype
bool outOfRange(int);

int main()
{
   // Create a vector of ints.
   vector<int> numbers = { 0, 99, 120, -33, 10, 8, -1, 101 };

   // Get the number of elements that are < 0 or > 100.
   int invalid = count_if(numbers.begin(), numbers.end(), outOfRange);

   // Display the results.
   cout << "There are " << invalid << " elements out of range.\n";
   return 0;
}

//*************************************************************
// The outOfRange function returns true if n is out of range. *
//*************************************************************
bool outOfRange(int n)
{
   // Constants for min and max values
   const int MIN = 0, MAX = 100;

   // Flag to hold the status
   bool status;

   // Determine whether n out of range.
   if (n < MIN || n > MAX)
      status = true;
   else
      status = false;

   return status;
}