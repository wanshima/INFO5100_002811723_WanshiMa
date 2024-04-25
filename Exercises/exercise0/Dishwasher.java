package Exercises.exercise0;

/**
 * Represents a dishwasher with specific features and functions.
 */
public class Dishwasher {
    public String id;
    public String brand;
    public String model;
    public int capacity; 
    public String color;
    public boolean hasDryer;
    public int washCycles;
    public boolean hasDelayStart;
    public String energyRating;
    public double price;

    /**
     * Constructs a new Dishwasher instance with the specified attributes.
     */
    public Dishwasher(String brand, String model, int capacity, String color, boolean hasDryer, int washCycles, boolean hasDelayStart, String energyRating, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.hasDryer = hasDryer;
        this.washCycles = washCycles;
        this.hasDelayStart = hasDelayStart;
        this.energyRating = energyRating;
        this.price = price;
        System.out.println("Dishwasher instance created with ID: " + this.id);
    }

    /**
     * Initiates a wash cycle.
     */
    public void wash() {}

    /**
     * Pauses the current cycle.
     */
    public void pause() {}

    /**
     * Empties water from the dishwasher.
     */
    public void drain() {}
}
