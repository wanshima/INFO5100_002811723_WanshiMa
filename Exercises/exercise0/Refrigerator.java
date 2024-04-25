package Exercises.exercise0;

/**
 * Represents a refrigerator with several functionalities and features.
 */
public class Refrigerator {
    public String id;
    public String brand;
    public double capacity;
    public String color;
    public boolean hasFreezer;
    public int temperatureSetting;
    public boolean hasWaterDispenser;
    public boolean hasIceMaker;
    public String energyRating;
    public double price;

    /**
     * Constructs a new Refrigerator with specified attributes.
     */
    public Refrigerator(String brand, double capacity, String color, boolean hasFreezer, int temperatureSetting, boolean hasWaterDispenser, boolean hasIceMaker, String energyRating, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
        this.hasFreezer = hasFreezer;
        this.temperatureSetting = temperatureSetting;
        this.hasWaterDispenser = hasWaterDispenser;
        this.hasIceMaker = hasIceMaker;
        this.energyRating = energyRating;
        this.price = price;
        System.out.println("Refrigerator instance created with ID: " + this.id);
    }

    /**
     * Adjusts the refrigerator's internal temperature setting.
     */
    public void adjustTemperature() {}


    /**
     * Refills the refrigerator's water dispenser tank.
     */
    public void refillWaterDispenser() {}

    /**
     * Activates the refrigerator's ice maker to produce ice.
     */
    public void makeIce() {}
}
