# Problem, quotes & QA

Keeping your Objects in the Know
You don't want to miss out when something interesting happens, do you?

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its
dependents are notified and updated automatically.

## Sharpen your pencil

Programming to interface, not implementation
I'm putting you on my list. Don't call me, I'll call you.

## Publishers + Subscribers = Observer Pattern

**What does this have to do with one-to-many relationships?**

With observer pattern, the subject is the object that contains the state and controls it. So, there is ONE subject with
state. The observers, on the other hand, use the state, even if they don't own it. There are many observers, and they rely
on the subject to tell them when its state changes. So there is a relationship between ONE Subject to MANY Observers.

**How does dependence come into this?**
Because the subject is the sole owner of that data, the observers are dependent on the subject to update them when the data
changes. This leads to a cleaner OO design than allowing many objects to control the same data.

**I've also heard of a Publish-Subscribe Pattern. Is that just another name for the Observer Pattern?**
No, although they are related.

**Tightly coupled, loosely coupled**

- We say an object is tightly coupled to another object when it is too dependent on that object.
- All objects depend on other objects. But a loosely coupled object doesn't know or care too much about the details of another
object.

## The Power of Loose Coupling

When two objects are loosely coupled, the can interact, but they typically have very little knowledge of each other.

In Observer Pattern:
- First, the only subject knows about an observer is that it implements a certain interface (the Observer interface).
- We can add new observer at any time.
- We never need to modify the subject to add new types of observers. All we have to do is implement the Observer interface
in the new class and register as an observer.
- Changes to either the subject or an observer will not affect the other.