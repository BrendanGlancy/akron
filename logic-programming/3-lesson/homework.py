# 1
def kilometerToMile(distance):
    miles = distance * 0.6214
    return miles
# 2
amt = float(input('Enter the amount of a purchase: '))

def main(amt):
    stateAmt = stateTax(amt)
    countyAmt = countyTax(amt)

    totTax = totalSalesTax(countyAmt, stateAmt)
    totalSale(totTax, amt)


def stateTax(amt):
    stateAmt = amt * 0.04
    print('Amount of state tax:', stateAmt)
    return stateAmt

def countyTax(amt):
    countyAmt = amt * 0.02
    print('Amount of county tax:', countyAmt)
    return countyAmt

def totalSalesTax(countyAmt, stateAmt):
    totTax = countyAmt + stateAmt
    print('total amount of tax:', totTax)
    return totTax

def totalSale(totTax, amt):
    total = totTax + amt
    print('the total sale amount: ', total)

if __name__ == '__main__':
     main(amt)
# 3
def minimumInsurance(cost):
    insuranceMin = cost * 0.8
    print(insuranceMin)
