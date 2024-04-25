/**
 * Represents a circle, which is a specific type of shape.
 * Extends the abstract Shape class and implements methods for calculating the area and perimeter.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructor for the Circle class.
     * Initializes a circle with a specified radius and sets the color of all shapes to "Red".
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
        Shape.shapeColor = "Red";
    }

    /**
     * Calculates the area of the circle using the formula: π * radius^2.
     * @return The area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the perimeter (circumference) of the circle using the formula: 2 * π * radius.
     * @return The perimeter of the circle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}