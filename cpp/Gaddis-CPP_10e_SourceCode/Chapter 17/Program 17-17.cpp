#include <iostream>
#include <map>
#include "Customer.h"
using namespace std;

int main()
{
   // Create some Customer objects.
   Customer customer1(1001, "Sarah Scott");
   Customer customer2(1002, "Austin Hill");
   Customer customer3(1003, "Megan Cruz");

   // Create a map to hold the seat assignments.
   map<Customer, string> assignments;

   // Use the map to store the seat assignments.
   assignments[customer1] = "1A";
   assignments[customer2] = "2B";
   assignments[customer3] = "3C";

   // Display all objects in the map.
   for (auto element : assignments)
   {
      cout << element.first.getName() << "\t"
           << element.second << endl;
   }

   return 0;
}