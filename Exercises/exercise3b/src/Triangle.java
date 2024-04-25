/**
 * Represents a triangle, extending the Shape class.
 * This class calculates both the area and perimeter of a triangle and assigns a color.
 */
public class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructs a Triangle with specified dimensions.
     * Also sets the static color for all shapes to "Yellow".
     * @param base The base length of the triangle.
     * @param height The height of the triangle, perpendicular to the base.
     * @param side1 The length of the first side of the triangle.
     * @param side2 The length of the second side of the triangle.
     * @param side3 The length of the third side of the triangle.
     */
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        Shape.shapeColor = "Yellow";
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
     * Calculates the perimeter of the triangle, which is the sum of its three sides.
     * @return The perimeter of the triangle.
     */
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

