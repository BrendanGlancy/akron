#include <iostream>
#include <vector>
using namespace std;

int main()
{
   // Define a vector with 5 int values.
   vector<int> numbers = {1, 2, 3, 4, 5};

   // Define an iterator pointing to the 2nd element.
   auto it = numbers.begin() + 1;

   // Insert a new element with the value 99.
   numbers.insert(it, 99);

   // Display the vector elements.
   for (auto element : numbers)
      cout << element << " ";
   cout << endl;
   
   return 0;
}