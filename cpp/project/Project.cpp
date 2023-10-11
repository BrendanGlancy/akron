#include <iostream>
#include <sstream>
#include <stdexcept>
#include <string>
#include <cctype>
#include <limits>
#include <fstream>
using namespace std;

struct car {
  string brand;
  string model;
  int year;
};

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
    cout << "  __          __    _                               _ " << endl;
    cout << " \\ \\        / /   | |                             | |" << endl;
    cout << "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___ | |" << endl;
    cout << "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\| |" << endl;
    cout << "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/|_|" << endl;
    cout << "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|(_)" << endl;
    cout << "                                                     " << endl;
    cout << "-----------------------------------------------------------------" << endl;
    cout << endl;
    cout << "IMPORTANT: If you want to exit this program enter [Q/q]" << endl;
    cout << endl;
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
    char choice = toupper(prompt[0]);
    switch (choice) {
      case 'W': return "White";
      case 'G': return "Grey";
      case 'B': return "Black";
      case 'Q': runtime_error("User quit");
      default: throw runtime_error("Error reading color");
    }
    return color;
  }

  string setEngineType() {
    do {
      auto type = inputWithPrompt("EV or IC: ");
      if (type == "E" || type == "EV") return "EV";
      if (type == "I" || type == "IC") return "IC";
      throw runtime_error("Error reading engine type");
    } while (true);
  }

  string setCargoOrPassenger(string cargoOrPassenger) {
    while (true) {
      char choice = toupper(inputWithPrompt("(C)argo or (P)assenger: ")[0]);
      switch (choice) {
          case 'C': return "Cargo";
          case 'P': return "Passenger";
          case 'Q': runtime_error("User quit");
          default: throw runtime_error("Error reading cargo or passenger type");
      }
    }
  }

  string setCargoRoofline(string cargoRoofline) {
    while (true) {
      char choice = toupper(inputWithPrompt("Cargo Roofline (L)ow, (R)aised, (H)igh: ")[0]);
      switch (choice) {
          case 'L': return "Low";
          case 'R': return "Raised";
          case 'H': return "High";
          case 'Q': runtime_error("User quit");
          default: throw runtime_error("Error reading cargo roofline");
      }
    }
  }

  string setWheelbased(string wheelbase) {
    while (true) {
      char choice = toupper(inputWithPrompt("Wheelbase (S)hort, (M)edium, (E)xtended: ")[0]);
      switch (choice) {
          case 'S': return "Short";
          case 'M': return "Medium";
          case 'E': return "Extended";
          case 'Q': runtime_error("User quit");
          default: throw runtime_error("Error reading wheelbase");
      }
    }
  }

  void setCarData(int quantity) {
    car myCar[quantity];
    for (int i = 0; i < quantity; i++) {
      cout << endl;
      cout << ">>>>> Please enter the following information for car #" << i + 1 << ": <<<<<" << endl;
      myCar[i].brand = inputWithPrompt("Brand: ");
      myCar[i].model = inputWithPrompt("Model: ");
      string yearStr = inputWithPrompt("Year: ");
      stringstream(yearStr) >> myCar[i].year;
      if (myCar[i].year < 2000 || myCar[i].year >= 2024) {
        throw runtime_error("Error reading year");
      }
    }
  }

  void collectData() {
    dealerName = inputWithPrompt("Dealer Name: ");
    memoReference = inputWithPrompt("Memo Reference: ");
    quantity = inputQuantity();
    color = setColor(inputWithPrompt("Color (W)hite, (G)ray, (B)lack: "));
    evOrIc = setEngineType();
    setCarData(quantity);
    if (evOrIc != "EV") {
      cargoOrPassenger = setCargoOrPassenger(cargoOrPassenger);
      cargoRoofline = setCargoRoofline(cargoRoofline);
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
