package StudentActivity;

import java.util.Scanner;

public class StudentActivityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n===== Student Activity Management System =====");
            System.out.println("1. Check Attendance Eligibility");
            System.out.println("2. View Performance Category");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number (1-3).");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter attendance percentage (0 - 100): ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input! Please enter a numeric attendance percentage.");
                        scanner.next();
                        continue;
                    }
                    double attendance = scanner.nextDouble();

                    // Attendance range validation
                    if (attendance < 0 || attendance > 100) {
                        System.out.println("Error: Attendance percentage must be between 0 and 100.");
                        continue;
                    }

                    // Attendance eligibility check
                    if (attendance >= 75.0) {
                        System.out.println("Status: Eligible to appear for the examination.");
                    } else {
                        System.out.println("Status: Not eligible to appear for the examination.");
                    }
                    break;

                case 2:
                    System.out.print("Enter student marks (0 - 100): ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input! Please enter numeric marks.");
                        scanner.next();
                        continue;
                    }
                    double marks = scanner.nextDouble();

                    // Marks range validation
                    if (marks < 0 || marks > 100) {
                        System.out.println("Error: Marks must be between 0 and 100.");
                        continue;
                    }

                    // Performance categorization
                    if (marks >= 90) {
                        System.out.println("Category: Excellent");
                    } else if (marks >= 70) {
                        System.out.println("Category: Good");
                    } else if (marks >= 60) {
                        System.out.println("Category: Average");
                    } else {
                        System.out.println("Category: Needs Improvement");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 3.");
                    continue;
            }
        }

        scanner.close();
    }
}
