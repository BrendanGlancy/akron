// This program uses relational operators to compare a string
// entered by the user with valid part numbers.
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

int main()
{
   const double PRICE_A = 249.0,  // Price for part A
                PRICE_B = 199.0;  // Price for part B

   string partNum;                // Holds a part number

   // Display available parts and get the user's selection
   cout << "The headphone part numbers are:\n"
        << "Noise canceling: part number S-29A \n"
        << "Wireless: part number S-29B \n"
        << "Enter the part number of the headphones you\n"
        << "wish to purchase: ";
   cin >> partNum;

   // Set the numeric output formatting
   cout << fixed << showpoint << setprecision(2);

   // Determine and display the correct price
   if (partNum == "S-29A")
      cout << "The price is $" << PRICE_A << endl;
   else if (partNum == "S-29B")
      cout << "The price is $" << PRICE_B << endl;
   else
      cout << partNum << " is not a valid part number.\n";
   return 0;
}