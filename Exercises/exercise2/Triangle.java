package Exercises.exercise2;

/**
 * Represents a triangle with defined dimensions for base, height, and sides.
 * Extends the Shape class to provide specific implementations for area and perimeter calculations.
 */
public class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor for the Triangle class that sets the dimensions of the triangle.
     * @param base The length of the base of the triangle.
     * @param height The height from the base to the opposite vertex.
     * @param side1 Length of the first side.
     * @param side2 Length of the second side.
     * @param side3 Length of the third side.
     */
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Calculates the area of the triangle using the formula: 0.5 * base * height.
     * @return The area of the triangle.
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    /**
     * Calculates the perimeter of the triangle, which is the sum of the lengths of its sides.
     * @return The perimeter of the triangle.
     */
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
