# Lesson 14 in class assignment
- 10.1 Where are files normally stored?

most operating systems stores files on a hard disk. 

- 10.2 What is an output file?
  
A file that data is written to
- 10.3 What is an input file?
  
A file that data is read from

- 10.4 What three steps must be taken by a program when it uses a file?

Open the file-process the file-close the file

- 10.5  In general, what are the two types of files? What is the difference between these two types of files?

Text and binary
A text file contains data that has been encoded as text, using a scheme such as ASCII or Unicode. 

- 10.6 What are the two types of file access? What is the difference between these two?

sequential access and direct access

- 10.7 When writing a program that performs an operation on a file, what two file-associated names do you have to work with in your code?

file_variable and filename
file_variable is the name of the variable that will reference the file object.
filename is a string specifying the name of the file.

- 10.8 In most programming languages, if a file already exists what happens to it if you try to open it as an output file?

The files contents are earsed

- 10.9 What is the purpose of opening a file?

Opening a file crates a connection between the file and the program. It also creates an association between the file and a file object.

- 10.10 What is the purpose of closing a file?

Closing a file disconnects the program from the file.

- 10.11 Generally speaking, what is a delimiter? How are delimiters typically used in files?

A predefined character or set of characters that marks the end of piece of data. In many languages, a delimiter is written after each item that is stored in a file.

-10.12 In many systems, what is written at the end of a file?

EOF

-10.13 What is a file’s read position? Initially, where is the read position when an input file is opened?

marks the location of the next item that will be read from the file.

- 10.14 In what mode do you open a file if you want to write data to it, but you do not want to erase the file’s existing contents? When you write data to such a file, to what part of the file is the data written?

You open the file in append mode. When you write data to a file in append mode, the data is written to the end of the file's existing contents.
