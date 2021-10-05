"""
1. b

2. d

3. d

4. a

5. b

6. a

7. c

8. b

9. d

10. a

"""

"""
Directions for 279

1. A bug collector collects bugs every day for seven days. Design a program that keeps a running total of the number of bugs collected during the seven days. The loop should ask for the number of bugs collected for each day, and when the loop is finished, the program should display the total number of bugs collected.

2. Running on a particular treadmill you burn 3.9 calories per minute. Design a program that uses a loop to display the number of calories burned after 10, 15, 20, 25, and 30 minutes.

3. Design a program that asks the user to enter the amount that he or she has budgeted for a month. A loop should then prompt the user to enter each of his or her expenses for the month, and keep a running total. When the loop finishes, the program should display the amount that the user is over or under budget.

"""

def main():
    bugCollector()
    caloriesCounted()
    budget()


def bugCollector():
    # init totBugs
    totBugs = 0
    # loop 7 with input and calc
    for i in range(7):
        bugs = int(input('Bugs collected daily: '))
        totBugs += bugs

    # display
    print('Total bugs over 7 days,', totBugs)

def caloriesCounted():
    calsPerMin = 3.9
    for i in range(10, 31, 5):
        print(i * calsPerMin, 'Calories')

def budget():
    monthBudget = float(input('Enter budget for the month: '))

    # exit loop + init totExpense
    keep_loop = 'y'
    totExpense = 0
    
    while keep_loop == 'y':
        # prompt to enter an expense
        expense = float(input('Enter an expense: '))


        # calc remaining
        monthBudget -= expense
        totExpense += expense

        # remaining display + expense running total
        # %.2f mean the number will be displayed with 2 after the 
        # Floating point
        print('Expenses total $%.2f' % totExpense)
        print('Remaining cash $%.2f' % monthBudget)

        keep_loop = input('Enter y to add another expense (y/n): ')


if __name__ == "__main__":
    main()



