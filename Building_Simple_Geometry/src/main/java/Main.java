public class Main {
    public static void main(String[] args) {
        try {
            // Normal Test Cases
            System.out.println("=== Normal Test Cases ===");
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 7);
            Triangle triangle = new Triangle(3, 4, 5);

            System.out.println(circle);
            System.out.println(rectangle);
            System.out.println(triangle);

            // Edge Cases
            System.out.println("\n=== Edge Case Test Cases ===");

            // Edge Case 1: Circle with radius 0
            Circle edgeCircle = new Circle(0);
            System.out.println(edgeCircle);

            // Edge Case 2: Rectangle with one side 0
            Rectangle edgeRectangle = new Rectangle(0, 10);
            System.out.println(edgeRectangle);

            // Edge Case 3: Invalid Triangle (should not crash the program)
            try {
                Triangle edgeTriangle = new Triangle(1, 2, 10);
                System.out.println(edgeTriangle);
            } catch (IllegalArgumentException e) {
                System.out.println("Error Handling: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }
    }
}
