#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
   int searchValue;   // Value to search for

   // Create a vector of unsorted integers.
   vector<int> numbers = { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };

   // Sort the vector.
   sort(numbers.begin(), numbers.end());

   // Display the vector.
   cout << "Here are the sorted values:\n";
   for (auto element : numbers)
      cout << element << " ";
   cout << endl;

   // Get the value to search for.
   cout << "Enter a value to search for: ";
   cin >> searchValue;

   // Search for the value.
   if (binary_search(numbers.begin(), numbers.end(), searchValue))
      cout << "That value is in the vector.\n";
   else
      cout << "That value is not in the vector.\n";

   return 0;
}