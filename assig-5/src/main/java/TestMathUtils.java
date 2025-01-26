public class TestMathUtils {
    public static void main(String[] args) {
        // Normal cases
        System.out.println("Addition (5 + 3): " + MathUtils.add(5, 3));
        System.out.println("Subtraction (5 - 3): " + MathUtils.subtract(5, 3));
        System.out.println("Multiplication (5 * 3): " + MathUtils.multiply(5, 3));
        System.out.println("Division (6 / 3): " + MathUtils.divide(6, 3));

        // Edge cases
        System.out.println("Division by zero (6 / 0): " + MathUtils.divide(6, 0));
        System.out.println("Addition with negatives (-5 + 3): " + MathUtils.add(-5, 3));
        System.out.println("Subtraction resulting in negative (3 - 5): " + MathUtils.subtract(3, 5));
    }
}
