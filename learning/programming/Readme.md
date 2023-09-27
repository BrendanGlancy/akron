# Program

`Input -> Computation -> Output`

Languages:
`C --> Haskell (Functional Spectrum)`
`C --> Python (Ease of use Spectrum)`

## Garbage Collection

What is a computer:
Processor (stream of instructions)
RAM (Instructions + Data)

Program:
.text = Instructions
stack = local vars (control flow)
heap = malloc
bss = Static data

```c
void a() {
    int variable_on_the_stack;
    // return by popping off the stack
}

void b() {

}

int main() {
    a(); // pushes the return location to the stack

    b(); 
}
```

### Programming for work

What does a software engineer do?
- Don't write algorithms 

Translators:
- "Business Requirements" -> "Code`1"
    - Ruby on Rails = "Web apps"
    - CRUD apps <-- Create, Read, Update, Delete

Ruby
React (Heavy Frameworks)

Frontend (View)
Business Logic (Controller)
Database (Model)

What you will learn in bootcamps
1. Build a CRUD app contracting firm 
2. Record all the inptus of my contract developers
3. Train AI model to translate "Business Logic" -> "Code"

What is hacking?

Input -> System -> Output

`What input to the system achieves my desired outcome?`

`Domain -> Function -> Range`
y = f(x)

Figuring out how to make the function behave how you want

High Brow Software Engineering
---

1. Understand a complex System
2. Modify the system to add a feature
3. Ship the new system (test well and stuff)


