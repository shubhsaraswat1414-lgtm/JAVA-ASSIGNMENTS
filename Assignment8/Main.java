package Assignment8;

import Assignment8.cab.booking.CabBooking;
import Assignment8.cab.booking.CabBooking.BookingConfirmation;
import Assignment8.cab.booking.CabBooking.CabType;

import java.util.Scanner;

/**
 * Driver class for Assignment 8: Smart Cab Booking System.
 *
 * Demonstrates:
 * - Importing classes from user-defined package 'cab.booking'
 * - Enum CabType usage
 * - Wrapper Classes with Autoboxing and Unboxing
 * - Inner Class (PickupLocation) instantiation
 * - Anonymous Class for booking confirmation
 * - StringBuilder for booking summary
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =====================================================================
        // 1. Accept User Input
        // =====================================================================
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Cab Type (MINI, SEDAN, SUV): ");
        String cabInput = sc.next().trim().toUpperCase();
        CabType cabType = CabType.valueOf(cabInput);

        System.out.print("Enter Base Fare: ");
        double rawFare = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Pickup Location: ");
        String location = sc.nextLine().trim();

        // =====================================================================
        // 2. Demonstration of Autoboxing & Unboxing
        // =====================================================================
        // Autoboxing: Primitive int -> Wrapper Integer
        int rawId = 101;
        Integer passengerId = rawId;

        // Autoboxing: Primitive double -> Wrapper Double
        Double baseFare = rawFare;

        // Unboxing: Wrapper Double -> Primitive double (used in primitive validation check)
        double unboxedFare = baseFare;
        if (unboxedFare < 0) {
            System.out.println("Fare cannot be negative.");
            sc.close();
            return;
        }

        // =====================================================================
        // 3. Create Booking Object from Package cab.booking
        // =====================================================================
        CabBooking booking = new CabBooking(passengerId, name, cabType, baseFare);

        // =====================================================================
        // 4. Inner Class: Instantiate & Store Pickup Location
        // =====================================================================
        CabBooking.PickupLocation pickup = booking.new PickupLocation(location);
        booking.setPickupLocation(pickup);

        // =====================================================================
        // 5. Build & Display Summary using StringBuilder
        // =====================================================================
        System.out.println("\n" + booking.buildSummary());

        // =====================================================================
        // 6. Anonymous Class: Booking Confirmation Message
        // =====================================================================
        BookingConfirmation confirmation = new BookingConfirmation() {
            @Override
            public void confirm() {
                System.out.println("Booking confirmed successfully.");
            }
        };
        confirmation.confirm();

        sc.close();
    }
}
