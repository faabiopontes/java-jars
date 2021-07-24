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