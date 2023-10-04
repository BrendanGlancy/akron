#include <iostream>
#include <sstream>
#include <string>
#include <cctype>
#include <limits>
#include <fstream>
using namespace std;

void welcome() {
  cout << "-----------------------------------------------------------------" << endl;
  cout << "  __          __    _                               _ " << endl;
  cout << " \\ \\        / /   | |                             | |" << endl;
  cout << "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___ | |" << endl;
  cout << "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\| |" << endl;
  cout << "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/|_|" << endl;
  cout << "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|(_)" << endl;
  cout << "                                                     " << endl;
  cout << "-----------------------------------------------------------------" << endl;
  cout << ">>>>> Please enter the following information: <<<<<" << endl;
}

string getDealerName() {
  string dealerName;
  cout << "Dealer Name: ";
  if (!getline(cin, dealerName)) {
    cout << "Error reading dealer name" << endl;
    exit(1);
  }
  return dealerName;
}

string getMemoReference() {
  string memoReference;
  cout << "Memo Reference: ";
  if (!getline(cin, memoReference)) {
    cout << "Error reading memo reference" << endl;
    exit(1);
  }
  return memoReference;
}

int getQuantity() {
  int quantity;
  cout << "Quantity: ";
  string quantityStr;
  getline(cin, quantityStr);
  stringstream(quantityStr) >> quantity; // Convert string to int
  if (cin.fail() || quantity < 1 || quantity > 99) {
    cout << "Error reading quantity" << endl;
    exit(1);
  }
  return quantity;
}

char getMenuChoice() {
  char menuChoice;
  cout << "Color (W)hite, (G)ray, (B)lack: ";
  string menuChoiceStr;
  getline(cin, menuChoiceStr);
  if (menuChoiceStr.empty()) {
    cout << "Error reading color" << endl;
    exit(1);
  }
  menuChoice = toupper(menuChoiceStr[0]); // Convert string to char and make it uppercase
  return menuChoice;
} 

string setColor(char menuChoice) {
  string color;
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
      exit(1);
  }
  return color;
}

string setEngineType() {
  string evOrIc;
  do {
    cout << "EV or IC: ";
    getline(cin, evOrIc);
    if (evOrIc.empty()) {
      cout << "Error reading EV or IC" << endl;
      exit(1);
    }
    evOrIc = string(1, toupper(evOrIc[0])); // Convert to uppercase
  } while (evOrIc != "E" && evOrIc != "I");

  if (evOrIc == "E") {
    evOrIc = "EV";
  } else {
    evOrIc = "IC";
  }
  return evOrIc;
}

string setCargoOrPassenger(string cargoOrPassenger, string evOrIc) {
  char menuChoice;
  if (evOrIc != "EV") {
      do {
          cout << "(C)argo or (P)assenger: ";
          getline(cin, cargoOrPassenger);
          if (cargoOrPassenger.empty()) {
              cout << "Error reading C or P" << endl;
              exit(1);
          }
          menuChoice = toupper(cargoOrPassenger[0]);
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
              exit(1);
      }
  }
  return cargoOrPassenger;
}

string setCargoRoofline(string cargoOrPassenger, string evOrIc, string cargoRoofline, string wheelbase) {
  char menuChoice;
  do {
      cout << "Cargo Roofline (L)ow, (R)aised, (H)igh: ";
      getline(cin, cargoRoofline);
      if (cargoRoofline.empty()) {
          cout << "Error reading cargo roofline" << endl;
          exit(1);
      }
      menuChoice = toupper(cargoRoofline[0]);
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
          exit(1);
  }
  return cargoRoofline;
}

string setWheelbased(string wheelbase) {
  char menuChoice;
  do {
      cout << "Wheelbase (S)hort, (M)edium, (E)xtended: ";
      getline(cin, wheelbase);
      if (wheelbase.empty()) {
          cout << "Error reading wheelbase" << endl;
          exit(1);
      }
      menuChoice = toupper(wheelbase[0]);
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
          exit(1);
  }
  return wheelbase;
}

int main() {
  // init
  char menuChoice;
  int quantity = getQuantity();
  string color = setColor(getMenuChoice());
  string evOrIc = setEngineType();
  string dealerName = getDealerName();
  string memoReference = getMemoReference();
  string cargoRoofline;
  string wheelbase;
  string cargoOrPassenger;

  welcome();

  if (evOrIc != "EV") {
    setCargoOrPassenger(cargoOrPassenger, evOrIc);
    setCargoRoofline(cargoOrPassenger, evOrIc, cargoRoofline, wheelbase);
    setWheelbased(wheelbase);
  } else if (evOrIc == "EV") {
    cargoOrPassenger = "Cargo";
    cargoRoofline = "Medium";
    wheelbase = "Medium";
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
  if (!outputFile.is_open()) {
    cerr << "Error opening file" << endl;
    exit(1);
  }
  outputFile << dealerName << "," << memoReference << "," << quantity << "," << color << "," << evOrIc << "," << cargoOrPassenger << "," << cargoRoofline << "," << wheelbase << endl;
  outputFile.close();
  cout << "Done!" << endl;

  return 0;
}
