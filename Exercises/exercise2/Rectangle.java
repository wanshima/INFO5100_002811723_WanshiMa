package Exercises.exercise2;

/**
 * Represents a rectangle, providing methods to calculate its area and perimeter.
 * Extends the Shape abstract class.
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    /**
     * Constructs a Rectangle with specified length and width.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle, computed as length * width.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle, computed as 2 * (length + width).
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
