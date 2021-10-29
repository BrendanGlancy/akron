import math

def main():
    
    # init arrays
    names = ['molly', 'steve', 'will', 'alicia', 'adriana']
    even = [2, 4, 6, 8]
    numbers = [0, 0, 0]
    arr = [10, 20, 30, 40]

    # can the values in the numbers array
    numbers[0] = 10
    numbers[1] = 20
    numbers[2] = 30

    # print numbers
    print(numbers)

    # For loop to display the names
    for i in range(len(names)):
        print(names[i])

    for x in range(len(even)):
        print(even[x])

    # init index
    ind = 0
    while ind < len(arr):
        print(arr[ind])
        ind += 1
    # returns an array of prime numbers
    print(prime())

def prime():
    a=[i for i in range(2,int(input('Enter a range prime numbers: '))) if 0 not in [i%n for n in range(2,int(math.sqrt(i)))]]
    return a


if __name__ == "__main__":
    main()
