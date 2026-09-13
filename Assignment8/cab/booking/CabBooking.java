package Assignment8.cab.booking;

/**
 * Smart Cab Booking System - Core Class
 * Placed in user-defined package 'cab.booking'.
 *
 * Encapsulates:
 * - Enum CabType (MINI, SEDAN, SUV)
 * - BookingConfirmation interface (for anonymous class)
 * - PickupLocation (member inner class)
 * - Wrapper classes (Integer, Double) with autoboxing & unboxing
 * - Final variable for booking fee
 * - StringBuilder for constructing the booking summary
 */
public class CabBooking {

    // =========================================================================
    // 1. Enum: CabType
    // =========================================================================
    public enum CabType {
        MINI, SEDAN, SUV
    }

    // =========================================================================
    // 2. Interface for Anonymous Class Confirmation
    // =========================================================================
    public interface BookingConfirmation {
        void confirm();
    }

    // =========================================================================
    // 3. Member Inner Class: PickupLocation
    // =========================================================================
    /**
     * Inner class nested inside CabBooking to store and display pickup location.
     */
    public class PickupLocation {
        private String location;

        public PickupLocation(String location) {
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        public void displayLocation() {
            System.out.println("Pickup Location: " + location);
        }
    }

    // =========================================================================
    // 4. Instance Variables & Wrapper Classes
    // =========================================================================
    private Integer passengerId;    // Wrapper class for passenger ID
    private String passengerName;
    private CabType cabType;         // Enum
    private Double baseFare;         // Wrapper class for base fare
    private final Double bookingFee; // Final variable: fixed booking fee cannot be reassigned
    private Double finalFare;        // Wrapper class for final fare
    private PickupLocation pickupLocation; // Inner class instance

    // =========================================================================
    // 5. Constructor
    // =========================================================================
    public CabBooking(Integer passengerId, String passengerName, CabType cabType, Double baseFare) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.baseFare = baseFare;

        // Final variable: fixed booking fee of ₹50
        this.bookingFee = 50.0;

        // Demonstrating Unboxing & Autoboxing:
        // baseFare and bookingFee (Double wrappers) are unboxed to primitives for addition.
        // The resulting primitive double is autoboxed back into Double finalFare.
        this.finalFare = this.baseFare + this.bookingFee;
    }

    // =========================================================================
    // 6. Pickup Location Setter & Getter
    // =========================================================================
    public void setPickupLocation(PickupLocation pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public PickupLocation getPickupLocation() {
        return pickupLocation;
    }

    // =========================================================================
    // 7. Getters
    // =========================================================================
    public Integer getPassengerId() {
        return passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public CabType getCabType() {
        return cabType;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public Double getBookingFee() {
        return bookingFee;
    }

    public Double getFinalFare() {
        return finalFare;
    }

    // =========================================================================
    // 8. StringBuilder for Booking Summary
    // =========================================================================
    /**
     * Constructs the booking summary using StringBuilder instead of '+' concatenation.
     */
    public String buildSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Smart Cab Booking System =====\n");
        sb.append("Passenger Name: ").append(passengerName).append("\n");
        sb.append("Cab Type: ").append(cabType).append("\n");
        sb.append("Base Fare: ₹").append(formatFare(baseFare)).append("\n");
        sb.append("Booking Fee: ₹").append(formatFare(bookingFee)).append("\n");
        sb.append("Final Fare: ₹").append(formatFare(finalFare)).append("\n");
        if (pickupLocation != null) {
            sb.append("Pickup Location: ").append(pickupLocation.getLocation());
        }
        return sb.toString();
    }

    private String formatFare(Double fare) {
        if (fare == null) return "0";
        double val = fare; // Unboxing
        if (val == Math.floor(val) && !Double.isInfinite(val)) {
            return String.valueOf((long) val);
        }
        return String.format("%.2f", val);
    }
}
