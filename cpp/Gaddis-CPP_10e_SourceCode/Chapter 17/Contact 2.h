#ifndef CONTACT_H
#define CONTACT_H
#include <string>
using namespace std;

class Contact
{
private:
   string name;
   string email;
public:
   Contact()
   {  name = "";
      email = ""; }

   Contact(string n, string em)
   {  name = n;
      email = em; }

   void setName(string n)
   {  name = n; }

   void setEmail(string em)
   {  email = em; }

   string getName() const
   {  return name; }

   string getEmail() const
   {  return email; }
};
#endif