// This program demonstrates a raw string.
#include <iostream>
using namespace std;

int main()
{
   cout << "Here is the raw string:" << endl;
   cout << R"(One\nTwo\nThree)" << endl << endl;
   cout << "Here is the regular string:" << endl;
   cout << "One\nTwo\nThree" << endl;
   return 0;
}