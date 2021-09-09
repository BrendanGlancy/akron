#include<iostream>
using namespace std;
  
// Global x 
int x = 0; 
   
int main()
{
  // Local x   
  int x = 10;
  cout << "Value of global x is " << ::x;
  cout<< "\nValue of local x is " << x; 
  return 0;
}
