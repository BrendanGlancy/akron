import time
import pyautogui

def SendMessage():
    time.sleep(4)
    text = open('rocku.txt')
    for each_line in text:
        pyautogui.typewrite(each_line)
        pyautogui.press('enter')

SendMessage()
