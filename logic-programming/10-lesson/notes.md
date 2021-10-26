# Lesson 8 Arrays

Use arrays instead of multiple variables, why cause DRY

Don't Repeat yourself

```python
array = ["1st", "2nd", "3rd"]
#prints: ['1st', '2nd', '3rd']
array.append("4th")
#prints: ['1st', '2nd', '3rd', '4th']
```

Arrays can be 3 or more dimesions

```java
// Java arrays
int[] number = new int[6]
```

```python
# Array of number + size for length of numbers
numbers = [10, 20, 30]
size = len(numbers)

# will show length and all numbers in array
for i in range(0, size):
    print(i)
    print('Numbers in array', numbers[i])
```

The lecture talks about for each loops, but there are no for each loops
in python. The same thing can be performed with a for loop like this:

```python
fruits = ["apple", "banana", "cherry"]
for x in fruits:
	print(x)
```` 
