# Complete Programming Exercises 1-3 on page 413.

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
    pass

# Rainfall Stats
"""
Design a program that lets the user enter the total rainfall for each of 12 months into an array. The program should calculate and display the total rainfall for the year, the average monthly rainfall, and the months with the highest and lowest amounts.
"""

def rainfall_stats():
    pass

if __name__ == "__main__":
    main()
