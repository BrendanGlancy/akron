// JCH 10/09/23 - revised

// introduce struct, specifically array of struct

// introduce int function and invocation 

#include <iostream>
#include <string>
using namespace std;

// Declare a structure named "car"
struct car {
  string brand;
  string model;
  int    year;
};

int getColor ()
{ 
  bool done = false;
  char ch; 
  cout << endl << "Enter color: W, B, G -- X to bail: ";
  do {
  	cin.get(ch);
    // cin.get (); // gets the enter key
      if (ch == 'x' || ch == 'X') return -1; // fail
    // really should switch/case on correct values but did not
    done = true; 
  }
 while (!done);
 cout << "GetColor Entry: " << ch << endl; 
 return 0;
}

int main() {

  car myCar[2];
  myCar[0].brand = "TOY";
  myCar[0].model = "Prius PHEV";
  myCar[0].year  = 2012;
  myCar[1].brand = "Hyundai";
  myCar[1].model = "Palisade";
  myCar[1].year  = 2020;

//  j = getColor();
//  cout << endl << "Retcode: " << j << endl; 
 
  if (getColor() == -1) {
    cout << endl << "Bail Fail" << endl; 
    exit(-1); //  nonzero means fail 
  }
  // Print the structure members
  cout << endl << "Success" << endl; 
  cout << myCar[0].brand << " " << myCar[0].model << " " << myCar[0].year << "\n";
  cout << myCar[1].brand << " " << myCar[1].model << " " << myCar[1].year << "\n";

  return 0;
}
