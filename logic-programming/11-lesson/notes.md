# Sorting and Seaching Arrays

<b>Bubble Sort</b>
- Useful for alphabetical list and numerical sorting
- Array Elements are compared and numbers bubble toward the end of the array
- Swapping elements must be done in order to properly sort the array

```python
def bubbleSort(arr): 
    n = len(arr) 
  
    # Traverse through all array elements 
    for i in range(n-1): 
    # range(n) also work but outer loop will repeat one time more than needed. 
  
        # Last i elements are already in place 
        for j in range(0, n-i-1): 
  
            # traverse the array from 0 to n-i-1 
            # Swap if the element found is greater 
            # than the next element 
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 
  
# Driver code to test above 
arr = [64, 34, 25, 12, 22, 11, 90] 
  
bubbleSort(arr)
```

<b>Seletion Sort</b>
- Bubble sort moves one element at a time
- Selection sort performs fewer swaps because it moves items immediately to their final position

```python
def selection_sort(lst):
    empty_lst = []
    x = len(lst) - 1
    while x>=0:
        for i in range(len(lst)):
            if lst[i] <= lst[0]:
                lst[0],lst[i] = lst[i],lst[0]
                # this part compares the number in first index and numbers after the first index.
        g = lst.pop(0)
        empty_lst.append(g)
        x -= 1
    return empty_lst
    
print(selection_sort([2,3,4,2,1,1,1,2]))
```

<b>Insertion Sort</b>
- Sorts the first two elements, which become the sorted part of the array
- Each remaining element is then inserted into the sorted part of the array at the correct location
- Also more efficent than the bubble sort

```python
def insertionSort(alist):

   for i in range(1,len(alist)):

       #element to be compared
       current = alist[i]

       #comparing the current element with the sorted portion and swapping
       while i>0 and alist[i-1]>current:
           alist[i] = alist[i-1]
           i = i-1
          alist[i] = current

       #print(alist)

   return alist

print(insertionSort([5,2,1,9,0,4,6]))
```

<b>The Swap Module</b>
- It is the same in each sorting algorithm and only changes in the parameter list to account for the type of data passed to it

<b>Binary Search</b>
- Requires that the array is first sorted
- The first comparison is done with teh middle element of the array to see if it is greater than or less than the number that is being searched
- If it's greater than, then the number must be in the second half of the array
- If it's less than, first half
- Recursive

```python
# Returns index of x in arr if present, else -1 
def binary_search(arr, low, high, x): 
  
    # Check base case 
    if high >= low: 
  
        mid = (high + low) // 2
  
        # If element is present at the middle itself 
        if arr[mid] == x: 
            return mid 
  
        # If element is smaller than mid, then it can only 
        # be present in left subarray 
        elif arr[mid] > x: 
            return binary_search(arr, low, mid - 1, x) 
  
        # Else the element can only be present in right subarray 
        else: 
            return binary_search(arr, mid + 1, high, x) 
  
    else: 
        # Element is not present in the array 
        return -1
  
# Test array 
arr = [ 2, 3, 4, 10, 40 ] 
x = 10
  
# Function call 
result = binary_search(arr, 0, len(arr)-1, x) 
  
if result != -1: 
    print("Element is present at index", str(result)) 
else: 
    print("Element is not present in array") 
```


