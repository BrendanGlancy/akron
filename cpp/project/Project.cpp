#include <iostream>
#include <sstream>
#include <string>
#include <cctype>
#include <limits>
#include <fstream>
using namespace std;

class VechicleConfiguration {
public:
  void start() {
    welcomeMessage();
    collectData();
    displayData();
    saveToFile();
  }

private:
  string dealerName, memoReference, color, evOrIc, cargoOrPassenger, cargoRoofline, wheelbase;
  int quantity;

  void welcomeMessage() {
    cout << "-----------------------------------------------------------------" << endl;
    cout << " __          __    _                               _ " << endl;
    cout << " \\ \\        / /   | |                             | |" << endl;
    cout << "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___ | |" << endl;
    cout << "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\| |" << endl;
    cout << "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/|_|" << endl;
    cout << "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|(_)" << endl;
    cout << "                                                     " << endl;
    cout << "-----------------------------------------------------------------" << endl;
    cout << ">>>>> Please enter the following information: <<<<<" << endl;
  }

  string inputWithPrompt(const string& prompt) {
    cout << prompt;
    string input;
    getline(cin, input);
    return input;
  }

  int inputQuantity() {
    string quantityStr = inputWithPrompt("Quantity (1-99): ");
    int quantity;
    stringstream(quantityStr) >> quantity;
    if (quantity < 1 || quantity > 99) {
      throw runtime_error("Error reading quantity");
    }
    return quantity;
  }

  string setColor(string prompt) {
    char menuChoice;
    string color;
    menuChoice = toupper(prompt[0]);
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

  void collectData() {
    dealerName = inputWithPrompt("Dealer Name: ");
    memoReference = inputWithPrompt("Memo Reference: ");
    quantity = inputQuantity();
    color = setColor(inputWithPrompt("Color (W)hite, (G)ray, (B)lack: "));
    evOrIc = setEngineType();
    if (evOrIc != "EV") {
      cargoOrPassenger = setCargoOrPassenger(cargoOrPassenger, evOrIc);
      cargoRoofline = setCargoRoofline(cargoOrPassenger, evOrIc, cargoRoofline, wheelbase);
      wheelbase = setWheelbased(wheelbase);
    } else if (evOrIc == "EV") {
      cargoOrPassenger = "Cargo";
      cargoRoofline = "Medium";
      wheelbase = "Medium";
    }
  }

  void displayData() {
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
      cout << "Cargo or Passenger: Cargo" << endl;
      cout << "Cargo Roofline: Medium" << endl;
      cout << "Wheelbase: Medium" << endl;
    }
  }

  void saveToFile() {
    ofstream outputFile("output.txt");
    if (!outputFile.is_open()) {
      throw runtime_error("Error opening file");
    }
  outputFile << dealerName << "," << memoReference << "," << quantity << "," << color << "," << evOrIc << "," << cargoOrPassenger << "," << cargoRoofline << "," << wheelbase << endl;
  outputFile.close();
  }
};

int main() {
  try {
    VechicleConfiguration app;
    app.start();
  } catch (const exception& e) {
    cerr << e.what() << endl;
    exit(1);
  }

  return 0;
}
