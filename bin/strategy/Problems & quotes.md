# Problems, quotes

**The Strategy Patterns defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independent from clients that use it.**

1. A localized update to the code caused a non-local side effect
2. A great use of inheritance for the purpose of reuse hasn't turned out so well when it comes to maintenance.
3. No matter how well you design an application, over time an application must grow and change or it will die.
4. Identify the aspects of your application that vary and separate them from what stays the same. Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.
5. Program to an interface, not an implementation ( the declared type of the variable should be a supertype )
6. A Duck will now delegate its flying and quacking behaviors, instead of using quacking and flying methods defined in the Duck class (or subclass).
7. HAS-A can be better that IS-A (Favor composition over inheritance)
The HAS-A relationship is an interesting one: each duck has a FlyBehavior and a QuackBehavior to which it  delegates flying and quacking.

8. Guru: is more time spent on code before or after development is complete?
Student: The answer is after, Guru. We always spend more time maintaining and chaning software than on initial development.