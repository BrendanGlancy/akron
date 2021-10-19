MARK_UP = 2.5

def main():
    another = 'y'

    while another == 'y' or another == 'Y':
        show_retail()
        another = input('Do you have another item? ' +
                        '([y/n]?): ')

def show_retail():
    wholesale = float(input('Enter the item\'s wholesale cost: '))

    while wholesale < 0:
        print('Error: the cost cannot be negetive.')
        wholesale = float(input('Enter the correct wholesale cost: '))

    retail = wholesale * MARK_UP
    print('The retail price is $', format(retail, '.2f'))


if __name__ == "__main__":
    main()
