package Exercises.exercise0;

public class Computer {
    String id;
    String brand;
    String model;
    double cpuSpeed;
    int ram;
    int storage;
    boolean isLaptop;
    String os;
    double screenSize;
    int batteryLife;

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

    class Memory {
        int size;
        String type;
        double speed;
        String manufacturer;
        boolean isDualChannel;
        double voltage;
        String formFactor;
        boolean isECC;

        public Memory(int size, String type, double speed, String manufacturer, boolean isDualChannel, double voltage, String formFactor, boolean isECC) {
            this.size = size;
            this.type = type;
            this.speed = speed;
            this.manufacturer = manufacturer;
            this.isDualChannel = isDualChannel;
            this.voltage = voltage;
            this.formFactor = formFactor;
            this.isECC = isECC;
        }

        public void upgrade() {}

        public void showSpecs() {}

        public void decreaseVoltage() {}
    }

    class Processor {
        public String model;
        public double speed;
        public int cores;
        public int threads;
        public String architecture;
        public int cacheSize;
        public double tdp;
        public String socketType;

        public Processor(String model, double speed, int cores, int threads, String architecture, int cacheSize, double tdp, String socketType) {
            this.model = model;
            this.speed = speed;
            this.cores = cores;
            this.threads = threads;
            this.architecture = architecture;
            this.cacheSize = cacheSize;
            this.tdp = tdp;
            this.socketType = socketType;
        }

        public void overclock() {}

        public void updateFirmware() {}

        public void displaySpecs() {}
    }
}
