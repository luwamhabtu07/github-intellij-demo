package com.example.githubintellijdemo;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for percentage input
        System.out.print("Enter your percentage (0.0 - 100.0): ");
        double percent = scanner.nextDouble();

        // Validate percentage range
        if (percent < 0.0 || percent > 100.0) {
            System.out.println("Invalid percentage. Please enter a value between 0.0 and 100.0.");
            return;
        }

        // Determine GPA using if-else statements
        double gpa;
        if (percent >= 95.0) gpa = 4.0;
        else if (percent >= 94.0) gpa = 3.9;
        else if (percent >= 93.0) gpa = 3.8;
        else if (percent >= 92.0) gpa = 3.7;
        else if (percent >= 91.0) gpa = 3.6;
        else if (percent >= 90.0) gpa = 3.5;
        else if (percent >= 89.0) gpa = 3.4;
        else if (percent >= 88.0) gpa = 3.3;
        else if (percent >= 87.0) gpa = 3.2;
        else if (percent >= 86.0) gpa = 3.1;
        else if (percent >= 85.0) gpa = 3.0;
        else if (percent >= 84.0) gpa = 2.9;
        else if (percent >= 83.0) gpa = 2.8;
        else if (percent >= 82.0) gpa = 2.7;
        else if (percent >= 81.0) gpa = 2.6;
        else if (percent >= 80.0) gpa = 2.5;
        else gpa = 0.0;

        // Output the GPA
        System.out.println("Your GPA is: " + gpa);
    }
}
