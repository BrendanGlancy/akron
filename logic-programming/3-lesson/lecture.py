# module 
def myfunction():
    # code run when message() is called
    num1 = 2
    result = 20 * num1
    print(result)


def main():
    print("this is the main method, supposed to be the beginning of the program")
    # new function and we pass in a 4
    double_num(4)
    myfunction()
    value = 10
    print("value in main:", value)
    change_me(value)
    global my_value
    my_value = 25
    number = float(input("Enter a number: "))
    print("you entered:", number)
    show_number(10)

def show_number(num1):
    result = my_value * (num1 + my_value)
    print("result of show_number:", result)

def change_me(arg):
    arg = 0
    print("Value in change_me function:", arg)

def double_num(num):
    print(num * 2)

if __name__ == '__main__':
    main()
