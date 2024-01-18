#include <iostream>
#include <iomanip>
#include <filesystem>
using namespace std;

int main()
{
   // Get the path of the current working directory.
   filesystem::path cwd = filesystem::current_path();

   cout << setiosflags(ios::left) << setw(30) 
       << "Name" << "Size: " << endl;

   // Iterate over the items in the current working directory.
   for (const auto& entry : filesystem::directory_iterator(cwd))
   {
      // Get a path object for the current item.
      filesystem::path entryPath = entry.path();

      // Get a path object for the current item's filename.
      filesystem::path filename = entryPath.filename();

      // Get the current item's size.
      int size = entry.file_size();

      // Display the current item's filename and size.
      cout << setiosflags(ios::left) << setw(30) 
           << filename.string() << size << " bytes" << endl;
   }

   return 0;
}
