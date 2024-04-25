/**
 * Represents a square, a specific kind of rectangle where all sides have the same length.
 * Extends the Rectangle class to reuse rectangle properties and methods.
 */
public class Square extends Rectangle {
    /**
     * Constructor for the Square class that initializes a square with equal length and width.
     * Sets the color of all shapes to "Green" upon instantiation of a square.
     * @param side The length of each side of the square.
     */
    public Square(double side) {
        super(side, side);
        Shape.shapeColor = "Green";
    }
}