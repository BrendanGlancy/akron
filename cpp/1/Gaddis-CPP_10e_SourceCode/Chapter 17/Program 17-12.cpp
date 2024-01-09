#include <iostream>
#include <string>
#include <vector>
#include <map>
using namespace std;

int main()
{
   // Create vectors to hold test scores.
   vector<int> student1Scores = { 88, 92, 100 };
   vector<int> student2Scores = { 95, 74, 81 };
   vector<int> student3Scores = { 72, 88, 91 };
   vector<int> student4Scores = { 70, 75, 78 };

   // Create a map to hold all the test scores.
   map<string, vector<int>> testScores;
   testScores["Kayla"] = student1Scores;
   testScores["Luis"] = student2Scores;
   testScores["Sophie"] = student3Scores;
   testScores["Ethan"] = student4Scores;

   // Display each student's test scores.
   for (auto element : testScores)
   {
      // Display the student name.
      cout << "Student: " << element.first << endl;

      // Display the student's test scores.
      for (int i = 0; i < element.second.size(); i++)
      {
         cout << "\t" << element.second[i] << endl;
      }
   }
   return 0;
}
