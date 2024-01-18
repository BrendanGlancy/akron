// This program demonstrates how to sort and search a
// string vector using selection sort and binary search.
#include <iostream>
#include <string>
#include <vector>
using namespace std;

// Function prototypes
void selectionSort(vector<string> &);
void swap(string &, string &);
int binarySearch(const vector<string> &, string);

int main()
{
   string searchValue;  // Value to search for
   int position;        // Position of found value

   // Define a vector of strings.
   vector<string> names{ "Lopez", "Smith", "Pike", "Jones",
                         "Abernathy", "Hall", "Wilson", "Kimura",
                         "Alvarado", "Harrison", "Geddes", "Irvine" };

   // Sort the vector.
   selectionSort(names);

   // Display the vector's elements.
   cout << "Here are the sorted names:\n";
   for (auto element : names)
      cout << element << endl;
   cout << endl;

   // Search for a name.
   cout << "Enter a name to search for: ";
   getline(cin, searchValue);
   position = binarySearch(names, searchValue);
   
   // Display the results.
   if (position != -1)
      cout << "That name is found at position " << position << endl;
   else
      cout << "That name is not found.\n";

   return 0;
}

//***********************************************************************
// The selectionSort function sorts a string vector in ascending order. *
//***********************************************************************
void selectionSort(vector<string> &v)
{
   int minIndex;
   string minValue;

   for (int start = 0; start < (v.size() - 1); start++)
   {
      minIndex = start;
      minValue = v[start];
      for (int index = start + 1; index < v.size(); index++)
      {
         if (v[index] < minValue)
         {
            minValue = v[index];
            minIndex = index;
         }
      }
      swap(v[minIndex], v[start]);
   }
}

//***************************************************
// The swap function swaps a and b in memory.       *
//***************************************************
void swap(string &a, string &b)
{
   string temp = a;
   a = b;
   b = temp;
}

//***************************************************************
// The binarySearch function performs a binary search on a      *
// string vector. array, which has a maximum of size elements,  *
// is searched for the number stored in value. If the number is *
// found, its vector subscript is returned. Otherwise, -1 is    *
// returned indicating the value was not in the vector.         *
//***************************************************************

int binarySearch(const vector<string> &v, string str)
{
   int first = 0,             // First vector element
      last = v.size() - 1,   // Last vector element
      middle,                // Mid point of search
      position = -1;         // Position of search value
   bool found = false;        // Flag

   while (!found && first <= last)
   {
      middle = (first + last) / 2; // Calculate mid point
      if (v[middle] == str)        // If value is found at mid
      {
         found = true;
         position = middle;
      }
      else if (v[middle] > str)    // If value is in lower half
         last = middle - 1;
      else
         first = middle + 1;      // If value is in upper half
   }
   return position;
}
