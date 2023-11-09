#include <iostream>
#include <tuple>
using namespace std;

// Function prototype
tuple<int, int, int> getTestScores();

int main()
{
   // Get three test scores.
   auto [test1, test2, test3] = getTestScores();

   // Calculate and display the average.
   double average = (test1 + test2 + test3) / 3.0;
   cout << "The average of those scores is: "
        << average << endl;

   return 0;
}

//****************************************************
// The getTestScores function gets three test scores *
// from the user and returns them as a tuple.        *
//****************************************************

tuple<int, int, int> getTestScores()
{
   int score1, score2, score3;

   // Get three test scores.
   cout << "Enter three test scores: ";
   cin >> score1 >> score2 >> score3;

   // Return them as a tuple.
   return make_tuple(score1, score2, score3);
}