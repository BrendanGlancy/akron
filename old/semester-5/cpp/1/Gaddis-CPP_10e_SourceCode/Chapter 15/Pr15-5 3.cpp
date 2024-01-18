// This program demonstrates passing arguments to a base
// class constructor.
#include <iostream>
#include "Box.h"
using namespace std;

int main()
{
   double boxWidth;   // To hold the box's width
   double boxLength;  // To hold the box's length
   double boxHeight;  // To hold the box's height

   // Get the width, length, and height from the user.
   cout << "Enter the dimensions of a box:\n";
   cout << "Width: ";
   cin >> boxWidth;
   cout << "Length: ";
   cin >> boxLength;
   cout << "Height: ";
   cin >> boxHeight;

   // Define a Box object.
   Box myBox(boxWidth, boxLength, boxHeight);

   // Display the Box object's properties.
   cout << "Here are the box's properties:\n";
   cout << "Width: " << myBox.getWidth() << endl;
   cout << "Length: " << myBox.getLength() << endl;
   cout << "Height: " << myBox.getHeight() << endl;
   cout << "Base area: " << myBox.getArea() << endl;
   cout << "Volume: " << myBox.getVolume() << endl;
   return 0;
}