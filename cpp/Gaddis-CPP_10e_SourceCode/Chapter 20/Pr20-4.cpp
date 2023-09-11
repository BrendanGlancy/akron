// This program demonstrates a recursive function for counting
// the number of times a character appears in a string.
#include <iostream>
#include <vector>
using namespace std;

int countDigits(int, vector<int>, int );

int main()
{
	vecotr<int> numList = { 1, 2, 2, 3, 4, 4, 4, 5 };
   
   cout << countDigits(4, numList, 0) << endl;

   return 0;
}
   
int countDigits(int digit, vector<int> v, int index) 
{ 
   if (index >= v.size())
   {
      return 0;
   }
   else if (v[index] == digit)
   {
      return 1 + countDigits(digit, v, index + 1);
   }
   else 
   {
      return countDigits(digit, v, index + 1);
   }
} 