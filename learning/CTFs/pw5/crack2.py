# Call the level5.py file and bruteforce the password
# All possible passwords are in the file dictionary.txt

import os
import sys
import subprocess

def main():
    # Open the dictionary file
    with open('dictionary.txt', 'r') as f:
        # Read each line
        # remove the whitespace from dictionary.txt
        for line in f.read().splitlines():
            # Run the level5.py file with the password
            # as an argument
            # call the level5.py file
            # pass the password after prompt to enter password
            # pass the password as a string
            output


if __name__ == '__main__':
    main()
