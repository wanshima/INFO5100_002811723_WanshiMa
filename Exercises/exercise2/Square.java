package Exercises.exercise2;

/**
 * Represents a square. Extends the Rectangle class, using the same value for both length and width,
 * since all sides of a square are equal.
 */
public class Square extends Rectangle {
    /**
     * Constructor for the Square class that initializes a new square with equal side lengths.
     * @param side The length of each side of the square.
     */
    public Square(double side) {
        super(side, side);
    }
}
