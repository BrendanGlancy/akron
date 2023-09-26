/**
 * @file Exercise.cpp
 * @brief Our first graded project
 * @author: Brendan Glancy
 *
 *
 *  Specifications for first graded
 *  deliverable
 *   Call this the “one line order” [later tasks will be multiline]
 *   Nonvalidated header information: Dealer Name, Memo Reference
 *   Validated information
 *   Quantity
 *   Color {White, Gray, Black}
 *   EV or IC
 *   Note: EV is Cargo only, Medium length and roofline
 *   IC can be {C or P}; Cargo roofline {L,R,H} and wheelbase {S,M,E}
 *   Echo all inputs
 *   Write to file (one line, fields comma delimited)
 *   Later version will use objects for multiline
 *   Later later version will implement pricing
 *
 * Hints 
 *  Notional done - with each data entry do-while loop, then proceed
 *  Notional quit - no more data entry, do not write results
 */

#include <iostream>
#include <sstream>
#include <string>
#include <cctype>
#include <limits>
#include <fstream>
using namespace std;

/**
  * @brief Input validation
  *
  * Menu Letter Input
  *   For two choices: if-then-else
  *   For three or more choices: switch with default
  *   In addition to choices, include a “quit” option (Q or q)
  *   Meaning prompt (can include blank lines) optional default case 
  *   Intercept and warn errors
  *   Upper case outcome
  *   do-while suggested
  *
  * Numeric Input 
  *   Mostly same as above
  *   Range checking (1-99 incluse) could default to 1
  *
  */

int main() {
  // init
  char menuChoice;
  int quantity;
  string color;
  string evOrIc;
  string dealerName;
  string memoReference;
  string cargoRoofline;
  string wheelbase;
  string cargoOrPassenger;

  // menu
  cout << "-----------------------------------------------------------------" << endl;
  cout << " __          __         _                                     _ " << endl;
  cout << " \\ \\        / /        | |                                   | |" << endl;
  cout << "  \\ \\  /\\  / /    ___  | |   ___    ___    _ __ ___     ___  | |" << endl;
  cout << "   \\ \\/  \\/ /    / _ \\ | |  / __|  / _ \\  | '_ ` _ \\   / _ \\ | |" << endl;
  cout << "    \\  /\\  /    |  __/ | | | (__  | (_) | | | | | | | |  __/ |_|" << endl;
  cout << "     \\/  \\/      \\___| |_|  \\___|  \\___/  |_| |_| |_|  \\___| (_)" << endl;
  cout << "                                                                " << endl;
  cout << "                                                                " << endl;
  cout << "-----------------------------------------------------------------" << endl;
  cout << ">>>>> Please enter the following information: <<<<<" << endl;

  cout << "Dealer Name: ";
  if (!getline(cin, dealerName)) {
    cout << "Error reading dealer name" << endl;
    return 1;
  }

  cout << "Memo Reference: ";
  if (!getline(cin, memoReference)) {
    cout << "Error reading memo reference" << endl;
    return 1;
  }
  
  // quantity
  do {
      cout << "Quantity: ";
      string quantityStr;
      getline(cin, quantityStr);
      stringstream(quantityStr) >> quantity; // Convert string to int
      if (cin.fail() || quantity < 1 || quantity > 99) {
          cout << "Error reading quantity" << endl;
          return 1;
      }
  } while (quantity < 1 || quantity > 99);

  // menu
  do {
      cout << "Color (W)hite, (G)ray, (B)lack: ";
      string menuChoiceStr;
      getline(cin, menuChoiceStr);
      if (menuChoiceStr.empty()) {
          cout << "Error reading color" << endl;
          return 1;
      }
      menuChoice = toupper(menuChoiceStr[0]); // Convert string to char and make it uppercase
  } while (menuChoice != 'W' && menuChoice != 'G' && menuChoice != 'B');

  switch (menuChoice) {
    case 'W':
      color = "White";
      break;
    case 'G':
      color = "Gray";
      break;
    case 'B':
      color = "Black";
      break;
    default:
      cout << "Error reading color" << endl;
      return 1;
  }

  // color 
  do {
      cout << "EV or IC: ";
      getline(cin, evOrIc);
      if (evOrIc.empty()) {
          cout << "Error reading EV or IC" << endl;
          return 1;
      }
      evOrIc = string(1, toupper(evOrIc[0])); // Convert to uppercase
  } while (evOrIc != "E" && evOrIc != "I");

  if (evOrIc == "E") {
    evOrIc = "EV";
  } else {
    evOrIc = "IC";
  }

  // c or p if its not an ev
  if (evOrIc != "EV")
  {
    do {
      cout << "(C)argo or (P)assenger: ";
      getline(cin, cargoOrPassenger);
      if (!(cin >> menuChoice)) {
        cout << "Error reading C or P" << endl;
        return 1;
      }
      menuChoice = toupper(menuChoice);
    } while (menuChoice != 'C' && menuChoice != 'P');

    switch (menuChoice) {
      case 'C':
        cargoOrPassenger = "Cargo";
        break;
      case 'P':
        cargoOrPassenger = "Passenger";
        break;
      default:
        cout << "Error reading cargo roofline" << endl;
        return 1;
    }
  }

  // cargo cargoRoofline
  if (evOrIc == "EV") {
    cargoRoofline = "Medium";
  } else {
    do {
      cout << "Cargo Roofline (L)ow, (R)aised, (H)igh: ";
      getline(cin, cargoRoofline);
      if (!(cin >> menuChoice)) {
        cout << "Error reading cargo roofline" << endl;
        return 1;
      }
      menuChoice = toupper(menuChoice);
    } while (menuChoice != 'L' && menuChoice != 'R' && menuChoice != 'H');

    switch (menuChoice) {
      case 'L':
        cargoRoofline = "Low";
        break;
      case 'R':
        cargoRoofline = "Raised";
        break;
      case 'H':
        cargoRoofline = "High";
        break;
      default:
        cout << "Error reading cargo roofline" << endl;
        return 1;
    }
  }

  // wheelbase
  if (evOrIc == "EV") {
    wheelbase = "Medium";
  } else {
    do {
      cout << "Wheelbase (S)hort, (M)edium, (E)xtended: ";
      if (!(cin >> menuChoice)) {
        cout << "Error reading wheelbase" << endl;
        return 1;
      }
      cin.ignore(numeric_limits<streamsize>::max(), '\n');
      menuChoice = toupper(menuChoice);
    } while (menuChoice != 'S' && menuChoice != 'M' && menuChoice != 'E');

    switch (menuChoice) {
      case 'S':
        wheelbase = "Short";
        break;
      case 'M':
        wheelbase = "Medium";
        break;
      case 'E':
        wheelbase = "Extended";
        break;
      default:
        cout << "Error reading wheelbase" << endl;
        return 1;
    }
  }

  // output
  cout << endl;
  cout << "Dealer Name: " << dealerName << endl;
  cout << "Memo Reference: " << memoReference << endl;
  cout << "Quantity: " << quantity << endl;
  cout << "Color: " << color << endl;
  cout << "EV or IC: " << evOrIc << endl;
  if (evOrIc == "IC") {
    cout << "Cargo or Passenger: " << cargoOrPassenger << endl;
    cout << "Cargo Roofline: " << cargoRoofline << endl;
    cout << "Wheelbase: " << wheelbase << endl;

  } else {
    cout << "Cargo Roofline: Medium" << endl;
    cout << "Wheelbase: Medium" << endl;
  }

  // write to file
  cout << endl;
  cout << "Writing to file..." << endl;
  ofstream outputFile;
  outputFile.open("output.txt");
  outputFile << dealerName << "," << memoReference << "," << quantity << "," << color << "," << evOrIc << "," << cargoOrPassenger << "," << cargoRoofline << "," << wheelbase << endl;
  outputFile.close();
  cout << "Done!" << endl;


  return 0;
}
