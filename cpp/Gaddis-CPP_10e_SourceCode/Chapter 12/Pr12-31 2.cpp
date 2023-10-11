#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string target;

   // Get path of the directory to delete.
   cout << "Directory to delete: ";
   getline(cin, target);

   // Create a path object.
   filesystem::path targetPath{ target };

   // Delete the directory and its contents.
   int numDeleted = filesystem::remove_all(targetPath);
   cout << numDeleted << " items were deleted." << endl;

   return 0;
}