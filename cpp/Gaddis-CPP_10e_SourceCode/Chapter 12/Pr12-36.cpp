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
      // Display the current item's filename and size.
      cout << setiosflags(ios::left) << setw(30)
           << entry.path().filename().string() 
           << entry.file_size() << " bytes" << endl;
   }

   return 0;
}
