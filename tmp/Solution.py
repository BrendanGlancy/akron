# print out a string from the command line
import requests
from pprint import pprint

url = "https://api.beersmart.io/dev/beerfinder/orgs/10ca976a-f16e-46f4-b45a-489e49fd227c/products"

def get(url):
    response = requests.get(url)
    pprint(response.json())
    print(response.json()['products'].__len__())
    print(response.json()['products'][2])

if __name__ == "__main__":
    get(url)
