package MainMenu;

import Service.FoodItemService;

import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("----- RestoFusion Main Menu -----");
        System.out.println("1. Manage Food Items");
        System.out.println("2. Manage Rooms");
        System.out.println("3. Exit");
        System.out.print("Please enter your choice: ");
    }

    public static int getMainMenuChoice() {
        while (true) {
            displayMainMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }
            }
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            scanner.next();
        }
    }

    public static void manageFoodItems() {
        System.out.println("----- Manage Food Items -----");
        System.out.println("1. Add a new food item");
        System.out.println("2. List all food items");
        System.out.println("3. Go back to main menu");
        System.out.print("Please enter your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addNewFoodItem();
                break;
            case 2:
                FoodItemService.listFoodItems();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
        }
    }

    public static void addNewFoodItem() {
        Scanner scanner = MainMenu.scanner;

        System.out.print("Enter food name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter food price: ");
        double price = scanner.nextDouble();

        // Create a FoodItem object and add it to the FoodItemService
        FoodItem foodItem = new FoodItem(name, price);
        FoodItemService.addFoodItem(foodItem);
        FoodItemService.printFoodItems();
    }
}
