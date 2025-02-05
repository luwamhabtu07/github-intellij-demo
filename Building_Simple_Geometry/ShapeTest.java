import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void testCircleNormalCases() {
        Circle c1 = new Circle(5);
        assertEquals(78.53981633974483, c1.calculateArea(), 0.0001);
        assertEquals(31.41592653589793, c1.calculatePerimeter(), 0.0001);
    }

    @Test
    void testRectangleNormalCases() {
        Rectangle r1 = new Rectangle(4, 7);
        assertEquals(28.0, r1.calculateArea());
        assertEquals(22.0, r1.calculatePerimeter());
    }

    @Test
    void testTriangleNormalCases() {
        Triangle t1 = new Triangle(3, 4, 5);
        assertEquals(6.0, t1.calculateArea(), 0.0001);
        assertEquals(12.0, t1.calculatePerimeter());
    }

    @Test
    void testCircleEdgeCaseZeroRadius() {
        Circle c2 = new Circle(0);
        assertEquals(0.0, c2.calculateArea());
        assertEquals(0.0, c2.calculatePerimeter());
    }

    @Test
    void testRectangleEdgeCaseZeroLengthWidth() {
        Rectangle r2 = new Rectangle(0, 10);
        assertEquals(0.0, r2.calculateArea());
        assertEquals(20.0, r2.calculatePerimeter());
    }

    @Test
    void testTriangleEdgeCaseInvalidTriangle() {
        Triangle t2 = new Triangle(1, 2, 10); // Not a valid triangle
        assertEquals(0.0, t2.calculateArea(), 0.0001); // Should handle invalid cases
        assertEquals(13.0, t2.calculatePerimeter()); // Still sums sides
    }
}
