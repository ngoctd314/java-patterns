# Problems, quotes & QA

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

9. Pattern aren't invented they are discovered.

10. Encapsulate what varies

## Design pattern vs lib, framework

Q: If design patterns are so great, why can't someone build a library of them so I don't have to
A: Design patterns are higher level than libraries. Design patterns tell us how to structure classes and objects to solve certain problems, and it is our job to adapt those designs to fit out particular application

Q: Aren't libraries and frameworks also design patterns?
A: Frameworks and libraries are not design patterns; the provide specific implementations that we link into our code. 


## Disadvantages of using subclassing to provide specific Duck behavior?

- Code is duplicated across subclasses
- Runtime behavior changes are difficult
- It's hard to gain knowledge of all duck behaviors
- Changes can unintentionally affect other ducks.

## What are some factors that drive change in your application? You might have a very different list, but here's few of ours. Look familar? Here's our solution.

- My customers or users decide they want something else, or they want new functionalit;y.
- My company decided it is going with another database vendor and it is also purchasing its data from another supplier that uses a different data format.
- Technology changes and we've got to update our code to make use of protocols.