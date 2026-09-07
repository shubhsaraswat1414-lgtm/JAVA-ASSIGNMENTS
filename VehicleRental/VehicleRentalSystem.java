package VehicleRental;

import java.util.Scanner;

// =============================================================================
// Parent Class: Vehicle
// =============================================================================
class Vehicle {
    // Private data members (Encapsulation)
    private String vehicleNumber;
    private String vehicleModel;
    private String customerName;
    private int rentalDays;
    private double ratePerDay;
    private String vehicleType;

    // Parameterized Constructor using 'this' keyword
    public Vehicle(String vehicleType, String vehicleNumber, String vehicleModel, String customerName, int rentalDays, double ratePerDay) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }

    // Getters and Setters
    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRentalDays() {
        return this.rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRatePerDay() {
        return this.ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    // Method to calculate rental charges: Rental Days * Rate Per Day
    public double calculateRentalCharges() {
        return this.rentalDays * this.ratePerDay;
    }

    // Method to display common vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type   : " + this.vehicleType);
        System.out.println("Vehicle Number : " + this.vehicleNumber);
        System.out.println("Model          : " + this.vehicleModel);
        System.out.println("Customer Name  : " + this.customerName);
        System.out.println("Rental Days    : " + this.rentalDays);
        System.out.printf("Rate Per Day   : ₹%.0f\n", this.ratePerDay);
    }

    // Method to print complete rental receipt
    public void printReceipt() {
        System.out.println("\n===== Vehicle Rental Receipt =====");
        displayDetails();
        System.out.printf("Total Amount   : ₹%.0f\n", calculateRentalCharges());
        System.out.println("Vehicle rented successfully.\n");
    }
}

// =============================================================================
// Child Class: Car (extends Vehicle)
// Unique Property: numberOfSeats
// Rate: ₹1500 / day
// =============================================================================
class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String vehicleNumber, String vehicleModel, String customerName, int rentalDays, int numberOfSeats) {
        super("Car", vehicleNumber, vehicleModel, customerName, rentalDays, 1500.0);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + this.numberOfSeats);
    }
}

// =============================================================================
// Child Class: Bike (extends Vehicle)
// Unique Property: engineCapacity (in cc)
// Rate: ₹700 / day
// =============================================================================
class Bike extends Vehicle {
    private int engineCapacity; // in cc

    public Bike(String vehicleNumber, String vehicleModel, String customerName, int rentalDays, int engineCapacity) {
        super("Bike", vehicleNumber, vehicleModel, customerName, rentalDays, 700.0);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + this.engineCapacity + " cc");
    }
}

// =============================================================================
// Child Class: Scooter (extends Vehicle)
// Unique Property: storageCapacity (in Liters)
// Rate: ₹500 / day
// =============================================================================
class Scooter extends Vehicle {
    private double storageCapacity; // in Liters

    public Scooter(String vehicleNumber, String vehicleModel, String customerName, int rentalDays, double storageCapacity) {
        super("Scooter", vehicleNumber, vehicleModel, customerName, rentalDays, 500.0);
        this.storageCapacity = storageCapacity;
    }

    public double getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Storage Capacity: " + this.storageCapacity + " L");
    }
}

// =============================================================================
// Child Class (Additional Task): ElectricCar (extends Vehicle)
// Unique Property: batteryCapacity (in kWh)
// Rate: ₹2000 / day
// =============================================================================
class ElectricCar extends Vehicle {
    private double batteryCapacity; // in kWh

    public ElectricCar(String vehicleNumber, String vehicleModel, String customerName, int rentalDays, double batteryCapacity) {
        super("ElectricCar", vehicleNumber, vehicleModel, customerName, rentalDays, 2000.0);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + this.batteryCapacity + " kWh");
    }
}

// =============================================================================
// Main Class: VehicleRentalSystem
// =============================================================================
public class VehicleRentalSystem {

    private static Vehicle currentRental = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("=========================================");
        System.out.println("  WELCOME TO VEHICLE RENTAL SYSTEM");
        System.out.println("=========================================");

        while (true) {
            System.out.println("===== Vehicle Rental System =====");
            System.out.println("1. Rent a Car (₹1500/day)");
            System.out.println("2. Rent a Bike (₹700/day)");
            System.out.println("3. Rent a Scooter (₹500/day)");
            System.out.println("4. Rent an Electric Car (₹2000/day) [Additional Task]");
            System.out.println("5. Display Rental Details");
            System.out.println("6. Calculate Rental Charges");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 7.\n");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    rentCar(scanner);
                    break;
                case 2:
                    rentBike(scanner);
                    break;
                case 3:
                    rentScooter(scanner);
                    break;
                case 4:
                    rentElectricCar(scanner);
                    break;
                case 5:
                    displayCurrentRentalDetails();
                    break;
                case 6:
                    displayCurrentRentalCalculation();
                    break;
                case 7:
                    System.out.println("\nThank you for using the Vehicle Rental Management System! Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose an option from 1 to 7.\n");
            }
        }
    }

    // Method to handle renting a Car
    private static void rentCar(Scanner scanner) {
        System.out.println("\n--- Rent a Car ---");
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter Rental Days: ");
        int rentalDays = readPositiveInt(scanner);

        System.out.print("Enter Number of Seats: ");
        int numberOfSeats = readPositiveInt(scanner);

        currentRental = new Car(vehicleNumber, model, customerName, rentalDays, numberOfSeats);
        currentRental.printReceipt();
    }

    // Method to handle renting a Bike
    private static void rentBike(Scanner scanner) {
        System.out.println("\n--- Rent a Bike ---");
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter Rental Days: ");
        int rentalDays = readPositiveInt(scanner);

        System.out.print("Enter Engine Capacity (in cc): ");
        int engineCapacity = readPositiveInt(scanner);

        currentRental = new Bike(vehicleNumber, model, customerName, rentalDays, engineCapacity);
        currentRental.printReceipt();
    }

    // Method to handle renting a Scooter
    private static void rentScooter(Scanner scanner) {
        System.out.println("\n--- Rent a Scooter ---");
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter Rental Days: ");
        int rentalDays = readPositiveInt(scanner);

        System.out.print("Enter Storage Capacity (in Liters): ");
        double storageCapacity = readPositiveDouble(scanner);

        currentRental = new Scooter(vehicleNumber, model, customerName, rentalDays, storageCapacity);
        currentRental.printReceipt();
    }

    // Method to handle renting an Electric Car (Additional Task)
    private static void rentElectricCar(Scanner scanner) {
        System.out.println("\n--- Rent an Electric Car ---");
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter Rental Days: ");
        int rentalDays = readPositiveInt(scanner);

        System.out.print("Enter Battery Capacity (in kWh): ");
        double batteryCapacity = readPositiveDouble(scanner);

        currentRental = new ElectricCar(vehicleNumber, model, customerName, rentalDays, batteryCapacity);
        currentRental.printReceipt();
    }

    // Method to display current rental details
    private static void displayCurrentRentalDetails() {
        if (currentRental == null) {
            System.out.println("\n[!] No active rental record found. Please rent a vehicle first.\n");
            return;
        }
        System.out.println("\n===== Active Vehicle Rental Details =====");
        currentRental.displayDetails();
        System.out.println("=========================================\n");
    }

    // Method to display calculated rental charges
    private static void displayCurrentRentalCalculation() {
        if (currentRental == null) {
            System.out.println("\n[!] No active rental record found. Please rent a vehicle first.\n");
            return;
        }
        System.out.println("\n===== Rental Charge Calculation =====");
        System.out.println("Vehicle Type  : " + currentRental.getVehicleType());
        System.out.println("Customer Name : " + currentRental.getCustomerName());
        System.out.println("Rental Days   : " + currentRental.getRentalDays());
        System.out.printf("Rate Per Day  : ₹%.0f\n", currentRental.getRatePerDay());
        System.out.printf("Formula       : %d days * ₹%.0f/day\n", currentRental.getRentalDays(), currentRental.getRatePerDay());
        System.out.printf("Total Charges : ₹%.0f\n", currentRental.calculateRentalCharges());
        System.out.println("=====================================\n");
    }

    // Helper method to read positive integers safely
    private static int readPositiveInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (val > 0) {
                    return val;
                } else {
                    System.out.print("Value must be greater than 0. Please re-enter: ");
                }
            } else {
                System.out.print("Invalid integer. Please re-enter: ");
                scanner.nextLine();
            }
        }
    }

    // Helper method to read positive doubles safely
    private static double readPositiveDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                if (val > 0) {
                    return val;
                } else {
                    System.out.print("Value must be greater than 0. Please re-enter: ");
                }
            } else {
                System.out.print("Invalid number. Please re-enter: ");
                scanner.nextLine();
            }
        }
    }
}
