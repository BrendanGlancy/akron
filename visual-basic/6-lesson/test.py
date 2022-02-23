import re
text = "$100.59anbvad"

# remove all non-digit characters with empty string
# should return "10059"
# use regex to remove all non-digit characters, except for decimal point
# use re.sub() to replace all non-digit characters with empty string
text = re.sub(r'[^\d.]', '', text)

print(text)
