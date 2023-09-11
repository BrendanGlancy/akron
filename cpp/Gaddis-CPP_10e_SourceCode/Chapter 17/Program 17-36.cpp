#include <iostream>
#include "Sum.h"
using namespace std;

int main()
{
   // Local variables
   int x = 10;
   int y = 2;
   int z = 0;

   // Create a Sum object.
   Sum sum;

   // Call the sum function object.
   z = sum(x, y);

   // Display the result.
   cout << z << endl;

   return 0;
}
