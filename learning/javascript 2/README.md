<h1 align="center"> Fireship.io JavaScript course </h1>

# Lesson 1, History of JavaScript

Tim Burners Lee developed the Internet, nobody really knew what it was at the time.

1991 Al Gore introduces the Gore Bill, provided funding for the first mainstream browser Mosaic
In the beginning there was no JavaScript, just the Document Object Model (DOM)

The web needed something to make it more dynamic, important founders of the web turned to Java
Which at the time was very trendy.

Enter **Brendan Eich** (very cool firstname btw), who had very little time to write a scheming language that would act as the glue for developers then.
In 10 days he wrote what would be considered the first version of JavaScript called Mocha. The **Syntax** was very similar to Java with things like {}

## Under the hood of the orignal JavaScript

- First-Class Functions (like Scheme)
- Dynamic typing (like Lisp)
- Prototypial inheritance (like Self)

Since it was written in 10 days, Brendan Eich wrote a flexible Multi-paradigm language, that developers could use to apply their own language patterns to.

## Atwood's Law (2007)
"Any application that can be written in JavaScript, will eventually be written in JavaScript."

## September 1995

- Mocha renamed to LiveScript
- Shipped in the Beta releases of Netscape Navigator 2.0
- A few months later they renamed it JavaScript

## Mircosoft

Mircosoft was in it's Bill Gates monopoly peak, naturally they reverse engineered JavaScript into a language they called JScript
With this almost identical language, many realized there would be a need to standardize JavaScript. They turned to **ECMA**
**ECMA-262** gave browser vendors a consistent set of guidelines for implementing the JavaScript Language

One of Brendan Eichs biggest **regrets** was how equality works in JavaScript

```JavaScript
23 == '23'
// true
```

^^ Thought this would be convenient

## ES3

- Better error handling
- Strict Equals Operator (===)

```JavaScript\
23 === '23'
// false
```

Some time later, Mircosoft has still ignored the ECMA guidelines and has created fragmentation. Controlling 90% of the browser market share they were able to do this with no regard
This did lead to some good things, Like **Ajax**.

In the mid 2000s, developers were very frustrated trying to build web application that ran on all browsers

| Release   | Description |
|--------------- | --------------- |
| **JQuery**   |  Allowed developers to build far more complex and interactive applications, worked more reliably on all browsers |
| **Chrome & V8** | Came out together, changed the way JavaScript was complied and interpreted, making it a viable option for high performance applications on the frontend and backend |
| **NodeJS**   | Introduced by Ryan Dahl, serverside runtime for V8, allowed event driven non-blocking code. Used for building realtime web applications that scale. |

## ES5

**10 years after the last official spec**

- Json support
- Functional array and object methods
- Strict mode
- ETC...

Even more libraries came out around 2010-2020, To name a few:

- Angular
- React
- Vue
- TypeScript (Not a library but came out around the same time)


---

# Lesson 2, How JavaScript works

What we will learn

**How a:**

- High-level
- Single-Threaded
- Garbage-Collected
- Interpreted
- Or Just-In-Time complied
- Prototype-Based
- Multi-paradigm
- Dynamic Language
- With a non-blocking event loop

**Works...**

## Down to the bare metal

When you run a JavaScript program program, it needs Random Access **Memory** to allocate things that needed to be stored at runtime. It also needs a thread from you cpu to execute the instrution in your code.
As a JavaScript developer you never really have to think about this stuff because its a **high-level** programming language

#### What does High-Level really mean??

The degree of **Abstraction** or simplification that the language provides over the computers hardware.

The **Lowest-Level** language is machine code. Which is a numeric language that can be executed directly by the CPU. This would make it extremely difficult to program something like a website in.

| Machine Instruction   | Machine Operation    |
|--------------- | --------------- |
| 00000000   | Stop Operation |
| 00000001   | Turn bulb fully on |
| 00000010   | Turn bulb fully off |
| 00010000   | If bulb is fully on, skip over next instruction |

Going up a couple of levels, we reach C language that provides a modern syntax and the ability to write cross platform applications. The developer still has to be concerned with low level issues like memory allocation

```c
#include<stdio.h>
#include<conio.h>
void main()
{
	char choise;

	char hel;

	int p,k,g;

	int b,c,e;

	printf("\n Welcome to GM Program :) \n\n It's a one time usalbe program so you can start the program again and again");
	printf("\n\n Type 't' for Tables");
	printf("\n\n Type 'h' for ASMD is Add,Sub,Mul,Div");
	printf("\n\n Enter :- ");
	scanf("%c",&choise);

	switch(choise)
	{
		case 't':
		printf("\n\n Enter a number to make the table :- ");
		scanf("%d",&p);
		for(k=1;k<11;k++)
		{
			g=p*k;
			printf("\n\n %dx%d=%d",p,k,g);
		}
		break;
		case 'h':
		printf("\n\n Type 'a' for add \n\n Type 's' for sub \n\n Type 'm' for mul \n\n Type 'd' for div");
		printf("\n\n Enter :- ");
		scanf("%s",&hel);
		switch(hel)
		{
			case 'a':
			printf("\n\n Enter two number to add :- ");
			scanf("%d%d",&b,&c);
			e=b+c;
			printf("\n\n Your answer :- %d+%d=%d",b,c,e);
			break;
			case 's':
			printf("\n\n Enter two number to sub :- ");
			scanf("%d%d",&b,&c);
			e=b-c;
			printf("\n\n Your answer :- %d-%d=%d",b,c,e);
			break;
			case 'm':
			printf("\n\n Enter two number to mul :- ");
			scanf("%d%d",&b,&c);
			e=b*c;
			printf("\n\n Your answer :- %dx%d=%d",b,c,e);
			break;
			case 'd':
			printf("\n\n Enter two number to div :- ");
			scanf("%d%d",&b,&c);
			e=b/c;
			printf("\n\n Your answer :- %d/%d=%d",b,c,e);
			break;
	   }
	}
	getch();
	return 0;
}
/* program with switch and loop */
```

Going up a level higher, we reach the level of something like JavaScript or Python

These languages have abstractions like **garbage collection & dynamic typing** to simplify the way developers write their applications

## Key terms related to JavaScript

There are two fundamental ways we can translate the code written in a programming language to something the CPU can actually execute.
One of them is called an **Interpreter** and the other is a **Compiler**

JavaScript is an interpreted language, which means that it needs to have an interpreter in the environment to read the actual source code and execute it.
(Well, sort of... It's more of an implementation detail... see below to see what the hell that means)

### How interpreters work

JS -> Interpreter -> OUTPUT
Interprets instructions in order one by one

### How Compiler works

Statically analysis all your code in advance and complies it down to a binary that can actually run on the machine

C -> Compiler -> Binary -> OUTPUT

JavaScript was never designed to be a complied language, but modern JavaScript engines use features of a complier to squeeze out additional performance

### Dynamic Weakly typed

Means that we don't use any explicit type definitions in JavaScript code

**Dart** explicit types example

```dart
// type declaration
String foo = 'Hello World'

int bar = 23

int fun() {
  return bar + baz
}
```

**JS**

```JavaScript
// Notice, no type declaration
let foo = 'Hello World'

const bar = 23;

function fun() {
  return bar + baz
}
```

## Multi-paradigm

Allows us to combine styles from declaritive functional approaches or imperative Object-Oriented approaches

**Prototypal inheritance**

The general idea of this is that everything in JavaScript is an object, and each object holds a link to it's prototype
This creates a prototype chain where object can inheritance behaviors from other objects

```JavaScript
const Dog = { bark: true }

const Pug = Object.create(Dog)

Pug.barks //> true
```

We now know that JavaScript is a:

- High-level
- Dynamic
- Muli-Paradigm
- Prototype-Based

**Language**

But its also a:

- Single-threaded
- Garbage-Collected
- Non-blocking
- With Event loop that can be
	- JIT

These implementation details are up to the browsers:
Two of the most popular ones are Spider Monkey and V8 they both use JIT

Since JavaScript is single-threaded it can only do one computation at a time

```JavaScript
while(true){}
// this will cause everythign in your browser to not work due to the single threadedness
```

When executing JavaScript Code two regions of memory are allocated on the machine
**Stack** & **Heap**

| Stack   | Heap    |
|--------------- | --------------- |
| Designed to be a high performance continous region of memory to execute functions   | Mostly unstructured memory pool where we store things like objects or purnate values inside of closers   |
| When you call a function it creates a frame in the call stack that contains a copy of its location variables, if you call a function within a function it will add another frame to the stack but if you return from a function it will pop that frame off the stack   | The special thing about the heap is **Garbage Collection**. Means that V8 or the JS runtime will try to clear up free memory when its no longer referenced in your code. |


## Event loop

We already saw how a simple while loop can crash a site, so how do we process long running events. The answer is the event loop

```JavaScript
// while loop that waits for messages from a queue
while (queue.waitForMessage()) {
	// processes their synchronis instructions to completion
	queue.processNextMessage();
}
```

What makes JavaScript Non-blocking is the only thing it ever does is listen for events and handle callbacks. So its never actually waiting for the return value of a function

```JavaScript
// the event loop won't get to this until its done running its first iteration of synchronis code
setTimeout(() => console.log('do this first?'), 0)

Promise.resolve()
	.then(v => console.log('do this second?'))

console.log('let their be JavaScript')
```

What makes this so special is you can offload long running jobs to completly seperate thread pools.

### For each round of the event loop:

1. Run sync code
2. Run Promise or mircrotask callbacks
3. Run async task callbacks

---
