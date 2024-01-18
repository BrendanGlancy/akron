#include <iostream>
#include <set>
#include "Customer.h"
using namespace std;

int main()
{
   // Create a set of Customer objects.
   set<Customer> customerset =
     { Customer(1003, "Megan Cruz"),
       Customer(1002, "Austin Hill"),
       Customer(1001, "Sarah Scott")
     };

   // Try to insert a duplicate customer number.
   customerset.emplace(1001, "Evan Smith");

   // Display the set elements
   cout << "List of customers:\n";
   for (auto element : customerset)
   {
      cout << element.getCustNumber() << " " 
           << element.getName() << endl;
   }

   // Search for customer number 1002.
   cout << "\nSearching for Customer Number 1002:\n";
   auto it = customerset.find(Customer(1002, ""));

   if (it != customerset.end())
      cout << "Found: " << it->getName() << endl;
   else
      cout << "Not found.\n";

   return 0;
}