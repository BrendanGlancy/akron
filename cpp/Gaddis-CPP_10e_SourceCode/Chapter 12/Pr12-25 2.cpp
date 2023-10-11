#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string target;

   // Get path of the file to delete.
   cout << "File to delete: ";
   getline(cin, target);

   // Create a path object.
   filesystem::path targetPath{ target };

   // Delete the file.
   if (filesystem::remove(targetPath))
   {
      cout << targetPath.string()
           << " deleted." << endl;
   }
   else
   {
      cout << "Error deleting " 
           << targetPath.string() << endl;
   }
   return 0;
}