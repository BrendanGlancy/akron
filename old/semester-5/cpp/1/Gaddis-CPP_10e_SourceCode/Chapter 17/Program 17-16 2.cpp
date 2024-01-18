#include <iostream>
#include <string>
#include <map>
#include "Contact.h"
using namespace std;

int main()
{
   // Create a map holding the Contact objects.
   map<string, Contact> contacts =
    {{ "Ashley Miller", Contact("Ashley Miller", "amiller@faber.edu") },
     { "Jacob Brown",   Contact("Jacob Brown", "jbrown@gotham.edu") },
     { "Emily Ramirez", Contact("Emily Ramirez", "eramirez@coolidge.edu")}
    };

   // Display all objects in the map.
   for (auto element : contacts)
   {
      cout << element.second.getName() << "\t"
           << element.second.getEmail() << endl;
   }

   return 0;
}