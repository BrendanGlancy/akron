# Algorithm Workbenchs
#1
height = str(input('Enter your height: '))

#2
color = str(input('Enter your favorite color: '))

#3
a = 0
b = 0

b = a + 2
a = b * 4
b = a / 3.14
a = b - 8

# Debug Ex 1
"""
Declare String favoriteFood

Display "What is the name of your favorite food?"
Input favoriteFood

Display "Your favorite food is "
Below will display favoriteFood, literaly, not the variable
Display "favoriteFood"
Needs to be changed to:
Display favoriteFood
"""

"""
pseudocode
Display "Enter a number"
Input num
Output num * 10
"""
# Num * 10
num = int(input('Enter a number: '))
print(num * 10)

"""
pseudocode
Display "Enter the side length of a cube: "
Input sideLen
Set saSide = sideLen * sideLen
Set saWhole 6 * saSide
Set Volume = sideLen^3
Display 'Surface area of one side of the cube: ', saSide
Display 'Surface area of whole cube: ', saWhole
Display 'Volume of cube: ', volume'
"""

# Cube calculations
sideLen = float(input('Enter the side length of the cube: '))
saSide = (sideLen * sideLen)
saWhole = 6 * saSide
volume = sideLen**3

print('Surface area of one side of the cube: ', saSide)
print('Surface area of whole cube: ', saWhole)
print('Volume of cube: ', volume)
