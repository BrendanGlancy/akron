import requests
import config

# use the api key in the .env file
api_key = config.API_KEY_NASA
url = 'https://api.nasa.gov/planetary/apod?api_key=' + api_key
file = open('description.txt', 'w')

def get_image():
    """
    Get the image from the NASA API
    """
    response = requests.get(url)
    response.raise_for_status()
    # get the "url" from the response and pass it to open_image
    image = response.json()
    open_image(image)
    description(image)
    return response.json()

def open_image(image):
    import webbrowser
    webbrowser.open(image['url'])

def description(response):
    """
    Put the description of the image in a txt file
    """
    # put the date in the file with a new line
    file.write(response['date'] + '\n')
    file.write(response['explanation'])


if __name__ == "__main__":
    print(get_image())


# close the file
file.close()
