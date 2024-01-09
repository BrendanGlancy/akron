#ifndef PERSON_H
#define PERSON_H
#include <iostream>
#include <cstring>
using namespace std;

class Person
{
private:
   char *name;
public:
   // Default constructor
   Person()
   {  cout << "*** default constructor ***\n";
      name = nullptr; }

   // Constructor with a parameter
   Person(char *n)
   {  cout << "*** parameterized constructor ***\n";
      name = new char[strlen(n) + 1];
      strcpy(name, n); }

   // Copy constructor
   Person(const Person &obj)
   {  cout << "*** copy constructor ***\n";
      name = new char[strlen(obj.name) + 1];
      strcpy(name, obj.name); }

   // Destructor
   ~Person()
   {  cout << "*** destructor ***\n";
      delete name; }

   // Overloaded = operator
   Person & operator=(const Person &right)
   {  cout << "*** assignment operator ***\n";
      if (this != &right)
      {
         if (name != nullptr)
            delete[] name;
         name = new char[strlen(right.name) + 1];
         strcpy(name, right.name);
      }
      return *this; }

   // getName member function
   char *getName() const
   {  return name; }
};
#endif