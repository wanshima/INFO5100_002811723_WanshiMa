package Exercises.exercise0;

/**
 * Represents a dryer appliance with various features for drying clothes.
 */
public class Dryer {
    public String id;
    public String brand;
    public String model;
    public double capacity; 
    public String energyRating;
    public boolean hasSteamFunction;
    public int numberOfPrograms;
    public boolean hasSensorDrying;
    public String color;
    public double price;

    /**
     * Constructs a new Dryer instance with specified features.
     */
    public Dryer(String brand, String model, double capacity, String energyRating, boolean hasSteamFunction, int numberOfPrograms, boolean hasSensorDrying, String color, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.energyRating = energyRating;
        this.hasSteamFunction = hasSteamFunction;
        this.numberOfPrograms = numberOfPrograms;
        this.hasSensorDrying = hasSensorDrying;
        this.color = color;
        this.price = price;
        System.out.println("Dryer instance created with ID: " + this.id);
    }

    /**
     * Starts the drying cycle of the dryer.
     */
    public void startDryingCycle() {}

    /**
     * Pauses the current drying cycle.
     */
    public void pauseDryingCycle() {}

    /**
     * Stops the current drying cycle.
     */
    public void stopDryingCycle() {}
}
