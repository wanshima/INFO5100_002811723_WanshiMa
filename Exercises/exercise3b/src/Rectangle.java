/**
 * Represents a rectangle which is a specific type of shape.
 * Inherits from the abstract class Shape and provides implementations for calculating area and perimeter.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructs a Rectangle with specified length and width.
     * Also sets the color of all shapes to "Blue".
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        Shape.shapeColor = "Blue";
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle, computed as length multiplied by width.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle, computed as 2 times the sum of length and width.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}