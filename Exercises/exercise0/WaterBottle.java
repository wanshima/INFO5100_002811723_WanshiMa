package Exercises.exercise0;

public class WaterBottle {
    public String id;
    public String brand;
    public double capacity; // in liters
    public String color;
    public boolean isInsulated;
    public String material;
    public double weight; // in grams
    public boolean hasFilter;
    public String lidType;
    public double price;

    public WaterBottle(String brand, double capacity, String color, boolean isInsulated, String material, double weight, boolean hasFilter, String lidType, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        this.isInsulated = isInsulated;
        this.material = material;
        this.weight = weight;
        this.hasFilter = hasFilter;
        this.lidType = lidType;
        this.price = price;
        System.out.println("WaterBottle instance created with ID: " + this.id);
    }

    public void fill() {}

    public void drink() {}

    public void clean() {}
}
