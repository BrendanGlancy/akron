# Complete Programming Exercises 1-3 on page 413.

import random

def main():
    total_sales()
    lottery_num()
    rainfall_stats()

# Total Sales
"""
Design a program that asks the user to enter a store’s sales for each day of the week. The amounts should be stored in an array. Use a loop to calculate the total sales for the week and display the result.
"""

def total_sales():

    # init variables
    total = 0.0
    daily_sales = [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
    i = 0

    # array for days of the week
    days = ('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday')

    for i in range(7):
        # ask the user to enter a store's sales for each day of the week
        print("Enter the amount of sales for", days[i])
        daily_sales[i] = float(input("Enter sales here: "))

        total += daily_sales[i]

    print('The total sales for the week is $', format(total, '.2f'), sep = ' ')

# Lottery number Generator
"""
Design a program that generates a 7-digit lottery number. The program should have an Integer array with 7 elements. Write a loop that steps through the array, randomly generating a number in the range of 0 through 9 for each element. (Use the random function that was discussed in Chapter 6.) Then write another loop that displays the contents of the array.
"""

def lottery_num():
    # init lotto_num
    lotto_num = []

    # make it look nicer
    print("Lottery Number: ")

    # step through
    for i in range(7):
        lotto_num.append(random.randint(0, 9))
    for j in lotto_num:
        print(j, end="",)
    print("\n")

    

# Rainfall Stats
"""
Design a program that lets the user enter the total rainfall for each of 12 months into an array. The program should calculate and display the total rainfall for the year, the average monthly rainfall, and the months with the highest and lowest amounts.
"""

def rainfall_stats():
    # init months arr and year
    months =  [ 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December' ]
    year = []
    for i in months:
        # were getting the input data in the format i+"|"
        # will use lambda to split at |
        year.append(i+"|"+str(input('Please enter '+i+' rainfall: ')))

    # lambda parameter_list: expression
    # min and max function returns the smallest or largest item in an
    # iterable
    key_func = lambda s:s.split("|")[1]
    split_func = lambda s,index:s.split("|")[index]

    # get the min rainfall
    min_rainfall = min(year,key=key_func)
    print("Minimum Rainfall: "+split_func(min_rainfall,1)+" in the month of "+split_func(min_rainfall,0))


    # get the max rainfall
    max_rainfall = max(year,key=key_func)
    print("Max Rainfall: "+split_func(max_rainfall,1)+" in the month of "+split_func(max_rainfall,0))

    # get total
    total = sum([float(split_func(p,1)) for p in year])
    print("Total Rainfall: "+str(total))

    # avg = total / len(year)
    print("Average Rainfall: "+str(float(total/len(year))))




if __name__ == "__main__":
    main()
