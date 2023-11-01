#include <iostream>
#include <map>
using namespace std;

int main()
{
   // Define a phonebook multimap.
   multimap<string, string> phonebook =
   { {"Will", "555-1212"}, {"Will", "555-0123"},
     {"Faye", "555-0707"}, {"Faye", "555-1234"},
     {"Sarah", "555-8787"}, {"Sarah", "555-5678"} };

   // Get the range of elements that match "Faye".
   auto range = phonebook.equal_range("Faye");

   // Display all of the elements that match "Faye".
   for (auto iter = range.first; iter != range.second; iter++)
   {
      cout << iter->first << "\t" << iter->second << endl;
   }

   return 0;
}