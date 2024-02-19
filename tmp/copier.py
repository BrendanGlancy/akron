import pyperclip
import time
import os
import openai
from openai import OpenAI

client = OpenAI(api_key="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")


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
    # TODO: The 'openai.organization' option isn't read in the client API. You will need to pass it when you instantiate the client, e.g. 'OpenAI(organization="org-CUdodZ48VjZcXBFRtTrlRuFw")'
    # openai.organization = "org-CUdodZ48VjZcXBFRtTrlRuFw"
    # print(openai.Model.list())

    try:
        response = client.chat.completions.create(
            model="gpt-4",
            messages=[
                {
                    "role": "system",
                    "content": "You are an expert in applied data mining and statistics and the following multiple choice question by picking one of the choices.",
                },
                {"role": "user", "content": clipboard_value},
            ],
        )

        answer = response.choices[0].message.content
        print(f"Answer: {answer}")
        print("\n")
    except Exception as e:
        print(f"An error occurred: {str(e)}")


if __name__ == "__main__":
    clipboard_listener()
