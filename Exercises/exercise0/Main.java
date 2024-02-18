package Exercises.exercise0;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Microsoft", "Surface", 3.6, 16, 512, false, "Linux", 15.6, 10);
        Computer computer2 = new Computer("Dell", "Inspiron 27", 2.5, 8, 256, true, "Windows 10", 13.3, 8);
        Computer computer3 = new Computer("Apple", "Pro", 4.1, 32, 1024, false, "macOS", 17, 12);

        Computer.Memory memory1 = computer1.new Memory(16, "DDR4", 3200, "MemoryBrandA", true, 1.2, "DIMM", false);
        Computer.Memory memory2 = computer2.new Memory(8, "DDR3", 1600, "MemoryBrandB", false, 1.5, "SO-DIMM", false);
        Computer.Memory memory3 = computer3.new Memory(32, "DDR4", 3600, "MemoryBrandC", true, 1.35, "DIMM", true);

        Computer.Processor processor1 = computer1.new Processor("ProcessorModelA", 3.6, 6, 12, "x64", 9, 95, "LGA1151");
        Computer.Processor processor2 = computer2.new Processor("ProcessorModelB", 2.5, 4, 8, "ARM", 4, 15, "ARM");
        Computer.Processor processor3 = computer3.new Processor("ProcessorModelC", 4.1, 8, 16, "x64", 16, 105, "AM4");

        Car car1 = new Car("Toyota", "Camry", 2020, "Silver", 25000, false, 5, 20000);
        Car car2 = new Car("Tesla", "Model 3", 2021, "Red", 10000, true, 5, 75000);
        Car car3 = new Car("BMW", "440", 2022, "Blue", 5000, false, 4, 35000);

        Car.Engine engine1 = car1.new Engine("V6", 3.5, 300, 260, false, "Petrol", 25);
        Car.Engine engine2 = car2.new Engine("Electric", 0, 1020, 1050, false, "Electric", 120);
        Car.Engine engine3 = car3.new Engine("V8", 5.0, 450, 410, true, "Petrol", 22);

        Car.Transmission transmission1 = car1.new Transmission("Automatic", 6, false, "6AT", false, 250, "Aisin");
        Car.Transmission transmission2 = car2.new Transmission("Single-speed", 1, false, "1ST", true, 1000, "Tesla");
        Car.Transmission transmission3 = car3.new Transmission("Manual", 6, true, "6MT", false, 400, "Getrag");

        WaterBottle waterBottle1 = new WaterBottle("Hydro Flask", 1.0, "Blue", true, "Stainless Steel", 300, false, "Screw Top", 29.95);
        WaterBottle waterBottle2 = new WaterBottle("Stanley", 1.0, "Green", false, "Plastic", 150, false, "Tumbler", 11.95);
        WaterBottle waterBottle3 = new WaterBottle("Brita", 0.7, "Purple", false, "Plastic", 200, true, "Flip Top", 19.95);

        Chair chair1 = new Chair("Leather", "Black", true, true, 120.0, "Modern", 45.0, true);
        Chair chair2 = new Chair("Fabric", "Blue", false, false, 100.0, "Traditional", 40.0, false);
        Chair chair3 = new Chair("Mesh", "Gray", true, true, 110.0, "Ergonomic", 42.5, true);

        Desk desk1 = new Desk("Wood", "Brown", 120.0, 60.0, 75.0, true, 4, false, 299.99);
        Desk desk2 = new Desk("Metal", "Black", 140.0, 70.0, 75.0, false, 0, true, 399.99);
        Desk desk3 = new Desk("Glass", "Clear", 130.0, 65.0, 75.0, true, 3, true, 499.99);

        Refrigerator fridge1 = new Refrigerator("Whirlpool", 500, "Silver", true, 3, true, true, "A+", 1200.00);
        Refrigerator fridge2 = new Refrigerator("Samsung", 450, "Black", true, 2, true, false, "A++", 1500.00);
        Refrigerator fridge3 = new Refrigerator("LG", 550, "White", true, 4, false, true, "A", 1000.00);

        Dishwasher dishwasher1 = new Dishwasher("Bosch", "Series 4", 12, "Silver", true, 5, true, "A++", 599.99);
        Dishwasher dishwasher2 = new Dishwasher("Samsung", "WaterWall", 14, "White", true, 7, false, "A+", 799.99);
        Dishwasher dishwasher3 = new Dishwasher("Whirlpool", "AquaLift", 10, "Black", false, 4, true, "A", 499.99);

        TV tv1 = new TV("Samsung", "QLED Q80T", 55, true, "4K", 120, true, 4, 1299.99);
        TV tv2 = new TV("LG", "CX OLED", 65, true, "4K", 120, true, 4, 2199.99);
        TV tv3 = new TV("Sony", "Bravia XR", 75, true, "8K", 120, true, 4, 4999.99);

        Dryer dryer1 = new Dryer("Whirlpool", "QuickDry", 7.0, "A++", false, 10, true, "White", 499.99);
        Dryer dryer2 = new Dryer("Samsung", "EcoDry", 8.5, "A+", true, 12, true, "Silver", 599.99);
        Dryer dryer3 = new Dryer("LG", "TurboDry", 9.0, "A", false, 8, false, "Black", 549.99);

        Washer washer1 = new Washer("LG", "UltraWash", 7.5, 1400, "A+++", true, true, 12, 599.99);
        Washer washer2 = new Washer("Samsung", "EcoBubble", 9.0, 1200, "A++", false, true, 15, 649.99);
        Washer washer3 = new Washer("Bosch", "Series 4", 8.0, 1400, "A++", true, false, 10, 529.99);
    }
}
