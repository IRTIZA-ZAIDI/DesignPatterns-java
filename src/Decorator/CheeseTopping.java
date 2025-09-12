package Decorator;

public class CheeseTopping extends ToppingDecorator{
    private Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese Topping";
    }
}
