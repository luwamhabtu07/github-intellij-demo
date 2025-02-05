import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        // Create instances of each shape
        Circle circle = new Circle(5); // Circle with radius 5
        Rectangle rectangle = new Rectangle(4, 7); // Rectangle with length 4 and width 7
        Triangle triangle = new Triangle(3, 4, 5); // Triangle with sides 3, 4, 5

        // Store the shapes in an ArrayList
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        // Loop through the shapes and print their details
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
