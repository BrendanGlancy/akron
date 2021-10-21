"""
page 346 review questions
1. b
2. c
3. d
4. a
5. b

short answer 1-4 page 347

1. GIGO means that if you have bad input into a program, you'll 
have bad output

2. Input validation is a loop that checks for the datatype or other 
criteria of input is meant, if it is not it loops again and ask
for the correct input format

3. A priming read's purpose is to get the first input value to be 
tested by the validation loop

4. When you do a posttest loop, if the user enters the wrong value
there is no error message. The original prompt is just repeated.
"""

import numpy as np

def main():
    # bools for our validation loops
    pay = False
    hours = False

    while not pay:
        pay_rate = float(input("Enter your hourly pay rate: "))
        if pay_rate >= 7.5 and pay_rate <= 18.25:
            # check to see if the payrate is int he range 7,50 to 18.25
            # get the pay rate
            pay = True
        else:
            print('You must enter a wage in the range $7.50 and 18.25')
    while not hours:
        hours_worked = float(input("Enter hours worked: "))
        if hours_worked in np.arange(0, 41):
            # check to see if hours worked is 0, 40
            hours = True
        else:
            print("You must enter a value in the range 0, 40")
    gross_pay = pay_rate * hours_worked
    print('Your gross pay is $%2.f' % gross_pay)

if __name__ == "__main__":
    main()



