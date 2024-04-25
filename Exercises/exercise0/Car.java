package Exercises.exercise0;

/**
 * Represents a car with various attributes and components.
 */
public class Car {
    public String id;
    public String make;
    public String model;
    public int year;
    public String color;
    public double mileage;
    public boolean isElectric;
    public int seatingCapacity;
    public double price;
    public Engine engine;
    public Transmission transmission;

    /**
     * Constructor for creating a new Car instance with initial values.
     */
    public Car(String make, String model, int year, String color, double mileage, boolean isElectric, int seatingCapacity, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.isElectric = isElectric;
        this.seatingCapacity = seatingCapacity;
        this.price = price;
        System.out.println("Car instance created with ID: " + this.id);
    }

    /**
     * Assigns an engine to this car.
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * Assigns a transmission to this car.
     */
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // Methods for car functionalities
    public void drive() {}

    public void brake() {}

    public void accelerate() {}

    /**
     * Represents the engine of the car, detailing its specifications.
     */
    class Engine {
        public String id;
        public String type;
        public double displacement;
        public int horsepower;
        public int torque;
        public boolean isTurboCharged;
        public String fuelType;
        public double fuelEfficiency;
        public boolean isRunning;

        /**
         * Constructor for creating a new Engine instance with initial values.
         */
        public Engine(String type, double displacement, int horsepower, int torque, boolean isTurboCharged, String fuelType, double fuelEfficiency) {
            this.id = java.util.UUID.randomUUID().toString();
            this.type = type;
            this.displacement = displacement;
            this.horsepower = horsepower;
            this.torque = torque;
            this.isTurboCharged = isTurboCharged;
            this.fuelType = fuelType;
            this.fuelEfficiency = fuelEfficiency;
            this.isRunning = false;
            System.out.println("Car engine instance created with ID: " + this.id);
        }

        public void start() {}

        public void stop() {}

        public void increaseTorque() {}
    }


    /**
     * Represents the transmission system of the car, detailing its specifications.
     */
    class Transmission {
        public String id;
        public String type;
        public int gears;
        public boolean isManual;
        public String model;
        public boolean isAWD;
        public int maxTorque;
        public String manufacturer;
        public boolean isLocked;

        /**
         * Constructor for creating a new Transmission instance with initial values.
         */
        public Transmission(String type, int gears, boolean isManual, String model, boolean isAWD, int maxTorque, String manufacturer) {
            this.id = java.util.UUID.randomUUID().toString();
            this.type = type;
            this.gears = gears;
            this.isManual = isManual;
            this.model = model;
            this.isAWD = isAWD;
            this.maxTorque = maxTorque;
            this.manufacturer = manufacturer;
            this.isLocked = false;
            System.out.println("Car transmission created with ID: " + this.id);
        }

        public void shiftUp() {}

        public void shiftDown() {}

        public void lockDifferential() {}
    }
}
