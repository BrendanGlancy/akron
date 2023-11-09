#include <iostream>
#include <vector>
#include "Product.h"
using namespace std;

int main()
{
   // Create a vector of Product objects.
   vector<Product> products =
   {
      Product("T-Shirt", 20),
      Product("Calendar", 25),
      Product("Coffee Mug", 30)
   };

   // Display the vector elements.
   for (auto element : products)
   {
      cout << "Product: " << element.getName() << endl
           << "Units: " << element.getUnits() << endl;
   }

   return 0;
}
