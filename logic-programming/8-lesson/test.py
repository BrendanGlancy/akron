"""
A retail company assigns a $5000 store bonus if monthly sales are more than $100,000; otherwise a $500 store bonus is awarded.  Additionally, they are doing away with the previous day off program and now using a percent of sales increase to determine if employees get individual bonuses.  If sales increased by at least 4% then all employees get a $50 bonus. If they do not, then individual bonuses are 0.
"""

def main():
    month_sales = int(input("Enter the monthly sales: "))
    month_sales_increase = int(input("Enter the percent sales increased: "))
    store_bonus = 500
    individual_bonus = 0
    if month_sales > 100000:
        store_bonus = 5000
    if month_sales_increase >= 4:
        individual_bonus += 50
    print("Store Bonus is $%.2f" % store_bonus)
    print("Individual bonus $%.2f" % individual_bonus)

if __name__ == "__main__":
    main()
