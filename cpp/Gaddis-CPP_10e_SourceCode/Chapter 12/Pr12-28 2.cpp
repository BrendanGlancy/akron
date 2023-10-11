#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string directory;

   // Get the path of the current working directory.
   filesystem::path cwd = filesystem::current_path();

   // Display the current working directory.
   cout << "The current working directory is:\n"
        << cwd.string() << endl;

   // Get the path of a different directory.
   cout << "Enter the path of a different directory: ";
   getline(cin, directory);

   // Create a new path object.
   filesystem::path userPath{ directory };

   // Change the current working directory.
   filesystem::current_path(userPath);

   // Get the path of the current working directory.
   cwd = filesystem::current_path();

   // Display the current working directory.
   cout << "Now the current working directory is:\n"
        << cwd.string() << endl;
   return 0;
}