"""
The area of a rectangle is calculated according to the following formula:

Design a function that accepts a rectangle’s width and length as arguments and returns the rectangle’s area. Use the function in a program that prompts the user to enter the rectangle’s width and length, and then displays the rectangle’s area.

Feet to Inches

One foot equals 12 inches. Design a function named feetToInches that accepts a number of feet as an argument, and returns the number of inches in that many feet. Use the function in a program that prompts the user to enter a number of feet and then displays the number of inches in that many feet.

Math Quiz

Design a program that gives simple math quizzes. The program should display two random numbers that are to be added, such as:

  247
+ 129
The program should allow the student to enter the answer. If the answer is correct, a message of congratulations should be displayed. If the answer is incorrect, a message showing the correct answer should be displayed.
"""
from random import randint

def main():
    rectangleArea()
    feetToInch()
    math_quiz()

def rectangleArea():
    width = float(input('Enter the width: '))
    length = float(input('Enter the length: '))
    area = (width * length)
    print('The area of rectangle:', area)

def feetToInch():
    feet = int(input('Enter how many feet: '))
    inches = (feet * 12)
    print('Inches in that many feet:', inches)

def math_quiz():
    val1 = randint(100, 1000)
    val2 = randint(100, 1000)
    print(' ', val1, '\n+', val2)
    ans = val1 + val2
    usr_ans = int(input('Enter the correct answer: '))
    if ans == usr_ans:
        print("congratulations, correct")
    else:
        print('incorrect the answer is:', ans)

if __name__ == "__main__":
    main()
