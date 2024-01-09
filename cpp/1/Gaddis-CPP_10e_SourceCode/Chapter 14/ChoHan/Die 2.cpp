// Implememtation file for the Die class
#include <random>     // For rand and srand
#include "Die.h"
using namespace std;

//*******************************************************
// The constructor accepts an argument for the number   *
// of sides for the die, and performs a roll.           *
//*******************************************************
Die::Die(int numSides)
{
   // Set the number of sides.
   sides = numSides;
   
   // Perform an initial roll.
   roll();
}

//*******************************************************
// The roll member function simulates the rolling of    *
// the die.                                             *
//*******************************************************
void Die::roll()
{
   // Constant for the minimum die value
    const int MIN = 1;   // Minimum die value

   // Define a random number engine and a distribution object.
   random_device engine;
   uniform_int_distribution<int> diceValue(MIN, sides);

    // Get a random value for the die.
    value = diceValue(engine);
}

//*******************************************************
// The getSides member function returns the number of   *
// for this die.                                        *
//*******************************************************
int Die::getSides()
{
   return sides;
}

//*******************************************************
// The getValue member function returns the die's value.*
//*******************************************************
int Die::getValue()
{
   return value;
}

