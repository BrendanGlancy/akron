#include <iostream>
using namespace std;

// Base case template
template <typename T>
T add(T n)
{
	return n;
}

// Recursive case template
template<typename T, typename... TypeArgs>
T add(T firstArg, TypeArgs... remainingArgs)
{
	return firstArg + add(remainingArgs...);
}

int main() 
{
	cout << add(1, 2, 3) << endl;
	cout << add(1, 2, 3, 4) << endl;
	cout << add(1, 2, 3, 4, 5) << endl;
	return 0;
}