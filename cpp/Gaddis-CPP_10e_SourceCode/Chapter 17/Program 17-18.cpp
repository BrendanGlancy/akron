#include <iostream>
#include <map>
#include "Customer.h"
using namespace std;

int main()
{
   // Create a map to hold the seat assignments.
   map<Customer, string> assignments =
   { { Customer(1001, "Sarah Scott"), "1A"},
     { Customer(1002, "Austin Hill"), "2B"},
     { Customer(1003, "Megan Cruz"), "3C" } };

   // Display all objects in the map.
   for (auto element : assignments)
   {
      cout << element.first.getName() << "\t"
           << element.second << endl;
   }

   return 0;
}