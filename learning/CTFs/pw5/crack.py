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
            # Call the level5.py file
            # Pass the password as an argument
            # Capture the output
            # Level5.py is a python file you you need to call it with python3
            # The output is a byte string so you need to decode it
            output = subprocess.check_output(['python3', 'level5.py', line]).decode('utf-8')

            # Check if the output contains the string "Correct"
            if 'Welcome' in output:
                # Print the password
                print(line)
                # Exit the program
                sys.exit(0)



if __name__ == '__main__':
    main()
