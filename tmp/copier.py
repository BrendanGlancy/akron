import pyperclip
import time
import os
import openai

def clipboard_listener():
    last_clipboard_value = ""
    
    while True:
        clipboard_value = pyperclip.paste()
        if clipboard_value != last_clipboard_value:
            last_clipboard_value = clipboard_value
            chat_gepity(clipboard_value)
        time.sleep(1)


def chat_gepity(clipboard_value):
    print(f"Copied to clipboard: {clipboard_value}")
    openai.organization = "org-CUdodZ48VjZcXBFRtTrlRuFw"
    openai.api_key = "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"
    # print(openai.Model.list())
    
    response = openai.Completion.create(
        model="text-davinci-003",
        prompt="Answer this multiple choice or fill in the blank question as an expert on system design and analysis: " + clipboard_value,
        max_tokens=100
    )
    
    answer = response.choices[0].text.strip()
    print(f"Answer from API: {answer}")

if __name__ == "__main__":
    clipboard_listener()
