#include <iostream>
#include <filesystem>
using namespace std;

int main()
{
   // Get the path of the current working directory.
   filesystem::path cwd = filesystem::current_path();

   // Iterate over the items in the current working directory.
   for (const auto &entry : filesystem::directory_iterator(cwd))
   {
      // Get a path object for the current item.
      filesystem::path entryPath = entry.path();

      // Display the path for the current item.
      cout << entryPath.string() << endl;
   }

   return 0;
}