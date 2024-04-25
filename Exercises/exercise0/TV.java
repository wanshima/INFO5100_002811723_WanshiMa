package Exercises.exercise0;


/**
 * Represents a television with specific features and operational functions.
 */
public class TV {
    public String id;
    public String brand;
    public String model;
    public double screenSize; 
    public boolean isSmart;
    public String resolution;
    public int refreshRate; 
    public boolean hasHDR;
    public int numberOfHDMIPorts;
    public double price;

    /**
     * Constructs a new TV instance with specified features.
     */
    public TV(String brand, String model, double screenSize, boolean isSmart, String resolution, int refreshRate, boolean hasHDR, int numberOfHDMIPorts, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.hasHDR = hasHDR;
        this.numberOfHDMIPorts = numberOfHDMIPorts;
        this.price = price;
        System.out.println("TV instance created with ID: " + this.id);
    }

    /**
     * Powers on the TV.
     */
    public void turnOn() {}

    /**
     * Powers off the TV.
     */
    public void turnOff() {}

    /**
     * Changes the channel on the TV.
     */
    public void changeChannel() {}
}
