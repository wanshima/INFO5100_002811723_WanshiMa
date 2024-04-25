package Exercises.exercise2;

import java.util.ArrayList;
import java.util.List;


/**
 * Demonstrates the functionality of various shapes by calculating their area and perimeter.
 */
public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        // Populate the list with different shapes
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Triangle(3, 4, 5, 6, 7));
        shapes.add(new Square(6));

        // Iterate over the shapes and print their area and perimeter
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea() + ", Perimeter: " + shape.calculatePerimeter());
        }
        // Display the color common to all shapes
        Shape.displayColor();


    }
}
