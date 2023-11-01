#include <iostream>
#include <set>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
   // Create two sets.
   set<int> set1 = { 1, 2, 3, 4 };
   set<int> set2 = { 3, 4, 5, 6 };
   
   // Create a vector to hold the symmetric difference.
   // The vector must be large enough to hold both sets.
   vector<int> result(set1.size() + set2.size());

   // Get the symmetric difference of the sets. The result
   // vector will hold the symmetric difference, and iter
   // will point to the end of the result vector.
   auto iter = set_symmetric_difference(set1.begin(), set1.end(),
                                        set2.begin(), set2.end(), 
                                        result.begin());

   // Resize the result vector to remove unused elements.
   result.resize(iter - result.begin());

   // Display the result vector's elements
   cout << "The symmetric difference of the sets is:\n";
   for (auto element : result)
   {
      cout << element << " ";
   }
   cout << endl;

   return 0;
}
