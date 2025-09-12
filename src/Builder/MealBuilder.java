package Builder;

public class MealBuilder {
    public Meal prepareNonVegMeal(){
        Meal meal =new Meal();
        meal.addItem(new ChickenBurger());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println(nonVegMeal.getCost());
    }
}
