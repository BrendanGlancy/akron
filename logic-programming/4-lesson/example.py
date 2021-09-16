def degToRad():
    deg = float(input('Enter a degree: '))
    rad = deg / 57.3
    print(rad)

def main():
    # trapezoid()
    # degToRad()
    sum()

def trapezoid():
    q = float(input('Enter one of the bases: '))
    p = float(input('Enter another base: '))
    h = float(input('Enter the height: '))
    area = (0.5) * (p + q) * h
    print("the area is:", area)

def sum():
    first = float(input('Enter a number: '))
    second = float(input('Enter another number: '))
    add(first, second)

def add(a, b):
    print("Sum:", a + b)

main()

