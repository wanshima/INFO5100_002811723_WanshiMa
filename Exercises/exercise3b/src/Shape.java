import java.io.*;
public abstract class Shape implements Serializable {
    protected static String shapeColor;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public static String getShapeColor() {
        return shapeColor;
    }
}