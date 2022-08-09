package strategy;

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
