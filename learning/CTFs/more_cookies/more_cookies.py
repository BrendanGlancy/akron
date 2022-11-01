from base64 import b64decode
from base64 import b64encode
import requests

# CBC bitflipping
def bitFlip( pos, bit, data):
    raw = b64decode(data)
    list_data = list(raw)
    list_data[pos] = list_data[pos] ^ bit
    return b64encode(bytes(list_data))


ck = "MGdRY3ZvWnRBaFA2UWVFL1p1WlJOOHpmRW4zMUI5VWgwRzkvcHYraWlpY3NML3BDV2R5eVQyZEI3TGpsM0NXaVJ6YkhFVTRJRDdTV3hTVGx3QU96aFMzMlkwd21sM1dHRWFsN1M4LzNOSnZJUHdzQVZrZDJQalNLZjZYc3NXc0c="

for i in range(128):
    for j in range(128):
        ck = bitFlip(i, j, b64decode(ck))
        ck = b64encode(ck).decode()
        print(ck)
        r = requests.get("http://mercury.picoctf.net:21553", cookies={"auth_name": ck})
        if "picoCTF{" in r.text:
            print(r.text)
            break

