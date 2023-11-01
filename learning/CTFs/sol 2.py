# This logic has been used to encrypt the flag

"""
import string
from secret import MSG

def encryption(msg):
    ct = []
    for char in msg:
        ct.append((123 * char + 18) % 256)
    return bytes(ct)

ct = encryption(MSG)
f = open('./msg.enc','w')
f.write(ct.hex())
f.close()
"""

"""
def decryption(msg):
    pt = []
    for char in msg:
        char = char — 18
        char = 123 * char % 256
        pt.append(char)
    return bytes(pt)



"""

# reverse the encryption function

def decryption(ct):
    msg = []
    """
     We know the flag is formatted as: HTB{...}
     So we can use the first 4 characters to find the value of the first character of the flag

     We know somewhere in the message is the character 'HTB' which have the ASCII values of 72, 84, 66

     Check to see if any three characters in the message add up to 72, 84, 66
    """
    for i in range(len(ct)):
        for j in range(256):
            if (123 * j + 18) % 256 == ct[i]:
                msg.append(j)
                break


    return bytes(msg)


# read the encrypted flag
with open('./msg.enc','r') as f:
    ct = bytes.fromhex(f.read())
f.close()

# decrypt the flag
msg = decryption(ct)
msg = msg.decode('utf-8')

print(msg)
