#include <iostream>
#include <string>
#include <algorithm>
#include <set>
#include <vector>
using namespace std;

// Function prototypes
void displaySet(set<string>);
void displayIntersection(set<string>, set<string>);
void displayUnion(set<string>, set<string>);
void displayDifference(set<string>, set<string>);
void displaySymmetricDifference(set<string>, set<string>);

int main()
{
   // Create sets for the baseball & basketball teams.
   set<string> baseball = { "Jodi", "Carmen", "Aida", "Alicia" };
   set<string> basketball = { "Eva", "Carmen", "Alicia", "Sarah" };

   // Display the elements of the baseball set.
   cout << "The following students are on the baseball team:\n";
   displaySet(baseball);

   // Display the elements of the basketball set.
   cout << "\n\nThe following students are on the basketball team:\n";
   displaySet(basketball);

   // Display the intersection of the two sets.
   cout << "\n\nThe following students play both sports:\n";
   displayIntersection(baseball, basketball);

   // Display the union of the two sets.
   cout << "\n\nThe following students play either sport:\n";
   displayUnion(baseball, basketball);

   // Display the difference of baseball and basketball.
   cout << "\n\nThe following students play baseball, "
        << "but not basketball:\n";
   displayDifference(baseball, basketball);

   // Display the difference of basketball and baseball.
   cout << "\n\nThe following students play basketball, "
        << "but not baseball:\n";
   displayDifference(basketball, baseball);

   // Display the symmetric difference of the two sets.
   cout << "\n\nThe following students play one sport, "
        << "but not both:\n";
   displaySymmetricDifference(basketball, baseball);
   return 0;
}

// The displaySet function displays the contents of a set<string>.
void displaySet(set<string> s)
{
   for (auto element : s)
      cout << element << " ";
}

// The displayIntersection function displays the intersection
// of two set<string> objects.
void displayIntersection(set<string> set1, set<string> set2)
{
   // Create a vector to hold the intersection. 
   vector<string> result(set1.size() + set2.size());

   // Get the intersection of the sets. 
   auto iter = set_intersection(set1.begin(), set1.end(),
                                set2.begin(), set2.end(),
                                result.begin());

   // Resize the result vector to remove unused elements.
   result.resize(iter - result.begin());

   // Display the result vector's elements
   for (auto element : result)
   {
      cout << element << " ";
   }
}

// The displayUnion function displays the union of two
// set<string> objects.
void displayUnion(set<string> set1, set<string> set2)
{
   // Create a vector to hold the union. 
   vector<string> result(set1.size() + set2.size());

   // Get the union of the sets. 
   auto iter = set_union(set1.begin(), set1.end(),
                         set2.begin(), set2.end(),
                         result.begin());

   // Resize the result vector to remove unused elements.
   result.resize(iter - result.begin());

   // Display the result vector's elements
   for (auto element : result)
   {
      cout << element << " ";
   }
}

// The displayDifference function displays the difference
// of two set<string> objects.
void displayDifference(set<string> set1, set<string> set2)
{
   // Create a vector to hold the union. 
   vector<string> result(set1.size() + set2.size());

   // Get the difference of the sets. 
   auto iter = set_difference(set1.begin(), set1.end(),
                              set2.begin(), set2.end(),
                              result.begin());

   // Resize the result vector to remove unused elements.
   result.resize(iter - result.begin());

   // Display the result vector's elements
   for (auto element : result)
   {
      cout << element << " ";
   }
}

// The displaySymmetricDifference function displays the
// symmetric difference of two set<string> objects.
void displaySymmetricDifference(set<string> set1, set<string> set2)
{
   // Create a vector to hold the union. 
   vector<string> result(set1.size() + set2.size());

   // Get the symmetric difference of the sets. 
   auto iter = set_symmetric_difference(set1.begin(), set1.end(),
                                        set2.begin(), set2.end(),
                                        result.begin());

   // Resize the result vector to remove unused elements.
   result.resize(iter - result.begin());

   // Display the result vector's elements
   for (auto element : result)
   {
      cout << element << " ";
   }
}