package Exercises.exercise0;

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

    public void adjustHeight() {}

    public void roll() {}

    public void turn() {}
}
