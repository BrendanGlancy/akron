#include <iostream>
#include <string>
#include <map>
#include "Contact.h"
using namespace std;

int main()
{
   // Create some Contact objects
   Contact contact1("Ashley Miller", "amiller@faber.edu");
   Contact contact2("Jacob Brown", "jbrown@gotham.edu");
   Contact contact3("Emily Ramirez", "eramirez@coolidge.edu");

   // Create a map to hold the Contact objects.
   map< string, Contact> contacts;

   // Add the contact objects to the map.
   contacts[contact1.getName()] = contact1;
   contacts[contact2.getName()] = contact2;
   contacts[contact3.getName()] = contact3;

   // Display all objects in the map.
   for (auto element : contacts)
   {
      cout << element.second.getName() << "\t"
           << element.second.getEmail() << endl;
   }

   return 0;
}