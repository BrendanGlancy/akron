# import pwntools
from pwn import *

# string to write to
s = ""

# open up remote connection
r = remote('jupiter.challenges.picoctf.org', 29221)

# Wait for three lines of output
r.recvline()
r.recvline()

# Read in the third line
x = r.recvline()

# Remove all characters that are not numbers from x
# Use regex to remove all non-numbers
# do not remove spaces
x = re.sub(r'[^0-9 ]', '', x.decode('utf-8'))

# Split the string into a list of numbers
x = x.split()

# Convert each item in the list from a binary value to a char value
for i in range(len(x)):
    s += chr(int(x[i], 2))

#  enter the string into the remote connectio

print("first string: " + s)

r.sendline(s + "\n")

# read in the next line
r.recvline()
r.recvline()
r.recvline()
z = r.recvline()

# read in the next line
y = r.recvline()

# remove all characters that are not numbers from y
# Use regex to remove all non number characters
# do not remove spaces
y = re.sub(r'[^0-9 ]', '', y.decode('utf-8'))

# convert the string to a list of numbers
y = y.split()


# Convert each item in the list from octal to a char value
for i in range(len(y)):
    y += chr(int(y[i], 8))

# Convert y back to a string
y = ''.join(y)

# remove all non letter chars from y
y = re.sub(r'[^a-zA-Z]', '', y)
print("second string: " + y)



# read in the next line
r.recvline()

r.sendline(y + "\n")

flag = r.recvline()

print(flag)
