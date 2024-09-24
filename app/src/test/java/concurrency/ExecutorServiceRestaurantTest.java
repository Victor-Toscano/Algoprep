package concurrency;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExecutorServiceRestaurantTest {
    ExecutorServiceRestaurant restaurant;

    @Before
    public void setUp() {
        restaurant = new ExecutorServiceRestaurant();
    }

    @Test
    public void testPrepareFoodSandwich() {
        String output = restaurant.prepareFood(restaurant.getMenu().get(0));
        assertEquals("Sandwich prepared in 2 seconds", output);
    }

    @Test
    public void testPreparePizza() {
        String output = restaurant.prepareFood(restaurant.getMenu().get(1));
        assertEquals("Pizza prepared in 5 seconds", output);
    }

    @Test
    public void testPrepareMultipleFood() {
        String output = restaurant.prepareMultipleFood();
        assertEquals("done", output);
    }
}