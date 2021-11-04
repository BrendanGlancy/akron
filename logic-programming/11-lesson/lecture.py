from statistics import mean 

def main():
    reverse_arr()
    twenty()
    third_prob()
    asend()

def reverse_arr():
    arr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    for i in range(10):
        print("Enter number position", i)
        arr[i] = int(input("Enter number: "))
    arr.reverse()
    print(arr)

def twenty():
    arr = []
    for i in range(20):
        print("Enter number position", i)
        arr.append(int(input("Enter number: ")))

    arr.sort()
    minimum = min(arr)
    maxium = max(arr)
    print(minimum)
    print(maxium)

def third_prob():
    arr = []
    for i in range(10):
        arr.append(float(input("Enter number: ")))

    avg = mean(arr)
    print(avg)

    for j in range(10):
        arr[j] -= avg

    print(arr)

def asend():
    arr = 0
    arrs = []
    for i in range(10):
        print('Enter a number ',i+1)
        arr = int(input(" "))
        arrs.append(arr)
    arrs.sort()
    print(arrs)


if __name__ == "__main__":
    main()
