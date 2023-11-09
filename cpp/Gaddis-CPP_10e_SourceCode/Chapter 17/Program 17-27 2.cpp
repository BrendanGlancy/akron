#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
   const int MAX = 5;         // Numbers in 1 lottery ticket
   vector<int> winning(MAX);  // The winning numbers
   vector<int> player(MAX);   // Numbers on a ticket

   // Get the winning numbers.
   cout << "Enter the " << MAX << " winning numbers:\n";
   for (auto &element : winning)
   {
      cout << "> ";
      cin >> element;
   }

   // Get the numbers purchased on a lottery ticket.
   cout << "\nEnter your " << MAX << " lottery numbers:\n";
   for (auto &element : player)
   {
      cout << "> ";
      cin >> element;
   }

   // Check for a winner.
   if (is_permutation(winning.begin(), winning.end(),
                      player.begin()))
      cout << "You won the lottery!\n";
   else
      cout << "Sorry, you did not win.\n";

   return 0;
}