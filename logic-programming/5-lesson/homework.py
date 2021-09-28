"""
Roman Numerals

Design a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should display an error message.
Areas of Rectangles

The area of a rectangle is the rectangle’s length times its width. Design a program that asks for the length and width of two rectangles. The program should tell the user which rectangle has the greater area, or whether the areas are the same.
Mass and Weight

Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the amount of mass of an object, you can calculate its weight, in Newtons, with the following formula:


Design a program that asks the user to enter an object’s mass, and then calculates its weight. If the object weighs more than 1,000 Newtons, display a message indicating that it is too heavy. If the object weighs less than 10 Newtons, display a message indicating that it is too light.
"""

def main():
    romanNumerals()
    areaRectangle()
    massWeight()

# I hate not following DRY, sorry
def romanNumerals():
    userIn = int(input("Enter a number 1 to 10: "))
    if userIn not in range(1,11):
        print('value can\'t be greater than 10')
    value = [
            10, 9, 5, 4,
            1
            ]
    symbol = [
        "X", "IX", "V", "IV",
        "I"
        ]
    # init values for logic
    roman_num = ''
    i = 0
    while userIn > 0 and userIn < 11:
        for _ in range(userIn // value[i]):
            roman_num += symbol[i]
            userIn -= value[i]
        i += 1
    print(roman_num)

def areaRectangle():
    len1, len2 = map(int,input('Enter the length of your first then second rectangle: ').split())
    wid1, wid2 = map(int,input('Enter the width of your first then second rectangle: ').split())
    area1 = len1 * wid1
    area2 = len2 * wid2
    if area1 == area2:
        print("they have the same area")
    elif area1 > area2:
        print('The Area of the first rectangle is bigger than the area of the second')
    elif area1 < area2:
        print("The Area of the second rectangle is greater than the first")

def massWeight():
    mass = float(input('Enter the mass of your object: '))
    weight = mass * 9.8
    if weight > 1000:
        print('the object is too heavy')
    elif weight < 10:
        print('The object is too light')


if __name__ == "__main__":
    main()
