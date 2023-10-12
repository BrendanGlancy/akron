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
   {  name = nullptr; }

   // Constructor with a parameter
   Person(char *n)
   {  name = new char[strlen(n) + 1];
      strcpy(name, n); }

   // Copy constructor
   Person(const Person &obj)
   {  name = new char[strlen(obj.name) + 1];
      strcpy(name, obj.name); }
   
   // Move constructor
   Person(Person&& temp)
   {  // Steal the name pointer from temp.
      name = temp.name;

      // Nullify the temp object's name pointer.
      temp.name = nullptr; }

   // Destructor
   ~Person()
   {  delete name; }

   // Copy assignment operator
   Person & operator=(const Person &right)
   {  if (this != &right)
      {
         if (name != nullptr)
            delete[] name;
         name = new char[strlen(right.name) + 1];
         strcpy(name, right.name);
      }
      return *this; }

   // Move assignment operator
   Person& operator=(Person&& right)
   {  if (this != &right)
      {
         swap(name, right.name);
      }
      return *this; }
      
   // getName member fucntion
   char *getName() const
   {  return name; }
};
#endif