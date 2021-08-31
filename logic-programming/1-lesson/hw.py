# lesson 1 homework Brendan Glancy
# Decimal to Binary

def decimalToBinary(n):
    # init an array for our bin #
    s = []
    if (n==0):
        # if our number is 0 in dec then it is in bin
        k=[0]
        return k
    else:
        while(n):
        # put the remainder in an array
            s.append(n%2)
        # floor divison, rounding down, and then getting another remainder 
        # which creates a binary number from a decimal
            n=n//2
        return s


# Function to convert Binary number 
# to Decimal number 
  
def binaryToDecimal(n): 
    # int in python converts a number of a given base to a decimal
    # int(string, base)
    """
    To do this conversion, multiply each digit by base(2) raised to the respective
    power depending on the position of that digit in the number
    1   0   1   1   0   1
    2^5 2^4 2^3 2^2 2^1 2^0
    32  0   8   4   0   1
    sum the above numbers = 45
    """
    return int(n,2) 
  
  
# Driver code 
if __name__ == '__main__':
    print(binaryToDecimal('100'))
    print(binaryToDecimal('101'))
    print(binaryToDecimal('1001'))
    print(decimalToBinary(11))
    print(decimalToBinary(65))
    print(decimalToBinary(100))
    print(decimalToBinary(255))

# name in ascii
# 098 114 101 110 100 097 110

# Use the Web to research the history of BASIC, C++, Java, and Python
# Who was the creator of these languages
"""
Guido van Rossum, Python | John Kemeny and Thomas Kurtz, BASIC |
James Gosling, Java he liked the number 42 | Bjarne Stroustrup, C++
"""

# When was each of these languages created
""" 
BASIC: 1964, C++: 1985, Python: 1991, Java: work began in 1991 but wasn't 
Relased until 1996
"""


# Was there a specific motivation behind the creation of these languages?
# If so, what was it?
"""
Java was relased to provide an alternative to c/c++, an engineer was frustrated
with the state of C++ API tools.

BASIC was designed to be an easier alternative to Fortran, with similar syntax
they improved it where they felt nessesary, DO loop became a for loop

Python was designed with code readability in mind. Successor to the ABC 
programming language. Design philosophy:
- Beautiful is better than ugly.
- Explicit is better than implicit.
- Simple is better than complex.
- Complex is better than complicated.
- Readability counts.

C++ was the successor to C which is a pretty low level language that I think
is kind a pain to write in. Designed to be C with classes, with the goal of
being efficent and flexible providing high level features for program 
organization

"""
