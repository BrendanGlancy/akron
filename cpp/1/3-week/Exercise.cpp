/**
* Prompt
* Accept info for Dealer Name; Vehicle Quantity; Vehicle type (C or P)
* - Dealer is a string type, quantity is an integer, type is a char
*
* Output format
* - First line: Dealer Name
* - Second line: Total number of vehicles then a space, then the word type and spcae, then type
*
* Sample input
* Park Ford
* 12 Type C
*
*/

#include <iostream>
#include <string>
using namespace std;

int main() {
  string dealerName;
  int vehicleQuantity;
  char vehicleType;

  cout << "Enter vehicle quantity and type: ";
  getline(cin, dealerName);

  // Prompt the user for the vehicle quantity and type
  cout << "Enter vehicle quantity and type: (ex: 12 Type C)";
  cin >> vehicleQuantity >> vehicleType;
  // add some error checking here to make sure the user entered a valid type
  if (vehicleType != 'C' && vehicleType != 'P') {
    cout << "Invalid vehicle type. Please enter C or P." << endl;
    return 1;
  }

  // Enter some helpful output so the user knows what they're looking at
  cout << "Dealer Name: " << dealerName << endl;
  cout << "Vehicle Quantity: " << vehicleQuantity << endl;
  cout << "Vehicle Type: " << vehicleType << endl;
}
