#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string directory;

   // Get the path of a different directory.
   cout << "Enter the path of a directory to create: ";
   getline(cin, directory);

   // Create a new path object.
   filesystem::path userPath{ directory };

   // Create the new directory.
   if (filesystem::create_directory(userPath))
      cout << "Directory created." << endl;
   else
      cout << "Directory not created." << endl;

   return 0;
}