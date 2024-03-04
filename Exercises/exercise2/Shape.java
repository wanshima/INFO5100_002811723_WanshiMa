package Exercises.exercise2;

public abstract class Shape {
    protected static String shapeColor; 

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public static String getShapeColor() {
        return shapeColor;
    }
}
