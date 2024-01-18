#include <iostream>
#include <string>
#include <filesystem>
using namespace std;

int main()
{
   string source, destination;

   // Get path of the file to copy.
   cout << "File to copy: ";
   getline(cin, source);

   // Get the path of the destination.
   cout << "Destination: ";
   getline(cin, destination);

   // Create path objects.
   filesystem::path from{ source };
   filesystem::path to{ destination };

   // Make sure the file to copy exists.
   if (filesystem::exists(from))
   {
      // Make sure the destination file does NOT exist.
      if (!filesystem::exists(to))
      {
         // Copy the file.
         filesystem::copy_file(from, to);
         cout << from.string() << " copied to "
              << to.string()   << endl;
      }
      else
      {
         cout << "The destination file " << to.string()
              << " already exists." << endl;
      }
   }
   else
   {
      cout << "The file " << from.string()
           << " does not exist." << endl;
   }

   return 0;
}