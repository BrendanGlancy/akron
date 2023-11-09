#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

int main()
{
   // Create two sets.
   set<int> set1 = { 1, 2, 3, 4 };
   set<int> set2 = { 2, 3 };

   // Determine whether set1 includes the
   // elements of set2.
   if (includes(set1.begin(), set1.end(),
                set2.begin(), set2.end()))
   {
      cout << "set2 is a subset of set1.\n";
   }
   else
   {
      cout << "set2 is NOT a subset of set1.\n";
   }

   return 0;
}