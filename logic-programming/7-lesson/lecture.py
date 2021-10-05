"""
Write a code for the manager at The Couch Potato Furniture company to determine the profit on any items sold. Input includes the wholesale price and retail price for an item. The output is the item's profit, which is the retail price minus the wholesale price.  Use 3 modules. The main program declares global variables and calls wholesaleprice, retailprice and profitresult throughout the program.  The final output should include the final result along with displaying "Thanks for using The Couch Potato Furniture Company. 
"""

def main():
    # init 
    global wholesale_cost, markup_percent, profit
    wholesaleprice()


def wholesaleprice():
    # input values for wholesale and retailprice
    wholesale_cost = float(input("Enter the whole-sale cost: "))
    print('Whole-Sale cost, $%.2f' % wholesale_cost)
    retailprice(wholesale_cost)

def retailprice(num1):
    markup_percent = float(input('Enter the markup percent price: '))*.01
    retail = (num1 * markup_percent) + num1
    print('retail price, $%.2f' % retail)
    profitresult(num1, retail)



def profitresult(num1, num2):
    profit = (num2 - num1)
    print('Profit, $%.2f' % profit)
    print('Thanks for using The Couch Potato Furniture Company. ')






if __name__ == "__main__":
    main()
