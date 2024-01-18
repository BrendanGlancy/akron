#ifndef COURSE
#define COURSE
#include <iostream>
#include <string>
#include "Instructor.h"
#include "TextBook.h"
using namespace std;

class Course
{
private:
   string courseName;		// Course name
   Instructor instructor;   // Instructor
   TextBook textbook;       // Textbook
public:
   // Constructor
   Course(string course, string instrLastName, string instrFirstName, 
	      string instrOffice, string textTitle, string author,
          string publisher) :
   instructor(instrLastName, instrFirstName, instrOffice),
   textbook(textTitle, author, publisher)
   { // Assign the course name.
     courseName = course;
   }
        
   // print function
   void print() const
   {  cout << "Course name: " << courseName << endl << endl;
      cout << "Instructor Information:\n";
      instructor.print();
      cout << "\nTextbook Information:\n";
      textbook.print();
      cout << endl; }
};
#endif 