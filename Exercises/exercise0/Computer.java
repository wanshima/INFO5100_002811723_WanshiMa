package Exercises.exercise0;

/**
 * Represents a computer with various specifications and behaviors.
 */
public class Computer {
    public String id;
    public String brand;
    public String model;
    public double cpuSpeed;
    public int ram;
    public int storage;
    public boolean isLaptop;
    public String os;
    public double screenSize;
    public int batteryLife;

    /**
     * Constructs a new Computer instance with specified attributes.
     */
    public Computer(String brand, String model, double cpuSpeed, int ram, int storage, boolean isLaptop, String os, double screenSize, int batteryLife) {
        this.id = java.util.UUID.randomUUID().toString();
        this.brand = brand;
        this.model = model;
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.storage = storage;
        this.isLaptop = isLaptop;
        this.os = os;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        System.out.println("Computer instance created with ID: " + this.id);
    }

    /**
     * Powers on the computer.
     */
    public void powerOn() {}

    /**
     * Powers off the computer.
     */
    public void powerOff() {}


    /**
     * Reboots the computer.
     */
    public void reboot() {}
    
}
