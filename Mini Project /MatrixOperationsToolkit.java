import java.util.Scanner;

public class MatrixOperationsToolkit {

    static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int totalElements = rows * cols;
        System.out.println("Enter " + totalElements + " numbers for the matrix in one line:");
        String line = sc.nextLine();
        while (line.trim().isEmpty()) line = sc.nextLine();

        String[] values = line.trim().split("\\s+");
        if (values.length == 1 && values[0].matches("-?\\d+")) {
            String digits = values[0].replaceAll("\\s+", "");
            if (digits.length() == totalElements && !digits.startsWith("-")) {
                for (int i = 0; i < totalElements; i++) {
                    matrix[i / cols][i % cols] = digits.charAt(i) - '0';
                }
                return matrix;
            }
        }

        for (int i = 0; i < totalElements && i < values.length; i++) {
            matrix[i / cols][i % cols] = Integer.parseInt(values[i]);
        }
        return matrix;
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + "\t");
            System.out.println();
        }
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================\n     MATRIX OPERATIONS TOOLKIT\n=================================");

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter Matrix A:");
        int[][] matrixA = inputMatrix(sc, rows, cols);

        System.out.println("\nEnter Matrix B:");
        int[][] matrixB = inputMatrix(sc, rows, cols);

        int choice;

        do {
            System.out.println("\n========== MENU ==========\n"
                + "1. Display Matrix A\n2. Display Matrix B\n3. Matrix Addition\n"
                + "4. Matrix Subtraction\n5. Matrix Multiplication\n"
                + "6. Transpose of Matrix A\n7. Transpose of Matrix B\n8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) { 

                case 1: System.out.println("\nMatrix A:"); displayMatrix(matrixA); break;
                case 2: System.out.println("\nMatrix B:"); displayMatrix(matrixB); break;
                case 3: System.out.println("\nA + B:"); displayMatrix(addMatrices(matrixA, matrixB)); break;
                case 4: System.out.println("\nA - B:"); displayMatrix(subtractMatrices(matrixA, matrixB)); break;

                case 5:
                    if (cols == rows) {
                        System.out.println("\nA × B:");
                        displayMatrix(multiplyMatrices(matrixA, matrixB));
                    } else {
                        System.out.println("Matrix multiplication requires compatible dimensions.");
                    }
                    break;
                

                case 6: System.out.println("\nTranspose of Matrix A:"); displayMatrix(transposeMatrix(matrixA)); break;
                case 7: System.out.println("\nTranspose of Matrix B:"); displayMatrix(transposeMatrix(matrixB)); break;

                case 8:
                    System.out.println("\nThank you for using Matrix Operations Toolkit!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}


