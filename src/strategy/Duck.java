package strategy;

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
