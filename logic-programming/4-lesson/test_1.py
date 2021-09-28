def main():
    calc()

def calc():
    name = str(input('Enter your name: '))
    degreeName = str(input('Enter the name of your degree: '))
    creditCurrrent = float(input('Enter the number of Credits you have: '))
    creditRequired = float(input('Enter the number of Credits needed: '))

    creditLeft = creditRequired - creditCurrrent
    print('Name:', name, 'Degree:', degreeName, 'Credit till graduation:', creditLeft)


main()
