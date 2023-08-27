## Fundamentals (Day 1)
---

### [Why Java?](https://login.codingdojo.com/m/315/9299/62830)

note:
#### objectives
- identify the advantages of Java

--
#### strong/weak and static/dynamic typing
--  
strong typing  
- you cannot convert variable types on the fly
--
weak typing
- a variable's type can be changed to another type on the fly
--
static typing 
- assign a type to declared variables at compile time and set aside the right amount of memory for that variable.
--   
dynamic typing 
- assign types only when the variable declaration code runs during execution and change the memory allocated for the variable as needed.

--
[strong vs static](https://stackoverflow.com/questions/2690544/what-is-the-difference-between-a-strongly-typed-language-and-a-statically-typed)

--
#### compiled/interpreted
--
>a compiled language goes through analysis and optimization before it is run. The compiler can find repetitive code that you failed to optimize and do this for us, resulting in a faster program than we might otherwise have. The process of "compiling" your code will result in "bytecode" files that you can then execute using the JRE.

> Interpreted languages are read and executed line by line.
--
#### object oriented

---
### [How does Java Work?](https://login.codingdojo.com/m/315/9299/62831)

note:
#### objectives
- Understand how and why Java source code is compiled and run
- Understand the difference between compiled and interpreted languages
- Gain a high-level understanding of the Java Development Kit(JDK)
- Be able to explain what the Java Virtual Machine(JVM) does

--
#### Source Code vs. Machine Code
--
machine code
- written as a sequence of 1s and 0s (i.e. **binary**)
- different for every platform (i.e. Mac, Windows, Linux)
--
run time 
- when instructions are executed by a computer
--
interpreted  
- read and executed line by line. 
- like an interpreter translating real time
--
compiled 
- translated all at once before the code is executed, at compile time, and produce a build of the entire code before executing it at run time.
- like the translation of a book
--
#### A Brief Overview of the JDK

notes:
**platform independent**  
- compiled versions of the [Java] code can be executed directly by different operating systems like MacOS and Windows, even though they have different machine codes.
--
**source code** 
: what we think of as our "code". written in plain text files with a `.java` extension
--
**byte code**
: intermediate code, NOT MACHINE CODE!! that is produced by the Java compiler. 

--
Running the following: 
--
```bash
$ java Main.java
```
--
produces *byte code* which is a file with the `.class` extension. This *byte code* can be run on any platform. How?!
--
**Java Virtual Machine(JVM)** 
: the Java compiler that is not *platform independent*! 
: Mac, Windows, and Linux all have different JVMs that can compile the *byte code* for their environment. 

---
### [Hello World](https://login.codingdojo.com/m/315/9299/62832)
--
#### Hello, World!
[HelloWorld.java](https://github.com/tmax818/java_september23/tree/main/demos/fundamentals/helloworld)
--
```java
// HelloWorld.java
public class HelloWorld {   
}
```
--
  - class name MUST match the file name.
  - every Java program has to have an entry point:

```java
// code that is not in this method WILL NOT RUN!!
public static void main(String[] args) {        
    }
```

  - How do you `print` or `console.log` in Java?

```java
System.out.println("Hello, World!");
```

  - Hello, world in Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
--
  - now we have to compile:
--
```bash
$ javac HelloWorld.java
```
--
  - this produces the `HelloWorld.class` bytecode file
  - this is the file we run, it's runtime!!
--
```bash
$ java HelloWorld
```
--
  - >Mantra for today: Whenever you run a file, you gotta compile!


---
### [Variables](https://login.codingdojo.com/m/315/9299/62836)
note:
#### objectives
- Introduction to data types
- Introduction to primitive versus object(reference) types

variables
: a piece of memory to which we can assign data to make it easy to reuse. Tools to make our code understandable
--
#### Type Declaration

type declaration
: every variable must have one!
: we can catch mistakes at compile time as opposed to run time.
--
this is a variable declaration:
--
```java
Type variableName;
```
this is variable initialization:
--
```java
variableName = new Type();
```
--
we can do both in one line:
--
```java
Type variableName = new Type();
```
--
otherwise we get *default values*
--

#### naming conventions:
- no reserved words
- contains letters, numbers or under_scores
- camel case by convention
- cannot begin with a number
- no white space
- make variable names descriptive

---
#### [javafun/Variables.java](./demos/fundamentals/javafun/Variables.java)
- IF YOU SEE CODE WHILE YOU ARE READING, RUN IT!!!!

|Format Specifier|Conversion Applied|
|---|---|
%% |	Inserts a % sign
%x %X |	Integer hexadecimal
%t %T	| Time and Date
%s %S	| String
%n	| Inserts a newline character
%o	| Octal integer
%f	| Decimal floating-point
%e %E	| Scientific notation
%g	| Causes Formatter to use either %f or %e, whichever is shorter
%h %H	| Hash code of the argument
%d	| Decimal integer
%c	| Character
%b %B	| Boolean
%a %A	| Floating-point hexadecimal


### [Conditionals & Operators](https://login.codingdojo.com/m/315/9299/62838)

#### objectives
- learn control flow in Java

- [Conditionals.java](./demos/fundamentals/controlFlow/Conditionals.java)

#### if statements

```java
if(true){
  
}
```

### [Switch Statements & Ternary Operators](https://login.codingdojo.com/m/315/9299/95997)


### [Strings](https://login.codingdojo.com/m/315/9299/62840)

  #### objectives
  - learn the `String` class in Java
  - practice the most popular String methods

  #### methods of the String class
  - [Strings.java](./demos/fundamentals/strings/Strings.java)

  #### When to use `==` and when to use `.equals()`


### [Methods](https://login.codingdojo.com/m/315/9299/62845)

#### objectives
- Be able to declare and define methods in Java
- Understand method signatures
- Introduce overloading methods (using the same method name for different purposes)

#### methods vs. functions

method 
: what we call a function in Java and in Object Oriented Programming generally
: a function that belongs to a class

#### Java method declaration

```java
public String functionName(){
return "This is what is returned. It has to correspond to the 'return type' in the method signature.";
}
```

#### method signatures:

  
method signature
: the name of the method and the parameter types

```java
public static void main(String[] args){

}
```

the method signature of the `main` method would be:

```java
main(String[])
```
 
#### method overloading

method overloading
: we give two or more methods the same name, but they do different things.
: overloaded methods must have different signatures.

[Calculator.java](./demos/fundamentals/methods/Calculator.java)

### [Modularization](https://login.codingdojo.com/m/315/9299/62841)

#### Objectives:
- Understand why and how to modularize your code
- Import different java classes into your project
- Use a test file to call methods from different classes

#### the main method

#### importing

[DateExample.java](./demos/fundamentals/modularization/DateExample.java)

#### dependency injection

Dependency injection 
: a way to use external code from another file.
: create variable that will have access to all of another class's methods
: the variable is an object instance

[DependencyInjection](./demos/fundamentals/dependencyInjection/README.md)


### [Type Casting](https://login.codingdojo.com/m/315/9299/62844)

#### Objective:
- Introduction to casting (how to change types in Java)
- Learn when to use primitive types versus object types

#### explicit

explicit casting
: declare the type that we want to convert to in our source code

[Main.java](./demos/fundamentals/typeCasting/Main.java)

#### implicit

implicit casting
: Java will allow implicit conversions as long as the target type has a range large enough for the conversion.

---
### [Fixed Arrays](https://login.codingdojo.com/m/315/9299/62847)
note:
#### Objectives:
- Arrays in java
- Introduction to ArrayList

#### fixed arrays

- array declaration:

```java
int ARRAY_SIZE = 10;
Type[] arrayName = new Type[ARRAY_SIZE];
```

[FixedArrays.java](./demos/fundamentals/fixedarrays/FixedArrays.java)

---
### [ArrayLists(Dynamic Arrays)](https://login.codingdojo.com/m/315/9299/70864)
note: 
#### Objectives:
- Introduce ArrayLists in Java and how to use them
- Introduce Generics
- Start reading Java documentation

#### The `ArrayList` Type (Dynamic Arrays)
- `ArrayList` is not fixed in size


#### Generics `<T>`
- declare the acceptable types an ArrayList can hold
- Generics help to keep our compiler, and us, from making mistakes that would bite us during runtime.
[GenericExample.java](./demos/fundamentals/generics/GenericExample.java)

#### `<Object>` only
- have to use wrapper classes

#### manipulating `ArrayList`s 

[DynamicArrays.java](./demos/fundamentals/dynamicarrays/DynamicArrays.java)


### [Loops](https://login.codingdojo.com/m/315/9299/62848)
note:
#### Objective:
- For loops and while loops in Java

#### `while`

#### `for`

#### enhanced `for`

#### when not to use the enhanced `for`

> If we're modifying the ArrayList that we are looping over, the enhanced for loop may encounter this error.
---
### [Debugging in Java](https://login.codingdojo.com/m/315/9299/120722)

note:
#### Objective:
- Students will use print statements to check and debug their code

[Loops.java](./demos/fundamentals/debugging/Loops.java)

---
### [Maps](https://login.codingdojo.com/m/315/9299/62852)

---
### [Exceptions](https://login.codingdojo.com/m/315/9299/62854)

note:
#### assignments(core)

- [Cafe Business Logic](https://login.codingdojo.com/m/315/9299/62850)
  - [repo](https://github.com/tmax818/CafeBusinessLogic)

#### assignments(practice)

- [First Java Program](https://login.codingdojo.com/m/315/9299/62834)
  - [repo](https://github.com/tmax818/FirstJavaProgram)
- [Cafe Java](https://login.codingdojo.com/m/315/9299/62839)
  - [repo](https://github.com/tmax818/CafeJava)
- [Alfred Bot](https://login.codingdojo.com/m/315/9299/62843)
  - [repo](https://github.com/tmax818/AlfredBot)
- [Puzzling](https://login.codingdojo.com/m/315/9299/62851)
  - [repo](https://github.com/tmax818/Puzzling)
- [Map of the Hashmatique](https://login.codingdojo.com/m/315/9299/62853)
  - [repo](https://github.com/tmax818/MapOfTheHashmatique)

