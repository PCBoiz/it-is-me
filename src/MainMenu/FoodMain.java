package MainMenu;

import java.util.Scanner;

public class FoodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1. Log in");
            System.out.println("2. Register");
            System.out.println("0. Exit program");
            userChoice = getValidUserChoice(scanner);
        } while (userChoice!= 0);

        scanner.close();
    }

    private static int getValidUserChoice(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 0 || choice > 2) {
            System.out.println("Invalid input. Please try again.");
            choice = getValidUserChoice(scanner);
        }

        return choice;
    }

    private static void handleUserChoice(int userChoice) {
        switch (userChoice) {
            case 1:
                UserMain.login();
                break;
            case 2:
                UserMain.register();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }
}