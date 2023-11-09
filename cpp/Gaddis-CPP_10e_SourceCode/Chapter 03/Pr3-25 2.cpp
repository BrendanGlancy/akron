// This program simulates rolling dice.
#include <iostream>
#include <random>
using namespace std;

int main()
{
   // Constants
   const int MIN = 1;   // Minimum dice value
   const int MAX = 6;   // Maximum dice value

   // Random number engine
   random_device engine;

   // Distribution object
   uniform_int_distribution<int> diceValue(MIN, MAX);

   cout << "Rolling the dice...\n";
   cout << diceValue(engine) << endl;
   cout << diceValue(engine) << endl;
   return 0;
}
