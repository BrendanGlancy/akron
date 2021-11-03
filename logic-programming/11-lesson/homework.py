"""
Complete Programming Review Questions 1-10 page 464 Programming Exercises 1 on page 467.

1. B
2. C
3. D
4. A
5. B
6. C
7. A
8. B
9. A
10. B
"""


# Design a program that asks the user to enter 10 golf scores. The scores should be stored in an Integer array. Sort the array in ascending order and display its contents.
def main():
    scores = []
    for i in range(10):
        print('Enter golf score ',i)
        score = int(input(" "))
        scores.append(score)
    scores.sort()
    print(scores)

if __name__ == "__main__":
    main()
