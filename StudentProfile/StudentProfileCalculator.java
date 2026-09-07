package StudentProfile;

public class StudentProfileCalculator {
    public static void main(String[] args) {
        // ==========================================
        // 1. Student Profile Data Declaration
        // ==========================================
        String name = "Ankitraj Jha";
        int rollNo = 50;
        String course = "B.Tech Computer Engineering";
        String year = "Second Year";

        // ==========================================
        // 2. Calculator Data & Arithmetic Operations
        // ==========================================
        int firstNumber = 25;
        int secondNumber = 10;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber; // Type casting for decimal precision

        // ==========================================
        // 3. Display Formatted Output
        // ==========================================

        // Student Profile Section
        System.out.println("===== Student Profile =====");
        System.out.println("Name            : " + name);
        System.out.println("Roll No         : " + rollNo);
        System.out.println("Course          : " + course);
        System.out.println("Year            : " + year);
        System.out.println();

        // Calculator Section
        System.out.println("===== Calculator =====");
        System.out.println("First Number    : " + firstNumber);
        System.out.println("Second Number   : " + secondNumber);
        System.out.println();
        System.out.println("Addition        : " + addition);
        System.out.println("Subtraction     : " + subtraction);
        System.out.println("Multiplication  : " + multiplication);
        System.out.println("Division        : " + division);
    }
}
