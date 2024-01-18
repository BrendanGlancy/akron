#include <iostream>
#include <filesystem>
using namespace std;

int main()
{
   int regularFiles = 0, directories = 0;

   // Get the path of the current working directory.
   filesystem::path cwd = filesystem::current_path();

   // Count the number of regular files and directories.
   for (const auto &entry : filesystem::directory_iterator(cwd))
   {
      if (entry.is_regular_file())
         regularFiles++;

      if (entry.is_directory())
         directories++;
   }

   // Display the results.
   cout << "This directory contains " << regularFiles
         << " regular files and " << directories
       << " directories." << endl;

   return 0;
}