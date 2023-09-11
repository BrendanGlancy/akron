#ifndef IS_EVEN_H
#define IS_EVEN_H

class IsEven
{
public:
   bool operator()(int x)
   {
      return x % 2 == 0;
   }
};
#endif
