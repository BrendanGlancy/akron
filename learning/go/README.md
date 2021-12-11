# Learning Go

Go is an open-source programming language developed at Google by Robert Griesemer, Rob Pike, and Ken Thompson. It is often described as "C for the 21st century", however, it borrows import ideas from several other languages like ALGOL, Pascal, Modula-2, Oberon, CSP, and others. At it's core, GO relies on simplicity, reliability, and effieciency to overcome the shortcomings of its ancestors. GO has garbage collection, a package system, first-class functions, lexical scope, immutable strings that rely on UTF-8 and an awesome concurrency model.

As a compiled language, Go is generally faster than interpreted languages and is safer from crashes thanks to its build-in type systems. That being said, there is a good balance between expressiveness and safety that gives programmers the benefits of a strong type system without the burden of complex workflows.

The Use cases of language vary from networks servers and distributes systems to CLI's, web mobile development, scalable databases, and cloud-native application.

## First Program 

```go
package main

import "fmt"

func main() {
	fmt.Println("Hello, world") // Call Println() from the fmt package.
}
```
To run this, you need to install GO, I am on linux and I found the easiest way to do this is brew


```console
brew install go
go build hello_world.go
```
