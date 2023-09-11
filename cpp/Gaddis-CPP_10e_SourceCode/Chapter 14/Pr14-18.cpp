#include <iostream>
#include <string>
#include "Person.h"
using namespace std;

// Function prototype
Person makePerson();
void displayPerson(Person);

int main()
{
   Person person;
   person = makePerson();
   displayPerson(person);
   return 0;
}

Person makePerson()
{
   Person p("Will MacKenzie");
   return p;
}

void displayPerson(Person p2)
{
   cout << p2.getName() << endl;
}