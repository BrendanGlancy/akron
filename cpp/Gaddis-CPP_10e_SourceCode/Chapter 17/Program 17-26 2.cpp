#include <iostream>
#include <vector>
#include <algorithm>
#include "Customer.h"
using namespace std;

int main()
{
   int searchValue;   // Value to search for

   // Create a vector of unsorted Customer objects.
   vector<Customer> customers =
   { Customer(1003, "Megan Cruz"),
     Customer(1001, "Sarah Scott"),
     Customer(1002, "Austin Hill")
   };

   // Sort the vector.
   sort(customers.begin(), customers.end());

   // Display the vector.
   cout << "Here are the sorted customers:\n";
   for (auto element : customers)
   {
      cout << element.getCustNumber() << " "
         << element.getName() << endl;
   }
   cout << endl;

   // Get the customer number to search for.
   cout << "Enter a customer number to search for: ";
   cin >> searchValue;

   // Search for the customer number.
   if (binary_search(customers.begin(), customers.end(), 
                    Customer(searchValue, "")))
      cout << "That customer is in the vector.\n";
   else
      cout << "That customer is not in the vector.\n";

   return 0;
}