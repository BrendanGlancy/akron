/**
 * @file general.cpp
 * @purpose General purpose brute force ctf tools
 */

#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class General {

  int main() {
    welcome();
    menu();
    return 0;
  }

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
    cout << "" << endl;
  }

  /**
   * @brief Menu
   */
  void menu() {
    cout << "1. Brute force a string" << endl;
    cout << "2. Brute force a file" << endl;
    cout << "3. Exit" << endl;
    cout << "" << endl;
    cout << "Enter your choice: ";
    int choice;
    cin >> choice;
    switch (choice) {
      case 1:
        bruteForceString();
        break;
      case 2:
        bruteForceFile();
        break;
      case 3:
        exit(0);
        break;
      default:
        cout << "Invalid choice" << endl;
        break;
    }
  }

  /**
   * @brief Brute force a string
   */
  void bruteForceString() {
  }

  void bruteForceFile() {
    cout << "Enter the file path: ";
    string filePath;
    cin >> filePath;


  }
};
