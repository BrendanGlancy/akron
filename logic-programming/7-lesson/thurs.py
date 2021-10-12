import random


def main():
    number = 0
    i = 0
    while number < 88:
        number = random.randint(1,100)

    return i

def sec():
    num = main()
    while num < 5:
        main()
        print(num)

if __name__ == "__main__":
    sec()
