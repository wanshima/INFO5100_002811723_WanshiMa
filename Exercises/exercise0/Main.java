package Exercises.exercise0;

import Exercises.exercise0.Car.Engine;
import Exercises.exercise0.Car.Transmission;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 2022, "Red", 0, true, 5, 79999.99);
        Car car2 = new Car("Ford", "Mustang", 2021, "Blue", 15000, false, 4, 35999.99);
        Car car3 = new Car("Chevrolet", "Bolt EV", 2022, "White", 0, true, 5, 36999.99);

        Car.Engine engine1 = car1.new Engine("Electric", 0, 0, 0, false, "Electric", 0);
        Car.Engine engine2 = car2.new Engine("V8", 5.0, 460, 420, true, "Gasoline", 15);
        Car.Engine engine3 = car3.new Engine("Electric", 0, 200, 266, false, "Electric", 0);
        
        car1.setEngine(engine1);
        car2.setEngine(engine2);
        car3.setEngine(engine3);
        
        Car.Transmission transmission1 = car1.new Transmission("Automatic", 1, false, "Single Speed", false, 0, "Tesla");
        Car.Transmission transmission2 = car2.new Transmission("Manual", 6, true, "MT82-D4", false, 420, "Ford");
        Car.Transmission transmission3 = car3.new Transmission("Automatic", 1, false, "Single Speed", false, 0, "Chevrolet");
        
        car1.setTransmission(transmission1);
        car2.setTransmission(transmission2);
        car3.setTransmission(transmission3);

        Computer computer1 = new Computer("Microsoft", "Surface", 3.6, 16, 512, false, "Linux", 15.6, 10);
        Computer computer2 = new Computer("Dell", "Inspiron 27", 2.5, 8, 256, true, "Windows 10", 13.3, 8);
        Computer computer3 = new Computer("Apple", "Pro", 4.1, 32, 1024, false, "macOS", 17, 12);

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
