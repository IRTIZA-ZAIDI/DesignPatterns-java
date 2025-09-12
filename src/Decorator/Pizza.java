package Decorator;

public abstract class Pizza {
    String description = "Unknown Pizza";
    public abstract int getCost();

    public String getDescription() {
        return description;
    }
}
