package Exercises.exercise0;

/**
 * Represents a water bottle with specific features for storing and consuming liquids.
 */
public class WaterBottle {
    public String id;
    public String brand;
    public double capacity; 
    public String color;
    public boolean isInsulated;
    public String material;
    public double weight; 
    public boolean hasFilter;
    public String lidType;
    public double price;

    /**
     * Constructs a new WaterBottle instance with specified attributes.
     */
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

    /**
     * Fills the water bottle with a liquid.
     */
    public void fill() {}

    /**
     * Simulates drinking from the water bottle.
     */
    public void drink() {}

    /**
     * Cleans the water bottle.
     */
    public void clean() {}
}
