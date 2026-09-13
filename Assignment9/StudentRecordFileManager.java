package Assignment9;

import java.io.*;
import java.util.Scanner;

public class StudentRecordFileManager {

    private static final String DIR_NAME = "StudentRecords";
    private static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File dir = new File(DIR_NAME);
        File file = new File(dir, FILE_NAME);
        int choice = 0;

        do {
            System.out.println("\n===== Student Record File Manager =====");
            System.out.println("1. Create Records Directory");
            System.out.println("2. Create Record File");
            System.out.println("3. Write Student Record");
            System.out.println("4. Display File Information");
            System.out.println("5. Read File Content");
            System.out.println("6. Append New Record");
            System.out.println("7. Delete Record File");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createDirectory(dir);
                    break;
                case 2:
                    createRecordFile(dir, file);
                    break;
                case 3:
                    writeStudentRecord(file, scanner);
                    break;
                case 4:
                    displayFileInfo(file);
                    break;
                case 5:
                    readFileContent(file);
                    break;
                case 6:
                    appendStudentRecord(file, scanner);
                    break;
                case 7:
                    deleteRecordFile(file);
                    break;
                case 8:
                    System.out.println("Exiting Student Record File Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 8.");
            }
        } while (choice != 8);

        scanner.close();
    }

    private static void createDirectory(File dir) {
        try {
            if (dir.exists()) {
                System.out.println("Directory already exists: " + dir.getName());
            } else {
                if (dir.mkdir()) {
                    System.out.println("Directory created: " + dir.getName());
                } else {
                    System.out.println("Failed to create directory: " + dir.getName());
                }
            }
        } catch (SecurityException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    private static void createRecordFile(File dir, File file) {
        try {
            if (!dir.exists()) {
                dir.mkdir();
            }
            if (file.exists()) {
                System.out.println("File already exists: " + file.getPath());
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getPath());
                } else {
                    System.out.println("Failed to create file: " + file.getPath());
                }
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    private static void writeStudentRecord(File file, Scanner scanner) {
        System.out.print("Enter Student Record (e.g., Roll No 101, Rahul Sharma, B.Tech CE): ");
        String record = scanner.nextLine();
        try {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdir();
            }
            FileOutputStream fos = new FileOutputStream(file);
            String dataWithNewline = record + System.lineSeparator();
            fos.write(dataWithNewline.getBytes());
            fos.close();
            System.out.println("Record written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void displayFileInfo(File file) {
        if (!file.exists()) {
            System.out.println("Record file does not exist. Please create or write records first.");
            return;
        }
        System.out.println("===== File Information =====");
        System.out.println("Name          : " + file.getName());
        System.out.println("Path          : " + file.getPath());
        System.out.println("Absolute Path : " + file.getAbsolutePath());
        System.out.println("Size          : " + file.length() + " bytes");
        System.out.println("Is File       : " + file.isFile());
        System.out.println("Is Directory  : " + file.isDirectory());
    }

    private static void readFileContent(File file) {
        if (!file.exists()) {
            System.out.println("Record file does not exist. Please create or write records first.");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.println("===== File Content =====");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void appendStudentRecord(File file, Scanner scanner) {
        System.out.print("Enter Student Record to Append (e.g., Roll No 102, Priya Verma, B.Tech IT): ");
        String record = scanner.nextLine();
        try {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdir();
            }
            FileOutputStream fos = new FileOutputStream(file, true);
            String dataWithNewline = record + System.lineSeparator();
            fos.write(dataWithNewline.getBytes());
            fos.close();
            System.out.println("Record appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    private static void deleteRecordFile(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist. Nothing to delete.");
            return;
        }
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
