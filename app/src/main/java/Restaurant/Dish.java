package Restaurant;

import java.util.Objects;

public class Dish {
    private int dishId;
    private String dishName;
    private String potType;

    public Dish() {
    }

    public Dish(int dishId, String dishName, String potType) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.potType = potType;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getPotType() {
        return potType;
    }

    public void setPotType(String potType) {
        this.potType = potType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return dishId == dish.dishId && Objects.equals(dishName, dish.dishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishId, dishName);
    }
}
