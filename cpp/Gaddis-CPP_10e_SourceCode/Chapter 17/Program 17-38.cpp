#include <iostream>
#include <vector>
#include <algorithm>
#include "IsEven.h"
using namespace std;

int main()
{
   // Create a vector of ints.
   vector<int> v = { 1, 2, 3, 4, 5, 6, 7, 8 };

   // Get the number of elements that even.
   int evenNums = count_if(v.begin(), v.end(), IsEven());

   // Display the results.
   cout << "The vector contains " << evenNums << " even numbers.\n";
   return 0;
}