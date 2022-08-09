# Strategy pattern

## Naive version

We create abstract class Duck

```java
public abstract class Duck {
    public String quack() {
        return "duck can quack";
    };

    public String swim() {
        return "duck can swim";
    };

    /**
     * The display() method is abstaact
     * since all duck subtypes look different
     * 
     * @return
     */
    abstract void display();
}
```

MallardDuck and RedheadDuck extend Duck

```java
public class MallardDuck extends Duck {

    @Override
    void display() {
        System.out.println("mallard duck");
    }
}

public class RedheadDuck extends Duck {

    @Override
    void display() {
        System.out.println("redhead Duck");
    }
}
```

## Change: now we need the ducks to FLY

Add fly() method in the Duck class and then all the ducks will inherit it

```java
public abstract class Duck {
    public String quack() {
        return "duck can quack";
    };

    public String swim() {
        return "duck can swim";
    };

    /**
     * The display() method is abstaact
     * since all duck subtypes look different
     * 
     * @return
     */
    abstract void display();

    abstract void fly();
}

public class MallardDuck extends Duck {

    @Override
    void display() {
        System.out.println("mallard duck");
    }

    @Override
    void fly() {
        System.out.println("can fly");
    }
}

public class RedheadDuck extends Duck {

    @Override
    void display() {
        System.out.println("redhead Duck");
    }

    @Override
    void fly() {
        System.out.println("can't fly");
    }
}
```

**Problems**
- all subclasses of Duck should fly. When we added new behavior to the Duck superclass, we were also adding behavior that was not appropriate for some Duck subclasses.

****