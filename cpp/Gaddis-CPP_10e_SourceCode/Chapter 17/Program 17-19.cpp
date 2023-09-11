// This program demonstrates an iterator with a map.
#include <iostream>
#include <string>
#include <map>
using namespace std;

int main()
{
   // Define a phonebook multimap.
   multimap<string, string> phonebook =
      { {"Will", "555-1212"}, {"Will", "555-0123"},
        {"Faye", "555-0707"}, {"Faye", "555-1234"},
        {"Sarah", "555-8787"}, {"Sarah", "555-5678"} };

   // Display the elements in the multimap.
   for (auto element : phonebook)
   {
      cout << element.first << "\t" 
           << element.second << endl;
   }
   return 0;
}
