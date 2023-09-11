#include <iostream>
#include <string>
#include <map>
#include "Contact.h"
using namespace std;

int main()
{
   string searchName;   // The name to search for

   // Create some Contact objects
   Contact contact1("Ashley Miller", "amiller@faber.edu");
   Contact contact2("Jacob Brown", "jbrown@gotham.edu");
   Contact contact3("Emily Ramirez", "eramirez@coolidge.edu");

   // Create a map to hold the Contact objects.
   map<string, Contact> contacts;

   // Add the contact objects to the map.
   contacts[contact1.getName()] = contact1;
   contacts[contact2.getName()] = contact2;
   contacts[contact3.getName()] = contact3;

   // Get the name to search for.
   cout << "Enter a name: ";
   getline(cin, searchName);

   // Search for the name.
   auto iter = contacts.find(searchName);

   // Display the results.
   if (iter != contacts.end())
   {
      cout << "Name: " << iter->second.getName() << endl;
      cout << "Email: " << iter->second.getEmail() << endl;
   }
   else
   {
      cout << "Contact not found.\n";
   }

   return 0;
}