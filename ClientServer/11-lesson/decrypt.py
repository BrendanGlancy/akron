"""
1.	Use the following details to encrypt the following plaintext. (5 points)
•	Alphabet: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
•	Plaintext: reject virus now
•	Cipher: = Plaintext – Key^2
•	Key: 2
•	Ciphertext:  

2.	Use the following details to encrypt the following plaintext. (5 points)
•	Alphabet: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
•	Plaintext: process it
•	Cipher: = Plaintext +  (Key * Key^2)
•	Key: 3
•	Ciphertext:  

3.	Use the following details to encrypt the following plaintext. (5 points)
•	Alphabet: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
•	Plaintext: defragment the hard drive
•	Cipher: = Plaintext – Key^2
•	Key: 4
•	Ciphertext:  
"""

plainTextOne = "reject virus now"
plainTextTwo = "process it"
plainTextThree = "defragment the hard drive"

alphabet = "abcdefghijklmnopqrstuvwxyz"

keyOne = 2
keyTwo = 3
keyThree = 4

# encrypt the plain text using the ciphers
# 1. Plaintext – Key^2
# 2. Plaintext +  (Key * Key^2)
# 3. Plaintext – Key^2

def encrypt(plainText, key, cipher):
    cipherText = ""
    for letter in plainText:
        if letter == " ":
            cipherText += " "
        else:
            letterIndex = alphabet.index(letter)
            cipherText += cipher(letterIndex, key)
    return cipherText

def cipherOne(letterIndex, key):
    return alphabet[(letterIndex - key**2) % len(alphabet)]

def cipherTwo(letterIndex, key):
    return alphabet[(letterIndex + key * key**2) % len(alphabet)]

def cipherThree(letterIndex, key):
    return alphabet[(letterIndex - key**2) % len(alphabet)]

print("Ciphertext 1: ", encrypt(plainTextOne, keyOne, cipherOne))
print("Ciphertext 2: ", encrypt(plainTextTwo, keyTwo, cipherTwo))
print("Ciphertext 3: ", encrypt(plainTextThree, keyThree, cipherThree))
