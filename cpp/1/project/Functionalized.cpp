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

int getDealerName(string &dealerName) {
    cout << "Dealer Name: ";
    if (!getline(cin, dealerName)) {
        cout << "Error reading dealer name" << endl;
        return -1;
    }
    return 0;
}

int getMemoReference(string &memoReference) {
    cout << "Memo Reference: ";
    if (!getline(cin, memoReference)) {
        cout << "Error reading memo reference" << endl;
        return -1;
    }
    return 0;
}

int getQuantity(int &quantity) {
    cout << "Quantity: ";
    string quantityStr;
    getline(cin, quantityStr);
    stringstream(quantityStr) >> quantity; 
    if (cin.fail() || quantity < 1 || quantity > 99) {
        cout << "Error reading quantity" << endl;
        return -1;
    }
    return 0;
}

int getMenuChoice(char &menuChoice) {
    cout << "Color (W)hite, (G)ray, (B)lack: ";
    string menuChoiceStr;
    getline(cin, menuChoiceStr);
    if (menuChoiceStr.empty()) {
        cout << "Error reading color" << endl;
        return -1;
    }
    menuChoice = toupper(menuChoiceStr[0]);
    return 0;
}

int setColor(char menuChoice, string &color) {
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
            return -1;
    }
    return 0;
}

int setEngineType(string &evOrIc) {
    do {
        cout << "EV or IC: ";
        getline(cin, evOrIc);
        if (evOrIc.empty()) {
            cout << "Error reading EV or IC" << endl;
            return -1;
        }
        evOrIc = string(1, toupper(evOrIc[0])); 
    } while (evOrIc != "E" && evOrIc != "I");

    evOrIc = (evOrIc == "E") ? "EV" : "IC";
    return 0;
}

int setCargoOrPassenger(string evOrIc, string &cargoOrPassenger) {
    if (evOrIc != "EV") {
        char menuChoice;
        do {
            cout << "(C)argo or (P)assenger: ";
            getline(cin, cargoOrPassenger);
            if (cargoOrPassenger.empty()) {
                cout << "Error reading C or P" << endl;
                return -1;
            }
            menuChoice = toupper(cargoOrPassenger[0]);
        } while (menuChoice != 'C' && menuChoice != 'P');

        cargoOrPassenger = (menuChoice == 'C') ? "Cargo" : "Passenger";
    } else {
        cargoOrPassenger = "Cargo";
    }
    return 0;
}

int setCargoRoofline(string &cargoRoofline) {
    char menuChoice;
    do {
        cout << "Cargo Roofline (L)ow, (R)aised, (H)igh: ";
        getline(cin, cargoRoofline);
        if (cargoRoofline.empty()) {
            cout << "Error reading cargo roofline" << endl;
            return -1;
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
            return -1;
    }
    return 0;
}

int setWheelbased(string &wheelbase) {
    char menuChoice;
    do {
        cout << "Wheelbase (S)hort, (M)edium, (E)xtended: ";
        getline(cin, wheelbase);
        if (wheelbase.empty()) {
            cout << "Error reading wheelbase" << endl;
            return -1;
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
            return -1;
    }
    return 0;
}

int main() {
  char menuChoice;
  int quantity;
  string color, evOrIc, dealerName, memoReference, cargoRoofline, wheelbase, cargoOrPassenger;

  // Get values
  welcome();
  if (getQuantity(quantity) == -1) return 1;
  if (getMenuChoice(menuChoice) == -1) return 1;
  if (setColor(menuChoice, color) == -1) return 1;
  if (setEngineType(evOrIc) == -1) return 1;
  if (getDealerName(dealerName) == -1) return 1;
  if (getMemoReference(memoReference) == -1) return 1;
  if (evOrIc != "EV") {
      if (setCargoOrPassenger(evOrIc, cargoOrPassenger) == -1) return 1;
      if (setCargoRoofline(cargoRoofline) == -1) return 1;
      if (setWheelbased(wheelbase) == -1) return 1;
  } else {
      cargoRoofline = "Medium";
      wheelbase = "Medium";
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
