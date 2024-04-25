package Exercises.exercise0;

/**
 * Represents a desk with various attributes and functionalities.
 */
public class Desk {
    public String id;
    public String material;
    public String color;
    public double length;
    public double width;
    public double height;
    public boolean hasDrawers;
    public int numberOfDrawers;
    public boolean isAdjustable;
    public double price;

    /**
     * Constructs a new Desk instance with specified attributes.
     */
    public Desk(String material, String color, double length, double width, double height, boolean hasDrawers, int numberOfDrawers, boolean isAdjustable, double price) {
        this.id = java.util.UUID.randomUUID().toString();
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.hasDrawers = hasDrawers;
        this.numberOfDrawers = numberOfDrawers;
        this.isAdjustable = isAdjustable;
        this.price = price;
        System.out.println("Desk instance created with ID: " + this.id);
    }

    /**
     * Adjusts the height of the desk.
     */
    public void adjustHeight() {}

    /**
     * Opens a drawer of the desk.
     */
    public void openDrawer() {}

    /**
     * Locks all drawers of the desk.
     */
    public void lockDrawers() {}
}