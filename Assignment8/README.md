# Assignment 8: Smart Cab Booking System

##  Overview
The Smart Cab Booking System is a Java console application developed for **Unit 4: Packages & Advanced OOP Concepts**. It demonstrates packaging, wrapper classes, autoboxing and unboxing, enums, final variables, string manipulation with `StringBuilder`, member inner classes, and anonymous classes.

The program accepts the passenger name, cab type, base fare, and pickup location, computes the final fare by adding a fixed booking fee, builds a formatted booking summary, and confirms the booking via an anonymous class.

---

##  Concepts Covered

1. **User-Defined Package & Imports (`package cab.booking`)**:
   - Organizes core domain logic inside the package `cab.booking`.
   - Accesses package members from a separate driver file using `import cab.booking.CabBooking;`.

2. **Enums (`enum CabType`)**:
   - Represents the cab selection (`MINI`, `SEDAN`, `SUV`) using type-safe enum constants.

3. **Wrapper Classes, Autoboxing & Unboxing**:
   - Uses `Integer` for passenger ID and `Double` for fares instead of primitive types.
   - **Autoboxing**: Assigns primitive values to wrapper references (`Integer passengerId = rawId;`, `Double baseFare = rawFare;`).
   - **Unboxing**: Uses wrapper objects in primitive contexts (`double unboxedFare = baseFare;`, and arithmetic evaluation `baseFare + bookingFee`).

4. **Final Variable**:
   - Declares the booking fee (`bookingFee = 50.0`) as `final` so it cannot be modified after initialization.

5. **`StringBuilder` for Summary Construction**:
   - Constructs and formats the booking summary string using `StringBuilder.append()` instead of concatenating strings with `+`.

6. **Member Inner Class (`PickupLocation`)**:
   - Nested inside `CabBooking` to encapsulate and display the passenger's pickup location.
   - Instantiated through the outer object reference: `booking.new PickupLocation(location)`.

7. **Anonymous Class (`BookingConfirmation`)**:
   - Implements the `BookingConfirmation` interface on the fly to display `"Booking confirmed successfully."`.

---

##  Code Structure

```
Assignment8/
├── cab/
│   └── booking/
│       └── CabBooking.java    # Package class containing CabBooking, CabType enum,
│                              # BookingConfirmation interface, and PickupLocation inner class
├── Main.java                  # Driver class with user input, autoboxing/unboxing, & anonymous class
└── README.md                  # Documentation and execution guide
```

---

##  Sample Console Interaction

```text
Enter Passenger Name: Apeksha
Enter Cab Type (MINI, SEDAN, SUV): SEDAN
Enter Base Fare: 500
Enter Pickup Location: Mumbai

===== Smart Cab Booking System =====
Passenger Name: Apeksha
Cab Type: SEDAN
Base Fare: ₹500
Booking Fee: ₹50
Final Fare: ₹550
Pickup Location: Mumbai
Booking confirmed successfully.
```

---

##  How to Compile & Run

### From the `Assignment8` Directory:

```bash
cd Assignment8

# Compile
javac cab/booking/CabBooking.java Main.java

# Run
java Main
```

### From Repository Root:

```bash
# Compile
javac Assignment8/cab/booking/CabBooking.java Assignment8/Main.java

# Run
java Assignment8.Main
```
