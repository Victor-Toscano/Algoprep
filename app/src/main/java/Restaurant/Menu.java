package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Dish> dishes;

    private void generateDishes() {
        dishes = new ArrayList<>();
        dishes.add(new Dish(1, "Eggs", Pot.SMALL_POT));
        dishes.add(new Dish(2, "Salad", Pot.MEDIUM_POT));
        dishes.add(new Dish(3, "Chicken", Pot.BIG_POT));
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
