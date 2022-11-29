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

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

keyOne = 2
keyTwo = 3
keyThree = 4

def encryptOne(plainTextOne, keyOne):
    """
    the cipher is = plaintext - key^2
    using 
    """
    
    return cipherText

def encryptTwo(plainTextTwo, keyTwo):
    """
    the cipher is = plaintext + (key * key^2)
    """

    return cipherText

def encryptThree(plainTextThree, keyThree):
    """
    the cipher is = plaintext - key^2
    """

    return cipherText

def main():
    encryptedOne = encryptOne(plainTextOne, 2)
    encryptedTwo = encryptTwo(plainTextTwo, 3)
    encryptedThree = encryptThree(plainTextThree, 4)
    print("Encrypted One: ", encryptedOne)
    print("Encrypted Two: ", encryptedTwo)
    print("Encrypted Three: ", encryptedThree)

if __name__ == "__main__":
    main()
