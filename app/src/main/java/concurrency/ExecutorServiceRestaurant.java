package concurrency;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceRestaurant {

    ExecutorService chefsTeam;

    public final List<MenuItem> menu = Arrays.asList(
            new MenuItem("Sandwich", new BigDecimal("3.99"), 2),
            new MenuItem("Pizza", new BigDecimal("6.99"), 5)
    );

    public ExecutorServiceRestaurant() {
        try {
            chefsTeam = Executors.newFixedThreadPool(3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String prepareMultipleFood() {
        Callable<String> prepareFood;
        boolean sandwichDone = false;
        boolean pizzaDone = false;

        prepareFood = new FoodPreparation(menu.get(0));
        Future<String> sandwichReady = chefsTeam.submit(prepareFood);

        prepareFood = new FoodPreparation(menu.get(1));
        Future<String> pizzaReady = chefsTeam.submit(prepareFood);

        try {
            do {
                if (sandwichReady.isDone() && !sandwichDone) {
                    System.out.println(sandwichReady.get());
                    sandwichDone = true;
                }
                if (pizzaReady.isDone() && !pizzaDone) {
                    System.out.println(pizzaReady.get());
                    pizzaDone = true;
                }
            } while(!sandwichDone || !pizzaDone);

            return "done";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Exception occurred while preparing food";
        }
    }

    public String prepareFood(MenuItem item) {
        Callable<String> prepareFood = new FoodPreparation(item);

        Future<String> preparedFood = chefsTeam.submit(prepareFood);

        try {
            String result = preparedFood.get();
            System.out.println(result);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Exception occurred while preparing food";
        }
    }

    class FoodPreparation implements Callable<String> {
        private MenuItem item;

        public FoodPreparation(MenuItem item) {
            this.item = item;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(item.preparationTime * 1000);
            return item.itemName + " prepared in " + item.preparationTime + " seconds";
        }
    }

    // takeOrder -

    // serveCustomer

    // calculateBill

    // receivePayment

    public class MenuItem {
        String itemName;
        BigDecimal itemPrice;
        Integer preparationTime;

        public MenuItem(String itemName, BigDecimal itemPrice, Integer preparationTime) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.preparationTime = preparationTime;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public BigDecimal getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(BigDecimal itemPrice) {
            this.itemPrice = itemPrice;
        }

        public Integer getPreparationTime() {
            return preparationTime;
        }

        public void setPreparationTime(Integer preparationTime) {
            this.preparationTime = preparationTime;
        }
    }

    public List<MenuItem> getMenu() {
        return menu;
    }
}
