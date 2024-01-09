/**
 * @file main.cpp
 * @brief Dealer and Vehicle Info Collector
 * @author: Brendan Glancy
 *
 * This program prompts the user to input the dealer name, vehicle quantity,
 * and vehicle type (either 'C' or 'P'). It then outputs this information
 * in a user-friendly format.
 *
 * Sample Input: 
 *  - Dealer Name: Park Ford
 *  - Vehicle Quantity: 12
 *  - Vehicle Type: C
 *  
 * Sample Output:
 *  - Dealer Name: Park Ford
 *  - Vehicle Quantity: 12 Type: C
 */

#include <iostream>
#include <string>
#include <cctype>
#include <limits>
using namespace std;

int main() {
  // Declare variables
  string dealerName;
  string vehicleName;
  int vehicleQuantity;
  char vehicleType;

  /**
   * @section Input Section
   * Prompt and set the value for dealerName
   */
  cout << "Ford Dealerships: " << endl;
  cout << "1. Park Ford" << endl;
  cout << "2. Bob Ford" << endl;
  cout << "3. Joe Ford" << endl;
  cout << "Select a Dealer (1, 2, 3): ";

  switch (getchar()) {
    case '1':
      dealerName = "Park Ford";
    case '2':
      dealerName = "Bob Ford";
    case '3':
      dealerName = "Joe Ford";
    default:
      cout << "Invalid input" << endl;
      break;
  }
  
  cin.clear();

  /**
   * @section Vehicle Name Section
   * Prompt and set the value for vehicleName
   */
  cout << "Vehicle Choices: " << endl;
  cout << "1. Ford Bronco" << endl;
  cout << "2. Ford F150" << endl;
  cout << "3. Ford Mustang" << endl;

  cout << "Select a Vehicle (1, 2, 3): ";

  switch (getchar()) {
    case '1':
      vehicleName = "Ford Bronco";
    case '2':
      vehicleName = "Ford F150";
    case '3':
      vehicleName = "Ford Mustang";
    default:
      cout << "Invalid input" << endl;
      break;
  }

  cin.clear();

  /**
   * @section Input Section
   * Prompt and set the value for vehicleQuantity and vehicleType
   */
  cout << "Enter vehicle quantity: ";
  cin >> vehicleQuantity;
  
  cout << "Enter vehicle type (C or P): ";
  cin >> vehicleType;
  vehicleType = toupper(vehicleType);

  /**
   * @section Validation Section
   * Loop until a valid vehicle type ('C' or 'P') is entered
   */
  while (vehicleType != 'C' && vehicleType != 'P') {
    // Display an error message
    cout << "Invalid vehicle type. Please enter C or P: " << endl;

    // Re-prompt for vehicle type
    cin >> vehicleType;
    vehicleType = toupper(vehicleType);

    // If the vehicle type is 'X', break the loop (for testing purposes)
    if (vehicleType == 'X') {
      break;
    }
  }

  /**
   * @section Output Section
   * Output the dealer name, vehicle name, vehicle quantity, and vehicle type
   */
  cout << "Dealer Name: " << dealerName << endl;
  cout << "Vehicle Name: " << vehicleName << endl;
  cout << "Vehicle Quantity: " << vehicleQuantity << " Type: " << vehicleType << endl;

  return 0;
}
