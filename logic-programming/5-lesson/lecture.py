def main():
    name1 = 'Mary'
    name2 = 'mary'
    # if you want to check this without case sensitivity, use upper()
    if name1 == name2:
        print('same')
    else:
        print('!=')


def two():
    x = float(input('Enter a value: '))
    if x not in range(20, 40):
        print('in range')
    else:
        print('not in range')

def three():
    sales = float(input('Enter your sales: '))
    if sales >= 50000.0:
        sales_quota_met = True
    else:
        sales_quota_met = False

    print(sales_quota_met)

def grades():
    grade = float(input('Enter your points: '))
    if grade <= 60:
        print('F')
    elif grade >= 61 and grade <= 69:
        print('D')
    elif grade >= 70 and grade <= 79:
        print('C')
    elif grade >= 80 and grade <= 89:
        print('B')
    elif grade >= 90:
        print('A')

def overtime():
    hours = int(input('Enter your hours worked: '))
    stdhours = 40
    pay = float(input('Enter pay rate: '))
    if hours > stdhours:
        otPay = hours - stdhours
        otPayRate = 1.5 * pay
        grossPay = otPay * otPayRate + (stdhours * pay)
    else:
        grossPay = hours * pay
    print('Your pay is:', grossPay)

def customerDiscount():
    items = float(input('Enter the number of items purchased: '))
    total = 395.0
    if items >= 0 and items <= 10:
        print('Your total is:', total)
    elif items >= 11 and items <= 24:
        discount = total  - (total * 0.1) 
        print('Your total is:', discount)
    elif items >= 25 and items <= 50:
        discount = total - (total * 0.15)
        print('Your discount is:', discount)
    elif items >= 51:
        discount = total - (total * 0.2)
        print('Your total is:', discount)
    else:
        print('you can\'t have this many items')

if __name__ == "__main__":
    # main()
    # two()
    # three()
    # grades()
    # overtime()
    customerDiscount()


