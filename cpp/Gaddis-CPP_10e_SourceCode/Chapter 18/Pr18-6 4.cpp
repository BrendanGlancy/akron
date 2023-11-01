// This program demonstrates the STL list container.
#include <iostream>
#include <list>
using namespace std;

int main()
{
   // Define an empty list.
   list<int> myList;

   // Add some values to the list.
   for (int x = 0; x < 100; x += 10)
      myList.push_back(x);

   // Use an iterator to display the values.
   for (auto it = myList.begin(); it != myList.end(); it++)
      cout << *it << " ";
   cout << endl;

   // Now reverse the order of the elements.
   myList.reverse();

   // Display the values again, with a range-based for loop
   for (auto element : myList)
      cout << element << " ";
   cout << endl;

   return 0;
}