#ifndef CUSTOMER_H
#define CUSTOMER_H
#include<string>
using namespace std;

class Customer
{
private:
   int custNumber;
   string name;
public:
   Customer(int cn, string n)
   {  custNumber = cn;
      name = n; }

   void setCustNumber(int cn)
   {  custNumber = cn; }

   void setName(string n)
   {  name = n; }

   int getCustNumber() const
   {  return custNumber; }

   string getName() const
   {  return name; }

   bool operator < (const Customer &right) const
   {  bool status = false;

      if (custNumber < right.custNumber)
         status = true;

      return status; }
};
#endif
