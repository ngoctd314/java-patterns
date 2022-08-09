package strategy;

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
