// Implementation file for the Player class
#include "Player.h"
#include <random>
#include <string>
using namespace std;

//**********************************************
// Constructor                                 *
//**********************************************
Player::Player(string playerName)
{
   name = playerName;
   guess = "";
   points = 0;
}

//**********************************************
// The makeGuess member function causes the    *
// player to make a guess, either "Cho (even)" *
// or "Han (odd)".                             *
//**********************************************
void Player::makeGuess()
{
    const int MIN = 0;  // Mimimum random value
    const int MAX = 1;  // Maximum random value
    int guessNumber;    // For the user's guess

   // Define a random number engine and a distribution object.
   random_device engine;
   uniform_int_distribution<int> randomGuess(MIN, MAX);

    // Get a random number, either 0 or 1.
    guessNumber = randomGuess(engine);

    // Convert the random number to Cho or Han.
    if (guessNumber == 0)
       guess = "Cho (even)";
    else
       guess = "Han (odd)";
}

//**********************************************
// The addPoints member function adds a        *
// specified number of points to the player's  *
// current balance.                            *
//**********************************************
void Player::addPoints(int newPoints)
{
   points += newPoints;
}

//**********************************************
// The getName member function returns a       *
// player's name.                              *
//**********************************************
string Player::getName()
{
   return name;
}

//**********************************************
// The getGuess member function returns a      *
// player's guess.                             *
//**********************************************
string Player::getGuess()
{
   return guess;
}

//**********************************************
// The getPoints member function returns a     *
// player's points.                            *
//**********************************************
int Player::getPoints()
{
   return points;
}