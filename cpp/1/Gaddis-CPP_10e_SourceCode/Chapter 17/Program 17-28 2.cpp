#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function prototype
void doubleNumber(int &);

int main()
{
   vector<int> numbers = { 1, 2, 3, 4, 5 };

   // Display the numbers before doubling.
   for (auto element : numbers)
      cout << element << " ";
   cout << endl;

   // Double the value of each vector element.
   for_each(numbers.begin(), numbers.end(), doubleNumber);

   // Display the numbers before doubling.
   for (auto element : numbers)
      cout << element << " ";
   cout << endl;

   return 0;
}

//****************************************************
// The doubleNumber function doubles the value of n. *
//****************************************************
void doubleNumber(int &n)
{
   n = n * 2;
}