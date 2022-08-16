package strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    void display() {
        this.performFly();
        this.performQuack();
    }

}
