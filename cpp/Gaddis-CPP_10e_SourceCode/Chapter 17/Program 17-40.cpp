#include <iostream>
#include <vector>
#include <functional>
#include <algorithm>
using namespace std;

int main()
{
   // Create an unsorted vector of ints.
   vector<int> v = { 8, 1, 7, 2, 6, 3, 5, 4 };

   // Display the vector contents.
   cout << "Original order:\n";
   for (auto element : v)
      cout << element << " ";
   
   // Sort the vector in ascending order.
   sort(v.begin(), v.end());

   // Display the vector contents again.
   cout << "\nAscending order:\n";
   for (auto element : v)
      cout << element << " ";

   // Sort the vector in descending order.
   sort(v.begin(), v.end(), greater<int>());

   // Display the vector contents again.
   cout << "\nDescending order:\n";
   for (auto element : v)
      cout << element << " ";
   cout << endl;

   return 0;
}
