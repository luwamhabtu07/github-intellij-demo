public class TestMathUtils {
    public static void main(String[] args) {
        try {
            // Normal test cases
            System.out.println("//Normal test cases " );
            System.out.println("Addition: " + MathUtils.add(10, 5)); // Expected: 15
            System.out.println("Subtraction: " + MathUtils.subtract(10, 5)); // Expected: 5
            System.out.println("Multiplication: " + MathUtils.multiply(10, 5)); // Expected: 50
            System.out.println("Division: " + MathUtils.divide(10, 2)); // Expected: 5.0

            // Edge test cases
            System.out.println("// Edge test cases " );
            System.out.println("Addition with zero: " + MathUtils.add(0, 5)); // Expected: 5
            System.out.println("Multiplication with negative: " + MathUtils.multiply(-3, 5)); // Expected: -15

            // Edge case: Division by zero
            System.out.println("Division by zero: " + MathUtils.divide(10, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Handling the error gracefully
        }
    }
}
