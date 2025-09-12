package Decorator;

public class SimplePizza extends Pizza {
    public SimplePizza() {
        description = "Simple Pizza";
    }

    @Override
    public int getCost() {
        return 0;
    }
}
