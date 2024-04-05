package Service;

import java.util.ArrayList;

public class FoodItemService {
    private List<FoodItem> foodItems = new ArrayList<>();

    // ... other methods ...

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void listFoodItems() {
        System.out.println("----- List of Food Items -----");
        if (foodItems.isEmpty()) {
            System.out.println("No food items found.");
        } else {
            for (FoodItem foodItem : foodItems) {
                System.out.println(foodItem);
            }
        }
    }

    public void updateFoodItemPrice(int id, double newPrice) {
        for (FoodItem foodItem : foodItems) {
            if (foodItem.getId() == id) {
                foodItem.setPrice(newPrice);
                break;
            }
        }
    }
}