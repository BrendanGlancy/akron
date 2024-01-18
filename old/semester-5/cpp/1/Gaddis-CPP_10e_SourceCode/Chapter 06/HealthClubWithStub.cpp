// This is a menu-driven program that makes a function call
// for each selection the user makes.
#include <iostream>
#include <iomanip>
using namespace std;

// Function prototypes
void showMenu();
void showFees(double, int);

int main()
{
   int choice;       // To hold a menu choice
   int months;       // To hold a number of months

   // Constants for membership rates
   const double ADULT = 40.0;
   const double SENIOR = 30.0;
   const double CHILD = 20.0;

   // Set up numeric output formatting.
   cout << fixed << showpoint << setprecision(2);
   
   do
   {
      // Display the menu and get the user's choice.
      showMenu();
      cin >> choice;
      
      // Validate the menu selection.
      while (choice < 1 || choice > 4)
      {
         cout << "Please enter 1, 2, 3, or 4: ";
         cin >> choice;
      }
      
      if (choice != 4)
      {
         // Get the number of months.
         cout << "For how many months? ";
         cin >> months;
         
         // Display the membership fees.
         switch (choice)
         {
            case 1:  showFees(ADULT, months);
                     break;
            case 2:  showFees(CHILD, months);
                     break;
            case 3:  showFees(SENIOR, months);
         }
      }
   } while (choice != 4);
   return 0;
}

//*****************************************************************
// Definition of function showMenu which displays the menu.       *
//*****************************************************************

void showMenu()
{
   cout << "\n\t\tHealth Club Membership Menu\n\n";
   cout << "1. Standard Adult Membership\n";
   cout << "2. Child Membership\n";
   cout << "3. Senior Citizen Membership\n";
   cout << "4. Quit the Program\n\n";
   cout << "Enter your choice: ";
}

//*****************************************************************
// showFee stub                                                   *
//*****************************************************************

void showFees(double memberRate, int months)
{
    cout << "The showFees function was called with "
         << "the following arguments:\n"
         << "memberRate: " << memberRate << endl
         << "months: " << months << endl;
}

