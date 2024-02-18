package Exercises.exercise0;

public class Washer {
    public String id;
    public String brand;
    public String model;
    public double capacity; 
    public int maxSpinSpeed; 
    public String energyRating;
    public boolean hasSteamFunction;
    public boolean hasDelayStart;
    public int numberOfPrograms;
    public double price;

    public Washer(String brand, String model, double capacity, int maxSpinSpeed, String energyRating, boolean hasSteamFunction, boolean hasDelayStart, int numberOfPrograms, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.maxSpinSpeed = maxSpinSpeed;
        this.energyRating = energyRating;
        this.hasSteamFunction = hasSteamFunction;
        this.hasDelayStart = hasDelayStart;
        this.numberOfPrograms = numberOfPrograms;
        this.price = price;
        System.out.println("Washer instance created with ID: " + this.id);
    }

    public void startWashCycle() {}

    public void pauseWashCycle() {}

    public void endWashCycle() {}
}
