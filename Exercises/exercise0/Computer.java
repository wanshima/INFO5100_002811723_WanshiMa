package Exercises.exercise0;

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

    public void powerOn() {}

    public void powerOff() {}

    public void reboot() {}
    
}
