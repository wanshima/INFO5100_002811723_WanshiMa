package Exercises.exercise0;

/**
 * Represents a chair with various properties and behaviors.
 */
public class Chair {
    public String id;
    public String material;
    public String color;
    public boolean hasArmrests;
    public boolean isAdjustable;
    public double weightCapacity; 
    public String style;
    public double seatHeight; 
    public boolean hasWheels;

    /**
     * Constructor to initialize a new chair with specified attributes.
     */
    public Chair(String material, String color, boolean hasArmrests, boolean isAdjustable, double weightCapacity, String style, double seatHeight, boolean hasWheels) {
        this.id = java.util.UUID.randomUUID().toString();
        this.material = material;
        this.color = color;
        this.hasArmrests = hasArmrests;
        this.isAdjustable = isAdjustable;
        this.weightCapacity = weightCapacity;
        this.style = style;
        this.seatHeight = seatHeight;
        this.hasWheels = hasWheels;
        System.out.println("Chair instance created with ID: " + this.id);
    }

    /**
     * Adjusts the height of the chair.
     */
    public void adjustHeight() {}

    /**
     * Allows the chair to roll.
     */
    public void roll() {}

    /**
     * Enables the chair to turn around its axis.
     */
    public void turn() {}
}
