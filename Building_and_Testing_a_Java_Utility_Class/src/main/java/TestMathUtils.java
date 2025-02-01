public class TestMathUtils {
    public static void main(String[] args) {
        // Normal test cases
        System.out.println("Normal Test Cases:");
        System.out.println("Addition (10 + 5): " + MathUtils.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + MathUtils.subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + MathUtils.multiply(10, 5));
        System.out.println("Division (10 / 2): " + MathUtils.divide(10, 2));

        // Edge cases
        System.out.println("\nEdge Test Cases:");
        System.out.println("Addition (Integer Max + 1): " + MathUtils.add(Integer.MAX_VALUE, 1));
        System.out.println("Subtraction (Integer Min - 1): " + MathUtils.subtract(Integer.MIN_VALUE, 1));
        System.out.println("Division by zero (10 / 0): " + MathUtils.divide(10, 0));
    }
}
