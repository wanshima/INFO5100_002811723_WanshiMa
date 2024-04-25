package Exercises.exercise2;

/**
 * Abstract class defining the basic properties and methods that all shapes must have.
 */
public abstract class Shape {
    public static String shapeColor = "Red";

    /**
     * Abstract method to calculate the area of the shape. Implementation will differ based on the shape type.
     * @return the calculated area as a double
     */
    public abstract double calculateArea();

    /**
     * Abstract method to calculate the perimeter of the shape. Implementation will vary depending on the shape.
     * @return the calculated perimeter as a double
     */
    public abstract double calculatePerimeter();

    /**
     * Static method to display the color common to all shapes.
     */
    public static void displayColor() {
        System.out.println("The color of all shapes is " + shapeColor);
    }

}
