#include <iostream>
#include <string>
#include <vector>
#include <map>
using namespace std;

int main()
{
   // Create vectors to hold test scores.
   map<string, vector<int>> testScores = 
       { {"Kayla", vector<int> {88, 92, 100 }},
         {"Luis", vector<int> {95, 74, 81 }},
         {"Sophie", vector<int> {72, 88, 91 }},
         {"Ethan", vector<int> {70, 75, 78 }} };

   // Display each student's test scores.
   for (auto element : testScores)
   {
      // Display the student name.
      cout << "Student: " << element.first << endl;

      // Display the student's test scores.
      for (auto score : element.second)
      {
         cout << "\t" << score << endl;
      }
   }
   return 0;
}
