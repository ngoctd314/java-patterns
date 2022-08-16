package strategy;

public class Squeck implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeck squeck");
    }

}
