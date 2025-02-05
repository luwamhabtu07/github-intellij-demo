// Abstract class defining the structure for all shapes
abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method to return shape name
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    // Override toString for better output readability
    @Override
    public String toString() {
        return getShapeName() + " - Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
