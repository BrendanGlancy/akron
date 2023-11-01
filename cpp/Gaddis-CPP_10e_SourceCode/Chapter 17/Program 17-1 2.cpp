#include <iostream>
#include <string>
#include <array>
using namespace std;

int main()
{
   const int SIZE = 4;
   
   // Store some names in an array object.
   array<string, SIZE> names = { "Jamie", "Ashley", "Doug", "Claire" };

   // Display the names.
   cout << "Here are the names:\n";
   for (int index = 0; index < names.size(); index++)
      cout << names[index] << endl;

   return 0;
}
