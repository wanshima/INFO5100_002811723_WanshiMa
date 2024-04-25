package Exercises.exercise2;

/**
 * Represents a circle and extends the Shape class to provide methods for calculating its area and perimeter.
 */
public class Circle extends Shape{
    private double radius;

    /**
     * Constructor for the Circle class that sets the radius.
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }


    /**
     * Calculates the area of the circle.
     * @return The area of the circle, computed as PI multiplied by the square of the radius.
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the perimeter of the circle.
     * @return The perimeter of the circle, computed as 2 multiplied by PI and the radius.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
}
