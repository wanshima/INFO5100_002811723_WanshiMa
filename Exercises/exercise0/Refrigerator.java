package Exercises.exercise0;

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

    public void adjustTemperature() {}

    public void refillWaterDispenser() {}

    public void makeIce() {}
}
