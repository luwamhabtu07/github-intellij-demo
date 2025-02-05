import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometryAppTest {

    @Test
    void testCircle() {
        Circle circle = new Circle(5);
        assertEquals(78.54, circle.calculateArea(), 0.01);
        assertEquals(31.42, circle.calculatePerimeter(), 0.01);
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(12.0, rectangle.calculateArea());
        assertEquals(14.0, rectangle.calculatePerimeter());
    }

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.calculateArea());
        assertEquals(12.0, triangle.calculatePerimeter());
    }

    @Test
    void testInvalidTriangle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 2, 10);
        });
        assertEquals("Invalid Triangle sides", exception.getMessage());
    }
}
