import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for GPA input
        System.out.print("Enter your GPA (0.0 - 4.0): ");
        double gpa = scanner.nextDouble();

        // Validate GPA range
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");
            return;
        }

        // Determine percentage range using Switch-like logic
        String percentRange;
        switch ((int) (gpa * 10)) {
            case 40:
                percentRange = "100% to 95.0%";
                break;
            case 39:
                percentRange = "95.0% to 94.0%";
                break;
            case 38:
                percentRange = "94.0% to 93.0%";
                break;
            case 37:
                percentRange = "93.0% to 92.0%";
                break;
            case 36:
                percentRange = "92.0% to 91.0%";
                break;
            case 35:
                percentRange = "91.0% to 90.0%";
                break;
            case 34:
                percentRange = "90.0% to 89.0%";
                break;
            case 33:
                percentRange = "89.0% to 88.0%";
                break;
            case 32:
                percentRange = "88.0% to 87.0%";
                break;
            case 31:
                percentRange = "87.0% to 86.0%";
                break;
            case 30:
                percentRange = "86.0% to 85.0%";
                break;
            default:
                percentRange = "<65.0% to 0.0%";
                break;
        }

        // Output the percentage range
        System.out.println("Your percentage range is: " + percentRange);
    }
}
