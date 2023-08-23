# [Java September](https://www.tylermaxwell.co/java_september23)


## Stack Orientation

## Java Fundamentals

### Setup

- [JDK installation](https://login.codingdojo.com/m/315/9298/62827)
  - objectives:
    - install JDK
    - be ready to start coding
  - **JDK**: Java Development Kit
    - used to compile `.java` files to `.class` files that contain **bytecode**

  - using [Amazon Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
  - [sdkman](https://sdkman.io/)

```bash
java -version
openjdk version "17.0.5" 2022-10-18 LTS
OpenJDK Runtime Environment Corretto-17.0.5.8.1 (build 17.0.5+8-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.5.8.1 (build 17.0.5+8-LTS, mixed mode, sharing)

```



- [Java versioning](https://login.codingdojo.com/m/315/9298/70859)

### Fundamentals (Day 1)

- [Why Java?](https://login.codingdojo.com/m/315/9299/62830)

    #### objectives
    - identify the advantages of Java

    #### strong/weak and static/dynamic typing
    - **strong typing** -  you cannot convert variable types on the fly
    - **weak typing** - a variable's type can be changed to another type on the fly
    - **static typing** - assign a type to declared variables at compile time and set aside the right amount of memory for that variable.
    - **dynamic typing** - assign types only when the variable declaration code runs during execution and change the memory allocated for the variable as needed.

    #### compiled/interpreted
    >a compiled language goes through analysis and optimization before it is run. The compiler can find repetitive code that you failed to optimize and do this for us, resulting in a faster program than we might otherwise have. The process of "compiling" your code will result in "bytecode" files that you can then execute using the JRE.

    > Interpreted languages are read and executed line by line.

    #### object oriented


- [How does Java Work?](https://login.codingdojo.com/m/315/9299/62831)

    #### objectives
    - Understand how and why Java source code is compiled and run
    - Understand the difference between compiled and interpreted languages
    - Gain a high-level understanding of the Java Development Kit(JDK)
    - Be able to explain what the Java Virtual Machine(JVM) does

    #### Source Code vs. Machine Code
    - **machine code** - written as a sequence of 1s and 0s i.e. **binary**
    - **run time** - instructions are executed by a computer
    - **interpreted** - read and executed line by line. 
      - interpreter translation real time
    - **compiled** - translated all at once before the code is executed, at compile time, and produce a build of the entire code before executing it at runtime.
      - translation of a book

    #### A Brief Overview of the JDK
    - **platform independent** - compiled versions of the [Java] code can be executed directly by different operating systems like MacOS and Windows, even though they have different machine codes.
    - **source code** - what we think of as our "code". written in plain text files with a `.java` extension
    - **byte code** - intermediate code, NOT MACHINE CODE!! that is produced by the Java compiler. Running the following: 

```bash
$ java Main.java
```
    produces *byte code* which is a file with the `.class` extension. This *byte code* can be run on any platform. How?!
  - **Java Virtual Machine(JVM)** the Java compiler that is not *platform independent*! Mac, Windows, and Linux all have different JVMs that can compile the *byte code* for their environment. 

- [Hello World](https://login.codingdojo.com/m/315/9299/62832)

  #### Hello, World!
  - [HelloWorld.java](./demos/fundamentals/helloworld/HelloWorld.java)

```java
// HelloWorld.java
public class HelloWorld {   
}
```
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

  - now we have to compile:

```bash
$ javac HelloWorld.java
```

  - this produces the `HelloWorld.class` bytecode file
  - this is the file we run, it's runtime!!

```bash
$ java HelloWorld
```
  - >Mantra for today: Whenever you run a file, you gotta compile!



- [Variables](https://login.codingdojo.com/m/315/9299/62836)

  #### objectives
  - Introduction to data types
  - Introduction to primitive versus object(reference) types

  **variables** - a piece of memory to which we can assign data to make it easy to reuse. Tools to make our code understandable

  #### Type Declaration

  **type declaration** - every variable must have one!
  - we can catch mistakes at compile time as opposed to run time.
  - this is a variable declaration:

```java
Type variableName;
```
  - this is variable initialization:

```java
variableName = new Type();
```
  - we can do both in one line:

```java
Type variableName = new Type();
```

 - otherwise we get *default values*

  #### naming conventions:
  - no reserved words
  - contains letters, numbers or under_scores
  - camel case by convention
  - cannot begin with a number
  - no white space
  - make variable names descriptive

  #### [javafun/Variables.java](./demos/javafun/Variables.java)
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


- [Conditionals & Operators](https://login.codingdojo.com/m/315/9299/62838)
- [Switch Statements & Ternary Operators](https://login.codingdojo.com/m/315/9299/95997)
- [Strings](https://login.codingdojo.com/m/315/9299/62840)
- [Methods](https://login.codingdojo.com/m/315/9299/62845)
- [Modularization](https://login.codingdojo.com/m/315/9299/62841)
- [Type Casting](https://login.codingdojo.com/m/315/9299/62844)
- [Fixed Arrays](https://login.codingdojo.com/m/315/9299/62847)
- [ArrayLists(Dynamic Arrays)](https://login.codingdojo.com/m/315/9299/70864)
- [Loops](https://login.codingdojo.com/m/315/9299/62848)
- [Debugging in Java](https://login.codingdojo.com/m/315/9299/120722)
- [Maps](https://login.codingdojo.com/m/315/9299/62852)
- [Exceptions](https://login.codingdojo.com/m/315/9299/62854)

#### assignments(core)

- [Cafe Business Logic](https://login.codingdojo.com/m/315/9299/62850)

#### assignments(practice)

- [First Java Program](https://login.codingdojo.com/m/315/9299/62834)
- [Cafe Java](https://login.codingdojo.com/m/315/9299/62839)
- [Alfred Bot](https://login.codingdojo.com/m/315/9299/62843)
- [Puzzling](https://login.codingdojo.com/m/315/9299/62851)
- [Map of the Hashmatique](https://login.codingdojo.com/m/315/9299/62853)

## Java OOP

### Java OOP (Day 2)

- [Objects and Classes](https://login.codingdojo.com/m/315/9380/63306)
- [Member Variables](https://login.codingdojo.com/m/315/9380/63308)
- [Getters, Setters & Access Modifiers](https://login.codingdojo.com/m/315/9380/64177)
- [Constructors and Overloading](https://login.codingdojo.com/m/315/9380/63309)
- [`this`](https://login.codingdojo.com/m/315/9380/63310)
- [More on Methods](https://login.codingdojo.com/m/315/9380/63307)
- [static](https://login.codingdojo.com/m/315/9380/63318)


#### assignments(core)

- [BankAccount](https://login.codingdojo.com/m/315/9380/64118)

#### assignments(practice)

- [Orders and Items](https://login.codingdojo.com/m/315/9380/63311)
- [Barista's Challenge](https://login.codingdojo.com/m/315/9380/64109)
- [Coffeedore 64](https://login.codingdojo.com/m/315/9380/64446)


### Java OOP Advanced

- [Spring Tool Suite(STS)](https://login.codingdojo.com/m/315/9381/65677)
- [Packages](https://login.codingdojo.com/m/315/9381/65678)
- [Four Pillars of OOP](https://login.codingdojo.com/m/315/9381/70889)
- [Inheritance](https://login.codingdojo.com/m/315/9381/64444)
- [Interface](https://login.codingdojo.com/m/315/9381/63326)
- [Interface Implementation](https://login.codingdojo.com/m/315/9381/67125)
- [Annotations](https://login.codingdojo.com/m/315/9381/63331)
- [Abstract](https://login.codingdojo.com/m/315/9381/63327)
- [Abstract vs. Interfaces](https://login.codingdojo.com/m/315/9381/63328)
- [POJO and Java Beans](https://login.codingdojo.com/m/315/9381/63332)

#### assignments(core)

- [Zookeeper](https://login.codingdojo.com/m/315/9381/64445)
- [CareSoft Interfaces](https://login.codingdojo.com/m/315/9381/65739)

#### assignments(practice)

- [Devices](https://login.codingdojo.com/m/315/9381/64443)

### Data Structures

## Java Spring

### Spring Intro

- [Overview](https://login.codingdojo.com/m/315/9532/64265)
- [Mac Installation]()
- [Windows Installation]()
- [Start a New Spring Boot Project](https://login.codingdojo.com/m/315/9532/64268)
- [Hello World](https://login.codingdojo.com/m/315/9532/64269)
- [`@RestController` and Annotations](https://login.codingdojo.com/m/315/9532/64271)
- [Routing](https://login.codingdojo.com/m/315/9532/64272)
- [Query Parameters](https://login.codingdojo.com/m/315/9532/64273)
- [URLs & `@PathVariable`](https://login.codingdojo.com/m/315/9532/64552)
- [Java Server Pages(JSP)](https://login.codingdojo.com/m/315/9532/64276)
- [JSTL Tags](https://login.codingdojo.com/m/315/9532/64553)
- [Rendering with `@Controller`](https://login.codingdojo.com/m/315/9532/64278)
- [More on Rendering Data](https://login.codingdojo.com/m/315/9532/64279)
- [Adding Static Content(CSS & JS)](https://login.codingdojo.com/m/315/9532/64280)
- [Bootstrap](https://login.codingdojo.com/m/315/9532/64281)
- [JSTL Loops and You](https://login.codingdojo.com/m/315/9532/64288)
- [Conditional JSTL Tags](https://login.codingdojo.com/m/315/9532/115852)
- [Session](https://login.codingdojo.com/m/315/9532/64283)
- [Session in Java](https://login.codingdojo.com/m/315/9532/65005)
- [Form Submission](https://login.codingdojo.com/m/315/9532/64285)
- [GET vs. POST](https://login.codingdojo.com/m/315/9532/65228)
- [POST and Redirecting](https://login.codingdojo.com/m/315/9532/65235)
- [Flash Data](https://login.codingdojo.com/m/315/9532/65017)
- [Dependency Injection](https://login.codingdojo.com/m/315/9532/64290)

#### assignments(core)

- [Daikichi Path Variables](https://login.codingdojo.com/m/315/9532/64274)
- [Fruity Loops](https://login.codingdojo.com/m/315/9532/64826)
- [Omikuji Form](https://login.codingdojo.com/m/315/9532/64287)

#### assignments(practice)

- [Daikichi Routes](https://login.codingdojo.com/m/315/9532/64576)
- [Hello Human](https://login.codingdojo.com/m/315/9532/64275)
- [Hopper's Receipt](https://login.codingdojo.com/m/315/9532/64747)
- [Counter](https://login.codingdojo.com/m/315/9532/64284)
- [Ninja Gold Game](https://login.codingdojo.com/m/315/9532/64289)

### Spring MVC

- [MySql Server Installation Mac]()
- [MySql Server Installation Windows]()
- [MVC Design Pattern](https://login.codingdojo.com/m/315/9533/109115)
- [MVC Layers in Spring](https://login.codingdojo.com/m/315/9533/64296)
- [JPA](https://login.codingdojo.com/m/315/9533/64297)
- [Connecting to MySQL](https://login.codingdojo.com/m/315/9533/64298)
- [Domain Model and Validation Annotations](https://login.codingdojo.com/m/315/9533/64299)
- [Repositories](https://login.codingdojo.com/m/315/9533/64300)
- [Services](https://login.codingdojo.com/m/315/9533/64301)
- [`@NotNull`](https://login.codingdojo.com/m/315/9533/115812)
- [Adding Views - Goodbye API](https://login.codingdojo.com/m/315/9533/65957)
- [Adding a Create Form](https://login.codingdojo.com/m/315/9533/65957)
- [`@ModelAttribute` & Data Binding](https://login.codingdojo.com/m/315/9533/81390)
- [Edit and Update](https://login.codingdojo.com/m/315/9533/64306)
- [Delete](https://login.codingdojo.com/m/315/9533/64307)
- [Appendix](https://login.codingdojo.com/m/315/9533/64310)

#### assignments(core)

-[Save Travels](https://login.codingdojo.com/m/315/9533/65999)

#### asssignments(practice)

-[Books API]()
-[Rendering Books](https://login.codingdojo.com/m/315/9533/64305)
-[All Books](https://login.codingdojo.com/m/315/9533/65956)
-[Burger Tracker 1](https://login.codingdojo.com/m/315/9533/65990)
-[Burger Tracker 2](https://login.codingdojo.com/m/315/9533/65992)

### Adding One-toMany

- [Relationships](https://login.codingdojo.com/m/315/9534/64312)
- []()
- [One to Many](https://login.codingdojo.com/m/315/9534/64315)
- [Potential Data Binding Issues](https://login.codingdojo.com/m/315/9534/101373)
- [Full MVC Review](https://login.codingdojo.com/m/315/9534/64323)

#### assignments(core)

- [Dojos and Ninjas](https://login.codingdojo.com/m/315/9534/64316)

#### assignments(practice)

- NONE

### Full Spring

- [Project Setup](https://login.codingdojo.com/m/315/9537/64343)
- [User and LoginUser](https://login.codingdojo.com/m/315/9537/64344)
- [Login Page: Controller and View](https://login.codingdojo.com/m/315/9537/64346)
- [Password Security](https://login.codingdojo.com/m/315/9537/65364)
- [Repository and Service](https://login.codingdojo.com/m/315/9537/64345)
- [Authentication & Validation Logic](https://login.codingdojo.com/m/315/9537/81391)
- [Multiple One-to-Many](https://login.codingdojo.com/m/315/9537/97382)
- [Many-to-Many](https://login.codingdojo.com/m/315/9537/65321)
- [Creating Many-to-Many Relationships](https://login.codingdojo.com/m/315/9537/65324)
- [CascadeType](https://login.codingdojo.com/m/315/9537/106399)
- [Belt Exam Rubric](https://login.codingdojo.com/m/315/9537/81392)

#### assignments(core)

- [Login & Registration](https://login.codingdojo.com/m/315/9537/65370)
- [Book Club](https://login.codingdojo.com/m/315/9537/65319)

### Spring Security
### Advanced Queries
### Spring Extras (Optional)







