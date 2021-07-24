# Java Jars

My learnings with [The Complete Java Certification Course](https://www.udemy.com/course/master-practical-java-development)

## How to Install

I'm using Ubuntu, and I recommend everyone to use this link [https://linuxconfig.org/oracle-java-installation-on-ubuntu-20-04-focal-fossa-linux](https://linuxconfig.org/oracle-java-installation-on-ubuntu-20-04-focal-fossa-linux) to install JDK. I almost managed to brick my OS editing `.pam_envinronment` mistakenly following other tutorials (bottom line, don't do it)

## Runtime

- Complex variables point to the memory location of objects on the **Heap**
- The memory is allocated when the program start running
- Classes are the definition. Ex: `public class Something {}`
- Objects are the created instances when we do `new Something()`

## Stack

- The stack in Java is very close to the Call Stack in JavaScript
- Starting with the `main`, the methods are added to stack
- Every other method called is added on top of the pile
- Methods are removed from the top of the pile and two things happen
  1. We go back to the method which called it
  2. The memory allocated for the method is release

## Heap

- Here is where complex object instances are allocated
- The variables from the instance are allocated inside it as well
- A instance with no variables reference to it becomes a candidate for Garbage Collection
- Instances can have object instances as variables of it, like a `Car` has an `Engine`
- In this case the `Engine` instance stays outside of the `Car` instance on the Heap
- Instances/Objects exist when application runs

## Inheritance VS Interfaces

- Extending a class you get everything it has
- Overriding we replace something that was extended from the parent class
- An Interface is basically a contract
- Abstract methods don't have body
- Interfaces only have abstract methods
- Classes which implement interfaces have to implement their methods
- A class can one extend one other class
- A class can implement multiples interfaces
- We can instantiate "sons" using the type of the parent, but then we would only be able to use "parent" methods

```java
  Animal sparrow1 = new Sparrow(1 , 4, "M");
  // Can
  sparrow1.move();

  // Can't
  sparrow1.fly();
```

- We can use instantiate "interfaces" too, but then we would only be able to use "interface" methods

```java
  Flyable flyingBird = new Sparrow(1 , 4, "M");
  // Can't
  flyingBird.move();

  // Can
  flyingBird.fly();
```
- The class nees to have implemented all interface methods for it to happen too
```java
  // Compilation error because Bird doesn't implement method fly
  Flyable flyingBird = new Bird(1, 4, "M");
```

## Abstract Class

- Can only be extended
- Cannot have instances
- Can have variables of all types
- Can use the private access modifiers
- Can have abstract methods and defined methods too
