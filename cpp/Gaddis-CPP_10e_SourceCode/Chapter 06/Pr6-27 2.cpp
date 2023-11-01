// This program uses reference variables as function parameters.
#include <iostream>
using namespace std;

// Function prototypes
void getThreeValues(int &, int &, int &);
int addThreeValues(int, int, int);

int main()
{
	int value1, value2, value3;

	// Get three values from the user.
	getThreeValues(value1, value2, value3);

	// Display the sum of those three values.
	cout << "The sum of those numbers is "
		 << addThreeValues(value1, value2, value3)
		 << endl;

	return 0;
}

//***************************************************************
// Definition of getThreeValues                                 *
// The parameters num1, num2, and num3 are reference variables. * 
// The user is prompted to enter three numbers that are stored  *
// in the reference parameters.                                 *
//***************************************************************

void getThreeValues(int &num1, int &num2, int &num3)
{
	cout << "Enter three integer values: ";
	cin >> num1 >> num2 >> num3;
}

//**************************************************************
// Definition of addThreeValues                                *
// This function returns the sum of its three parameters.      *
//**************************************************************

int addThreeValues(int num1, int num2, int num3)
{
	return num1 + num2 + num3;
}