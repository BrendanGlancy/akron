#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string target;

   // Get the path of a file or directory.
   cout << "Enter the path of a file or directory: ";
   getline(cin, target);

   // Create a path object.
   filesystem::path targetPath { target };

   // Determine if the target exists.
   if (filesystem::exists(targetPath))
      cout << "That item exists." << endl;
   else
      cout << "That item does not exist." << endl;
   
   return 0;
}