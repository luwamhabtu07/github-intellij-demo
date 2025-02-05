class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        // Validate if sides form a valid triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1 + side2 <= side3) ||
                (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return getShapeName() + " - Sides: " + side1 + ", " + side2 + ", " + side3 +
                ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
