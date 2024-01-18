// This program uses a function to return a structure. This
// is a modification of Program 11-2.
#include <iostream>
#include <iomanip>
#include <cmath>  // For the pow function
using namespace std;

// Constant for Pi.
const double PI = 3.14159;

// Structure declaration
struct Circle
{
   double radius;      // A circle's radius
   double diameter;    // A circle's diameter
   double area;        // A circle's area
};

// Function prototype
Circle getCircle();

int main()
{
   Circle c;      // Define a structure variable

   // Get data about the circle.
   c = getCircle();

   // Display the circle data.
   cout << "The radius and area of the circle are:\n";
   cout << fixed << setprecision(2);
   cout << "Radius: " << c.radius << endl;
   cout << "Area: " << c.area << endl;
   return 0;
}

//***************************************************************
// The getCircle function uses a local variable, tempCircle,    *
// which is a circle structure. The user enters the diameter of *
// the circle, which is stored in the tempCircle structure. The *
// function then calculates the circle's radius and area, and   *
// stores those values in tempCircle. The tempCircle strucutere *
// is then returned from the function.                          *
//***************************************************************

Circle getCircle()
{
   Circle tempCircle;  // Temporary structure variable

   // Store circle data in the temporary variable.
   cout << "Enter the diameter of a circle: ";
   cin >> tempCircle.diameter;

   // Calculate the circle's radius and area.
   tempCircle.radius = tempCircle.diameter / 2.0;
   tempCircle.area = PI * pow(tempCircle.radius, 2.0);

   // Return the temporary variable.
   return tempCircle;
}