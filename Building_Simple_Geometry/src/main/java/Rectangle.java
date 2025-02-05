class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return getShapeName() + " - Length: " + length + ", Width: " + width +
                ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}
