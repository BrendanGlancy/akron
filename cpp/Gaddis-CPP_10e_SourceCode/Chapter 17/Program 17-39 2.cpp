#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
   // Create a vector of ints.
   vector<int> v = { 1, 2, 3, 4, 5, 6, 7, 8 };

   // Use a lambda expression to create a function object.
   auto isEven = [](int x) {return x % 2 == 0; };

   // Get the number of elements that even.
   int evenNums = count_if(v.begin(), v.end(), isEven);

   // Display the results.
   cout << "The vector contains " << evenNums << " even numbers.\n";
   return 0;
}