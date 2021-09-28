import math

def one():
    count = 0
    while count < 5:
        print('Hello')
        count += 1

def two():
    x = 1
    while x < 11:
        print('sqaure root:', math.sqrt(x), '\n', 'Squared', x**2, '\n', 'Cubed',x**3)
        x += 1

def main():
    two()

if __name__ == "__main__":
    main()
