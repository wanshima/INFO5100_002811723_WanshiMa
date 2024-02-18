package Exercises.exercise0;

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

    public void turnOn() {}

    public void turnOff() {}

    public void changeChannel() {}
}
