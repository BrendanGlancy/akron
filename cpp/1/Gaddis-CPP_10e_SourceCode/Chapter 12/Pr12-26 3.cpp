#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string source, destination;

   // Get path of the existing file.
   cout << "Existing filename: ";
   getline(cin, source);

   // Get the path of the destination.
   cout << "Destination filename: ";
   getline(cin, destination);

   // Create path objects.
   filesystem::path sourcePath{ source };
   filesystem::path destinationPath{ destination };

   // Make sure the file exists.
   if (filesystem::exists(sourcePath))
   {
      // Make sure the destination file does NOT exist.
      if (!filesystem::exists(destinationPath))
      {
         // Rename the file.
         filesystem::rename(sourcePath, destinationPath);
         cout << sourcePath.string() << " renamed to "
              << destinationPath.string() << endl;

      }
      else
      {
         cout << "The destination file " 
              << destinationPath.string()
              << " already exists." << endl;
      }
   }
   else
   {
      cout << "The file " << sourcePath.string()
           << " does not exist." << endl;
   }

   return 0;
}