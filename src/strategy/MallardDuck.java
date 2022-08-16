package strategy;

public class MallardDuck extends Duck {
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    void display() {
        this.performQuack();
        this.performFly();
    }

}
