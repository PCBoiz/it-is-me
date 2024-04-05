package models;

public class FoodItemApp {
    public static void main(String[] args) {
        // Create a new instance of the FoodItemService class
        FoodItemService foodItemService = new FoodItemService();

        // Add new food items using the FoodItemService instance
        foodItemService.addFoodItem(new FoodItem("Pizza", 9.99));
        foodItemService.addFoodItem(new FoodItem("Burger", 7.99));

        // List all food items using the FoodItemService instance
        foodItemService.listFoodItems();

        // Update the price of a food item using the FoodItemService instance
        foodItemService.updateFoodItemPrice(1, 10.99);

        // List all food items again to see the updated price
        foodItemService.listFoodItems();
    }
}
