import java.io.*;

/**
 * Abstract class that serves as a template for various geometric shapes.
 * Implements Serializable to allow its subclasses to be serialized.
 */
public abstract class Shape implements Serializable {
    protected static String shapeColor;

    /**
     * Calculates the area of the shape.
     * This method must be implemented by all concrete subclasses.
     * @return the calculated area as a double.
     */
    public abstract double calculateArea();

    /**
     * Calculates the perimeter of the shape.
     * This method must be implemented by all concrete subclasses.
     * @return the calculated perimeter as a double.
     */
    public abstract double calculatePerimeter();

    /**
     * Returns the color common to all shapes.
     * @return The color of the shapes as a string.
     */
    public static String getShapeColor() {
        return shapeColor;
    }
}