#run file level5.py
#input each line one by one from attempt.txt
#output the result to result.txt
import os
import subprocess
import sys
import time
import re
import string
import random
import hashlib
from numba import jit
from timeit import default_timer as timer

@jit
def main():
    #open attempt.txt and result.txt
    attempt = open("dictionary.txt", "r")
    result = open("result.txt", "w")
    #read each line from attempt.txt
    for line in attempt:
        print(line)
        #run file level5.py with input from attempt.txt
        p = subprocess.Popen(["python3", "level5.py"], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        #output the result to result.txt
        result.write(p.communicate(input=line.encode())[0].decode())
    #close attempt.txt and result.txt
    attempt.close()
    result.close()

def main2():
    # same as main() but without numba
    attempt = open("dictionary.txt", "r")
    result = open("result.txt", "w")
    for line in attempt:
        print(line)
        p = subprocess.Popen(["python3", "level5.py"], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        result.write(p.communicate(input=line.encode())[0].decode())
    attempt.close()
    result.close()



if __name__ == "__main__":

    start = timer()
    main()
    print("with gpu: ", timer() - start)

    start = timer()
    main2()
    print("without gpu: ", timer() - start)

