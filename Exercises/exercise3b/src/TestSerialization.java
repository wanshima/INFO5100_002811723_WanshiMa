import java.io.*;

/**
 * This class demonstrates the serialization and deserialization of different geometric shapes.
 */
public class TestSerialization {
    public static void main(String[] args) {
        serializeAndDeserializeCircle();
        serializeAndDeserializeRectangle();
        serializeAndDeserializeSquare();
        serializeAndDeserializeTriangle();
    }

    /**
     * Serializes and deserializes a Circle object.
     * Displays the area, perimeter, and color of the deserialized object.
     */
    private static void serializeAndDeserializeCircle() {
        Circle circle = new Circle(5);
        serializeObject(circle, "circle.ser");
        Circle deserializedCircle = (Circle) deserializeObject("circle.ser");
        if (deserializedCircle != null) {
            System.out.println("Deserialized Circle");
            System.out.println("Area: " + deserializedCircle.calculateArea());
            System.out.println("Perimeter: " + deserializedCircle.calculatePerimeter());
            System.out.println("Color: " + Shape.getShapeColor());
        }
    }

    /**
     * Serializes and deserializes a Rectangle object.
     * Displays the area, perimeter, and color of the deserialized object.
     */
    private static void serializeAndDeserializeRectangle() {
        Rectangle rectangle = new Rectangle(4, 5);
        serializeObject(rectangle, "rectangle.ser");
        Rectangle deserializedRectangle = (Rectangle) deserializeObject("rectangle.ser");
        if (deserializedRectangle != null) {
            System.out.println("Deserialized Rectangle");
            System.out.println("Area: " + deserializedRectangle.calculateArea());
            System.out.println("Perimeter: " + deserializedRectangle.calculatePerimeter());
            System.out.println("Color: " + Shape.getShapeColor());
        }
    }

    /**
     * Serializes and deserializes a Square object.
     * Displays the area, perimeter, and color of the deserialized object.
     */
    private static void serializeAndDeserializeSquare() {
        Square square = new Square(6);
        serializeObject(square, "square.ser");
        Square deserializedSquare = (Square) deserializeObject("square.ser");
        if (deserializedSquare != null) {
            System.out.println("Deserialized Square");
            System.out.println("Area: " + deserializedSquare.calculateArea());
            System.out.println("Perimeter: " + deserializedSquare.calculatePerimeter());
            System.out.println("Color: " + Shape.getShapeColor());
        }
    }

    /**
     * Serializes and deserializes a Triangle object.
     * Displays the area, perimeter, and color of the deserialized object.
     */
    private static void serializeAndDeserializeTriangle() {
        Triangle triangle = new Triangle(3, 4, 5, 5, 5);
        serializeObject(triangle, "triangle.ser");
        Triangle deserializedTriangle = (Triangle) deserializeObject("triangle.ser");
        if (deserializedTriangle != null) {
            System.out.println("Deserialized Triangle");
            System.out.println("Area: " + deserializedTriangle.calculateArea());
            System.out.println("Perimeter: " + deserializedTriangle.calculatePerimeter());
            System.out.println("Color: " + Shape.getShapeColor());
        }
    }

    /**
     * Serializes an object to a file specified by filename.
     * @param obj The object to serialize.
     * @param filename The name of the file to which the object is saved.
     */
    private static void serializeObject(Object obj, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj);
            System.out.println("Serialized data is saved in " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    /**
     * Deserializes an object from a file specified by filename.
     * @param filename The name of the file from which to deserialize the object.
     * @return The deserialized object, or null if an error occurs.
     */
    private static Object deserializeObject(String filename) {
        Object obj = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            obj = in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return obj;
    }
}
