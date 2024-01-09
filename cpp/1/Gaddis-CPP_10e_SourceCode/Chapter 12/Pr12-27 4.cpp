#include <iostream>
#include <filesystem>
using namespace std;

int main()
{
   // Get the path of the current working directory.
   filesystem::path cwd = filesystem::current_path();

   // Display the current working directory.
   cout << "The current working directory is:\n"
        << cwd.string() << endl;
   return 0;
}