// This program demonstrates the Bubble Sort algorithm.
#include <iostream>
using namespace std;

// Function prototypes
void bubbleSort(int[], int);
void swap(int &, int &);

int main()
{
   const int SIZE = 6;

   // Array of unsorted values
   int values[SIZE] = { 6, 1, 5, 2, 4, 3 };

   // Display the unsorted array.
   cout << "The unsorted values:\n";
   for (auto element : values)
      cout << element << " ";
   cout << endl;

   // Sort the array.
   bubbleSort(values, SIZE);

   // Display the sorted array.
   cout << "The sorted values:\n";
   for (auto element : values)
      cout << element << " ";
   cout << endl;

   return 0;
}

//*****************************************************************
// The bubbleSort function sorts an int array in ascending order. *
//*****************************************************************
void bubbleSort(int array[], int size)
{
   int maxElement;
   int index;

   for (maxElement = size - 1; maxElement > 0; maxElement--)
   {
      for (index = 0; index < maxElement; index++)
      {
         if (array[index] > array[index + 1])
         {
            swap(array[index], array[index + 1]);
         }
      }
   }
}

//***************************************************
// The swap function swaps a and b in memory.       *
//***************************************************
void swap(int &a, int &b)
{
   int temp = a;
   a = b;
   b = temp;
}
