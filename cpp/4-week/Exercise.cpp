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
#include <cctype>
using namespace std;

int main() {
  string dealerName;
  int vehicleQuantity;
  char vehicleType;

  cout << "Enter Dealer Name and Model: ";
  getline(cin, dealerName);

  // Prompt the user for the vehicle quantity and type
  cout << "Enter vehicle quantity: ";
  cin >> vehicleQuantity;

  cout << "Enter vehicle type (C or P): ";
  cin >> vehicleType;
  vehicleType = toupper(vehicleType);

  // add some error checking here to make sure the user entered a valid type
  while (vehicleType != 'C' && vehicleType != 'P') {
    cout << "Invalid vehicle type. Please enter C or P: " << endl;
    cout << "Enter vehicle quantity: ";
    cin >> vehicleType;
    vehicleType = toupper(vehicleType);

    if (vehicleType == 'X') {
      break;
    }
  }

  // Enter some helpful output so the user knows what they're looking at
  cout << "Dealer Name: " << dealerName << endl;
  cout << "Vehicle Quantity: " << vehicleQuantity << " Type: " << vehicleType << endl;

  return 0;
}
