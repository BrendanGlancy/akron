payRate, hours = map(float, input('Enter Pay Rate, space, Hours Worked: ').split())

taxRate = 0.23

grossPay = (payRate * hours)
amount = grossPay * taxRate
netPay = grossPay - amount
print('Your gross pay is:', round(grossPay, 2), 'Your net pay is:', round(netPay,2))
