# Speaking Mathematically: Variables

**Goal:** To be able to use and understand language that expresses mathematical ideas clearly, precisely, and unambiguously.

Table of Contents:

1. [Introduction](#introduction)
2. [Examples](#examples)
   - [Example 1: Solving an equation with a variable](#example-1)
   - [Example 2: Using a variable to express a mathematical statement](#example-2)
3. [Important Kinds of Mathematical Statements](#important-kinds-of-mathematical-statements)
   - [Universal Statements](#universal-statements)
   - [Conditional Statements](#conditional-statements)
   - [Existential Statements](#existential-statements)
   - [Universal Conditional Statements](#universal-conditional-statements)
   - [Universal Existential Statements](#universal-existential-statements)
   - [Existential Universal Statements](#existential-universal-statements)
4. [Lesson 1.2](#the-language-of-sets-1.2)

## Introduction

In mathematics, variables are similar to those used in computer programming. They can be used as placeholders when discussing something, and they may have one or more values, but the specific value is unknown. Variables are also used when we do not want to be restricted to considering only a particular concrete value.

## Examples

### Example 1: Solving an equation with a variable

Is there a number x with the property that `x**3 - 9 = 6x`?

By using a variable as a placeholder, we can perform algebra to discover possible values of x.

### Example 2: Using a variable to express a mathematical statement

Given any real number, its square is non-negative. We can express this statement by replacing "it" with "x":

- Given any real number x, `x**2` is non-negative (or `x**2 >= 0`)
- For all real numbers x, `x**2 >= 0`

## Important Kinds of Mathematical Statements

### Universal Statements

A universal statement says that a certain property is true for all elements in a set.

Example: For all real numbers x, `x**2 >= 0`

Signal words/keywords: All, every, any, for all, for every...

### Conditional Statements

A conditional statement says that if one thing is true then some other thing has to also be true.

Example: If we take notes, do the homework, and study, then we will do well in the class.

Signal words: If then

### Existential Statements

Given a property that **_may or may not_** be true, an **_existential statement_** says that there is **_at least one_** thing for which the property is **_true_**.

Signal: There exist(s), there are/is, some, at least one

###### We can Combine these types of statements + express them in a variety of ways

### Universal Conditional Statements

These statement are both Universal (for all) + Conditional (if-then).

- May be written to only appear universal or conditional -> need to recognize as **_both_**

#### Example: Fill in the Blanks with words and variables

**_Statement_**: The cube root of any negative real number is negative.

(A.) Given any neg. real # S, the cube root of \_\_\_.

- Given any neg. real # S, the cube root of **_S is negative_**. (Looks Universal)

(B.) For any real # S, if S is \_\_\_, then \_\_\_.

- For any real # S, if S is **_negative_**, then `s ** (1/3) is negative`. (Looks Universal Conditional)

(C.) If a real # S \_\_\_, then \_\_\_.

- If a real # S **_is negative_**, then `S ** (1/3) < 0`.

### Universal Existential Statements

These Statements are **_Universal and Existential_**

- Make sure the First Part:
  - Universal
- Make sure the Second Part:
  - Existential

### Examples:

**_Statement_**: Every pot has a lid (informal)

(A.) All Pots \_\_\_ (informal, no variable)

- All Pots **_have lids_**

(B.) For all pots p, there is \_\_\_ (formal, there is a variable)

- For all pots p, there is **_A lid_**

(C.) For all pots P, there is a lid L, such that \_\_\_

- For all pots P, there is a lid L, such that **_L is a lid for P_** (Most Precise and Formal)

### Existential Universal

First Part: Existential

Second Part: Universal

#### Example:

**Statement** There is a real # whose product with every real # equals 0

(A.) Some \_\_\_ has the property, that its \_\_\_

- Some **_Real Number_** has the property, that its **_Product with every real # equals zero_**

(B.) There is a real # "a" such that the product product of "a" \_\_\_

- There is a real # "a" such that the product product of "a" **_with every real number equals zero_**

(C.) There is a real # "a" with the property that for every real # b, \_\_\_

- There is a real # "a" with the property that for every real # b, `ab = 0`
  (Most Formal)

---

# The Language of Sets 1.2

A set can be intuitively thought of as a **_collection of elements_**

**_Notation_**: If S is a set, then the notation **_X$\epsilon$S_** means that X is an element of S

The notation **_X$\not\epsilon$S_** means that x is not an element of S

- To specific a set, you many write all of its elements, separated with commas between curly brackets (set roster notation)

### Example:

`{3, 5, 7}` denotes the set whose elements are 3, 5, and 7

### Set Ex 2:

`{1, 2, 3, ..., 100}` refers to the set of all integers from 1 through 100. `...` is read **_and so forth_**

### Set Ex 3 (infinite set)

`{1, 2, 3, ...}` is an infinite set -> refers to the set of **\*all** positive integers

- The **_order_** in which the elements are listed in a set does **_not_** matter + repeats do **_not_** matter (through repeats should be eliminated)

```lua
A = {4, 9, 13}
B = {4, 9, 13}
C = {1, 1, 1, 4, 9}

-- These sets have exactly the same three elements,
-- They are different ways to represent the same set
```

**_Note_**: {0} != 0 (different objects)

- Ex: {5, {5}} has two elements
  - 5 + {5} (the number five and a set containing the number 5)

## Special Sets

$\mathbb{R}$: is the set of all real numbers

$\mathbb{Z}$: is the set of all numbers

$\mathbb{Q}$: is the set of all rational numbers (quotients of integers)

- May use a superscript + or - or the letters "nonneg" or "nonpos" to include only the positive, negative, non-negative, or non-positive elements of a set

$\mathbb{R-}$: is the set of all **_negative_** real numbers

$\mathbb{R}^{\geq 0}$: is the set of all non-negative integers

```lua
Z = {0, 1, 2, 3, ...}

-- infinite set
```

$$
\begin{center}
\begin{tikzpicture}
\draw [-latex] (-1,0) -- (3,0);
\foreach \x in {-3,-2,-1,0,1,2,3}
\draw (\x,.1) -- (\x,-.1) node[below] {\x};
\end{tikzpicture}
\end{center}
$$
