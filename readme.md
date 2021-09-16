# What's in a name?

Where did the name `minefield` come from?  The working name for this project is `My
Experimental Functional Language`, but that doesn't have a nice "ring" to it.  So, I used
the regular expression `.*m.*e.*f.*l.*` on the words file and read over the results.  When
I saw "minefield" I knew I had the name.  After all, writing a compiler is a minefield of
details to keep straight, subtle interactions that can go wrong, and I knew I'd have a
blast writing it.

# Why functional?

There are many innovative ideas in functional languages that I want to learn more about.
Since I learn best by building things, implementing a functional language will help me
learn.  And, it's fun.

# Why Java?

Since functional programming isn't mainstream yet, I decided to use Java to make this
accessible to others.

# What's the plan?

## Long-term

### The language

Buzzword bingo:

* Integers
* Strings
* Booleans
* Sum types
* Union types
* User-defined types
* Functions
* Tail call elimination
* Garbage collection
* Pattern matching
* Type inference

### The run-time

* AST walking interpreter
* A byte code VM
* An x86-64 assembly code generator

## Short term

Inspired by the paper "An Incremental Approach to Compiler Construction" by Abdulaziz
Ghuloum, I'll be building this language by starting with a small piece of the language and
implement everything to get that working.  Then, adding the next piece of functionality.

A rough order of implementation:
* integers, strings, and print
* integer math
* comparisons
* conditional
* identifiers (immutable variables)
* functions
* recursion and tail call elimination
* heap and garbage collection
* closures
* primative types (i.e., integer, string, boolean)
* sum and union types
* user-defined types
* pattern matching
* type inference
* Intermediate representation and optimizations
