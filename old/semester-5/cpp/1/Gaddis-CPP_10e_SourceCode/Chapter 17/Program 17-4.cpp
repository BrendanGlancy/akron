#include <iostream>
#include <vector>
using namespace std;

int main()
{
   const int SIZE = 10;

   // Define a vector to hold 10 int values.
   vector<int> numbers(SIZE);

   // Store the values 0 through 9 in the vector.
   for (int index = 0; index < numbers.size(); index++)
      numbers[index] = index;

   // Display the vector elements.
   for (auto element : numbers)
      cout << element << " ";
   cout << endl;
   
   return 0;
}
