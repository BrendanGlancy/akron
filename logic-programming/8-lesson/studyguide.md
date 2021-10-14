# Decison Statements:

If/then - single alternative 
If/then else - dual alternative

Nested loops:
```py
if condition:
    if condition:
        code here
```
Logical operator - AND, OR, NOT
Relational Operators - ==, <=, >= ...

# Looping 

Types of loops:
- Do while
- while
- Do until

```py
# Do until
for i in range(x, y):
    print("For/Do until loop")

while True:
    print("While loop")

# Python does not have a do-while loop. You can however simulate
# it by using a while loop over True and breaking when a certain
# condition is met.
# Example:
i = 1
while True:
    print(i)
    i = i + 1
    if(i > 3):
        break
```
3 major steps looping:
1. initialization
2. condition
3. update

Nested loop

```py 
for i in range(5):
  for j in range(i):
    # you can add many for loops or you can just write any code

# Accumulator
# The count is the accumulator
count=0
for item in list:
    print item
    count +=1
    if count % 10 == 0:
        print 'did ten'
```

# Functions 
```py
# imported libary function
import numpy as np

# built in python functions
print()
type()
```
