# Discrete Math 501 UA

**Goal:** To be able to use and understand language that expresses mathematical ideas clearly, precisely, and unambiguously.

Table of Contents:

1. [Speaking Mathematically: Variables](#speaking-mathematically%3A-variables)
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
   - [Special Sets](#special-sets)
   - [Cartesian Products + Order Pairs](#cartesian-products-%2B-order-pairs)
5. [Lesson 2.1]
6. [Lesson 2.2]
7. [Lesson 2.3]

## Speaking Mathematically: Variables

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

The real # line is called Continuous because it is imagined to have no holes

The set of integers $\mathbb{Z}$ corresponds to a collection of points located at **_fixed_** intervals along the real # line
$\mathbb{Z}$ {..., -3, -2, -1, 0, 1, 2, 3, ...} Thus **_every_** integer is a real #.
Since they are all separated from each other $\mathbb{Z}$ is called discrete

**_Definition_**: If A <S-Del>+ B are sets, the A is called a subset of B, denoted `A <= B`, if + only if every element of A is also an element of B

**\*Symbolically\***: A <= B means that **_for all_** elements x, if x$\mathbb{E}$B.

**_Definition_**: If A + B are sets, then A is called **_not_** a subset of B, denoted A ~~<=~~ B, if + only if **_at least one_** element of A is **_not_** an element of B (note that A+B may still share some elements)

**_Symbolically_**, A ~~<=~~ B means that **\*there is** at least one element x such that x$\mathbb{E}$A and x$\mathbb{\not E}$ A

**_Definition_**: If A+B are sets, then A is called a **_proper subset_** of B, denoted `A<B` if and only if every element A is an element of B and there is at least one element of B that is **_not_** in A

**_Symbolically_**, A<B means that **_for all_** elements x, if x$\mathbb{E}$A then x$\mathbb{E}$B **_and_** there exists at least one element x$\mathbb{E}$B such that x$\mathbb{\not E}$ A

---

**_Be careful_** to distinguish $\mathbb{E}$ + <=

### Example

Is `(a.)+=s 0<={0}` ? NO

Is `(b.){2}<={1, 2, 3}` ? NO (is the set containing 2 a subset of the set containing 123)

Is `(c.){2}` $\mathbb{E}$ `{{1}, {2}, {3}}`? (is the set containing 2 an element of the set containing the set containing 1 and the set containing 2 and the set containing 3) YES

### Example

List all the true **_subset_** containments among:

- `A = {3,5,9}`
- `B = {3}`
- `C = {3,5}`
- `D = {9,5}`

A<=A (A is a subset of itself)
B<=A (B is a subset of A)
C<=A (C is a subset of A)
C<=C (C is a subset of itself)
D<=A (D is a subset of A)
D<=D (D is a subset of itself)

**_important_** for all set S, `S<=S` (all sets are subsets of themselves)
But they are not proper subsets

What is a proper subset?:

- B<=A (B is a proper subset of A for example)

## Cartesian Products + Order Pairs

**_Notation_**: Given elements a + b, the symbol (a,b) denotes the **_ordered pair_** consisting of the elements a + b together with the specification that `a` is the first element of the pair and `b` is the second element of the pair

**_two ordered pairs_** `(a,b)` + `(c,d)` are equal ((a,b)=(c,d)) if and only if a=c and b=d **_order matters_**

**_Definition_** Given sets A + B the **_Cartesian_** product of A + B denoted `AxB` + read "Across B", id the set of the all **_ordered pairs_** where a$\mathbb{E}$A b$\mathbb{E}$B

**_Symbolically_**, AxB = {(a,b) | a$\mathbb{E}$A + b$\mathbb{E}$B}

### Example

**_Let A = {1,3,5} + B = {1,8}A_**

```lua
AxB ={(1,1), (1,8), (3,1), (3,8), (5,1), (5,8)}

BxA ={(1,1), (8,1), (1,3), (8,3), (1,5), (8,5)}

BxB ={(1,1), (1,8), (8,1), (8,8)}
```

Example Problem: AxA

**_If A has m element & B had n elements_** then AxB has mn elements (AxB m=3, n=2 mn=6)

```lua
AxA ={(1,1), (1,3), (1,5), (3,1), (3,3), (3,5), (5,1), (5,3), (5,5)}
```
