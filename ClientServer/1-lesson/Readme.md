# Introduction

This class is based around web development.
Internet vs the World Wide Web
- The Internet is a network of computers and devices that are interconnected by a network of links.
- The World Wide Web is a network of websites that are interconnected by a network of links.

The world wide web or web for short are the pages you see when you're online. The internet is the network of connected computers that the web works on. Think of the internet as the roads that connect towns and cities together.

### A web application can have up to 5 layers
- Web browser
- Web server
- Application server
- Business logic
- Database server

## Two-tiered client server model
- An example of this would be a database, and a server acting as a database management system. Connected to a network of computers

## Business Logic Considerations
- data security
  - Providing limited access to various parts of the data or to various task that may be performed on the data
  - Implemented by granting user access privileges to certain parts of the data
- data integrity
  - Ensures that the data is not corrupted or tampered with
  - Implemented by checking the data against a checksum
- centralized control
  - Ensures that the data is not manipulated by a third party
  - Implemented by having the data be stored in a central location
- scalability / proper distribution of work
  - Ensures that the data is distributed evenly across the network
  - Implemented by having the data be stored in a distributed system

## Client Server vs database desktop development
- Client server is a model that allows for the separation of the client from the server.
- Database desktop development is a model that allows for the separation of the database from the desktop.


# Lecture 2 Introduction to Web development

**Chapter 1 overview**
1. A complicated Ecosystem
2. Definitions and History
3. The Client-Server Model
4. Where is the Internet
5. Working in Web Development
6. Summary

## Foundations of the Web
- The web is a subset of the internet
- The history of the internet
  - Before packet switching there was circuit switching in the early days it was called the ARPANET
  - Packet Switching had an advantage in that you didn't need a continuous connection
- The web was created on MIT campus by Tim Burners Lee

There is a lot more history to the foundations of the internet but it was covered very briefly in this class


### Terms
- URL Uniform Resource Locator to uniquely identify a resource on the WWW
- HTTP Hypertext Transfer Protocol HTTP to describe requests and responses operate
- Hypertext Markup Language HTML
-

### Three main parts of a url
https://brightspace.uakron.edu/brendan/page.html

- **http** - protocol
- **brightspace.uakron.edu** - domain or ip address
    - **server** - brightspace
    - **domain** - uakron
    - **domain type (Top level domain)** - edu
- **brendan/page.html** - file path

To access data on the web you need a web browser, one of the first was the **Netscape Navigator**

### JavaScript

Used in the development of web 2.0, to make pages more dynamic to see a better explaination of what JS is visit
https://github.com/BrendanGlancy/akron/tree/master/learning/javascript

## The Client Server Model

The client-server model describes a specific way devices access information stored in servers. It allows multiple clients to open applications or retrieve files from an individual server, which helps maintain consistency across all devices.


### The OSI model Open System Interconnection
- Appilcation
- Presentation
- Session
- Transport
- Network
- Data Link
- Physical

**All Programmers Seem To Need Data Processing**

### The seven layers of the OSI model are cramped into 4 layers in the TCP IP model
- Apllication Layer
  - Higher protocols that allow applications to interact with transport layer
- Transport Layer
  - Ensures transmissions arrive in order without error
- Internet Layer (IPv4, IPv6)
  - Establishes Connection, routing and addressing
- Link Layer (Mac)
    - Responsible for physical transmission of raw bits

![FG_02_001](https://user-images.githubusercontent.com/61941978/193042617-249af617-ee5d-442f-831f-6357bdaf1f3f.jpg)

| IPv4  | IPv6 |
|--------------- | --------------- |
| 4-8 bit components (32 bits) | 8-16 bit components (128 bits) |
| 192.0.2.146  | 2001:0db8:85a3:0000:0000:8a2e:0370:7334 |

### There are many application layer protocols, A few that are useful to web developers include:
- **HTTP** The Hypertext Transfer Protocol is used for web communication
- **SSH** The Secure Shell Protocol allows remote command-line connections to servers
- **FTP** The file Transfer protocol is used for transferring files between computers
- **POP/IMAP/SMTP** Email-related protocols for transferring and storing email.
- **DNS** The Domain Name System protocol used for resolving domain names to IP addresses.


### Generic top-leve domain (gTLD)
- The Domain Name System protocol used for resolving domain names to IP addresses.
- SPONSORED. TLDs including .gov, .mil, .edu, and others. These domains can have requirements for ownership and thus new second-level domains must have permission from the sponsor before acquiring a new address.
- NEW. Starting in June 2012, ICANN invited companies to launch new TLDs in order to provide more choice than the handful of TLD that existed to date. Since then over 1000 new TLD have been created including .art, .cash, .cool, .jobs, .tax and so on. You can now purchase domain names under these new TLD at most registrars.

## Uniform Resource Locators

**http://www.funwebdev.com/index.php?page=18#article**
- http:
  - Protocol
- www.funwebdev.com
    - Domain
- index.php
  - Path
- ?page=17
  - Query String
- #article
  - Fragment

### Query string components

![FG_02_011](https://user-images.githubusercontent.com/61941978/193042933-3fa1c90f-509d-48ea-9581-4e05ec3a070e.jpg)

**?username=john&password=abcdefg**

| Keys    | Values    | Delimiter  |
|---------------- | --------------- | --------------- |
| username    | john    | ?   |
| password |abcdefg |  &   |

### Common HTTP status codes
- 100-199
  - Information responses
- Success responses
  - 200-299
- Redirection messages
  - 300-299
- Client error responses
  - 400-499
- Server error responses
  - 500-599
