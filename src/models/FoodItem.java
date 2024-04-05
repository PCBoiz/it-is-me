package models;

public class FoodItem {
    private int id;
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.id = generateUniqueId();
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int generateUniqueId() {
        // Generate a unique ID for the food item
        // You can use a UUID, AtomicInteger, or any other method to generate unique IDs
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
