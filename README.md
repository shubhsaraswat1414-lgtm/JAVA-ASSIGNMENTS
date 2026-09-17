# Java Assignments

A curated repository of Java Programming assignments and projects.

### 👤 Student Details

- **Name**: Ankitraj Jha
- **Roll No**: 50
- **Course**: B.Tech Computer Engineering
- **Year**: Second Year

---

## 📁 Repository Structure

```
.
├── StudentProfile/          # Assignment 1: Student Profile & Calculator
│   └── StudentProfileCalculator.java
├── StudentActivity/         # Assignment 2: Student Activity Management
│   └── StudentActivityManagementSystem.java
├── FoodDeliveryRating/      # Assignment 3: Food Delivery Rating Analyzer
│   └── foodDelivery_RatingAnalyzer.java
├── StudentMarks/            # Assignment 4: Student Marks Management
│   └── StudentMarksManagementSystem.java
├── HotelBooking/            # Assignment 5: Hotel Room Booking System
│   └── HotelRoomBookingSystem.java
├── VehicleRental/           # Assignment 6: Vehicle Rental Management
│   └── VehicleRentalSystem.java
├── Assignment7/             # Assignment 7: E-commerce Coupon Validator
│   └── Ecommerce_coupon_validator.java
├── Assignment8/             # Assignment 8: Smart Cab Booking System
│   ├── cab/booking/CabBooking.java
│   └── Main.java
├── Assignment9/             # Assignment 9: Student Record File Manager
│   ├── StudentRecordFileManager.java
│   └── Main.java
├── Assignment10/            # Assignment 10: Student Course Enrollment Manager
│   ├── Assignment10.java
│   └── Main.java
├── Assignment11/            # Assignment 11: Product Inventory Management System
│   ├── Assignment11.java
│   └── Main.java
├── Assignment12/            # Assignment 12: Multi-Counter Ticket Booking Simulator
│   ├── Assignment12.java
│   └── Main.java
├── Assignment13/            # Assignment 13: Swing-Based Student Feedback Form
│   ├── assignment13.java
│   └── Main.java
├── Assignment14/            # Assignment 14: Student Marks Viewer (JTable, MVC, JavaFX)
│   ├── assignment14.java
│   └── Main.java
└── Mini-PROJECT/            # Mini Project: Warehouse Inventory Tracker
    └── WarehouseInventoryTracker.java
```

---

## 🚀 Assignments Overview

### 1. Java Fundamentals — Student Profile & Basic Calculator (`StudentProfile`)

- **Concepts**: Primitive Data Types (`String`, `int`, `double`), Arithmetic Operators (`+`, `-`, `*`, `/`), Explicit Type Casting for decimal precision.
- **Features**:
  - Displays formatted student profile (Name, Roll No, Course, Year).
  - Performs 4 basic arithmetic operations on two numbers.
  - Preserves decimal precision in division.
- **Source**: [`StudentProfile/StudentProfileCalculator.java`](StudentProfile/StudentProfileCalculator.java)

---

### 2. Student Activity Management System (`StudentActivity`)

- **Concepts**: Control Flow (`if-else`, `switch-case`), Loops (`while`), Safe Input Parsing (`java.util.Scanner`).
- **Features**:
  - Interactive menu-driven console application.
  - Attendance eligibility checker with strict range validation (0–100%).
  - Performance category classifier (Distinction, First Class, Second Class, Pass, Fail).
- **Source**: [`StudentActivity/StudentActivityManagementSystem.java`](StudentActivity/StudentActivityManagementSystem.java)

---

### 3. Food Delivery Rating Analyzer (`FoodDeliveryRating`)

- **Concepts**: Method Overloading, 1D & 2D Array Matrix Processing, Aggregation & Averages.
- **Features**:
  - Overloaded `calcTotal` and `calcAvg` methods for both 1D and 2D rating datasets.
  - Multi-criteria rating analysis across delivery partners and performance metrics.
  - Precision statistical computations with formatted tabular presentation.
- **Source**: [`FoodDeliveryRating/foodDelivery_RatingAnalyzer.java`](FoodDeliveryRating/foodDelivery_RatingAnalyzer.java)

---

### 4. Student Marks Management System (`StudentMarks`)

- **Concepts**: 2D Arrays (Matrices), Linear Search, Bubble Sort Algorithm, Formatted Tables (`printf`).
- **Features**:
  - Multi-subject academic records representation (5 students × 3 subjects).
  - Computes total marks, averages, and subject-wise highest scores.
  - Linear search to locate specific scores with student and subject identification.
  - Descending Bubble Sort on student totals while synchronizing student names.
- **Source**: [`StudentMarks/StudentMarksManagementSystem.java`](StudentMarks/StudentMarksManagementSystem.java)

---

### 5. Hotel Room Booking System (`HotelBooking`)

- **Concepts**: OOP Encapsulation (`private` fields, `public` getters/setters), Constructors & `this` keyword, Static Members.
- **Features**:
  - Encapsulated `Room` class representing hotel room entities.
  - Room booking validation preventing double-booking of occupied rooms.
  - Dynamic billing calculation with tax inclusion.
  - Static booking counter tracking total confirmed reservations across the hotel.
- **Source**: [`HotelBooking/HotelRoomBookingSystem.java`](HotelBooking/HotelRoomBookingSystem.java)

---

### 6. Vehicle Rental Management System (`VehicleRental`)

- **Concepts**: OOP Inheritance (`extends`), Constructor Chaining (`super`), Method Overriding (`@Override`), Polymorphism.
- **Features**:
  - Generalized parent class `Vehicle` extended by `Car`, `Bike`, `Scooter`, and `ElectricCar`.
  - Subclass-specific attributes (number of seats, engine capacity, storage, battery capacity).
  - Polymorphic rental calculations, input validation, and formatted receipt generation.
- **Source**: [`VehicleRental/VehicleRentalSystem.java`](VehicleRental/VehicleRentalSystem.java)

---

### 7. E-commerce Coupon Validator (`Assignment7`)

- **Concepts**: Custom Exception Handling (`extends Exception`), Throwing Exceptions (`throw`), Exception Propagation (`throws`), Robust Error Handling (`try-catch-finally`).
- **Features**:
  - Custom checked exception `InvalidCouponException`.
  - Tiered coupon code evaluation (`SAVE10`, `SAVE20`, `SAVE30`) tied to minimum purchase thresholds.
  - Unconditional `finally` execution reporting validation status.
  - Interactive console-driven loop for multiple validation transactions.
- **Source**: [`Assignment7/Ecommerce_coupon_validator.java`](Assignment7/Ecommerce_coupon_validator.java)

---

### 8. Smart Cab Booking System (`Assignment8`)

- **Concepts**: User-Defined Packages (`package cab.booking`), Enums (`enum CabType`), Wrapper Classes (`Integer`, `Double`), Autoboxing & Unboxing, Final Variables, String Manipulation (`StringBuilder`), Member Inner Classes, Anonymous Classes.
- **Features**:
  - Encapsulated booking model within `cab.booking` package imported into driver class.
  - Enum-driven cab selection (`MINI`, `SEDAN`, `SUV`).
  - Autoboxing and unboxing demonstrations with passenger ID and fare computations.
  - Immutable booking fee using `final Double`.
  - Memory-efficient booking summary generation via `StringBuilder`.
  - Member Inner Class `PickupLocation` for passenger pickup location management.
  - Anonymous class implementing confirmation interface for booking completion.
- **Source**: [`Assignment8/cab/booking/CabBooking.java`](Assignment8/cab/booking/CabBooking.java) & [`Assignment8/Main.java`](Assignment8/Main.java)

### 9. File Handling — Student Record File Manager (`Assignment9`)

- **Concepts**: `File` class (`mkdir()`, `exists()`, `createNewFile()`, `delete()`, file metadata inspection), `FileOutputStream` (byte writing, append mode), `FileInputStream` (byte-by-byte streaming until `-1`), Exception Handling (`try-catch`, `IOException`).
- **Features**:
  - Sets up `StudentRecords` directory and checks file existence before creation.
  - Interactive repeated console menu for write, read, append, display info, and delete operations.
  - Inspects file metadata (`getName()`, `getPath()`, `getAbsolutePath()`, `length()`, `isFile()`, `isDirectory()`).
  - Appends student records safely using 2-argument `FileOutputStream` constructor.
- **Source**: [`Assignment9/StudentRecordFileManager.java`](Assignment9/StudentRecordFileManager.java) & [`Assignment9/Main.java`](Assignment9/Main.java)

### 10. Collections Framework — Student Course Enrollment Manager (`Assignment10`)

- **Concepts**: `ArrayList<String>` (indexed storage, `add`, `remove`, `contains`, `indexOf`), `LinkedList<String>` (waiting queue, `addLast`, `removeFirst`), Iteration (`for-each`, `Iterator`), Exception Handling (`NoSuchElementException`, `IndexOutOfBoundsException`).
- **Features**:
  - Interactive menu-driven console enrollment manager.
  - Enrolls students into `ArrayList` and manages queue using `LinkedList`.
  - Promotes waiting students directly from queue to enrollment list.
  - Searches students by name and reports 0-based index.
  - Safe error handling preventing crashes on empty collections.
- **Source**: [`Assignment10/Assignment10.java`](Assignment10/Assignment10.java) & [`Assignment10/Main.java`](Assignment10/Main.java)

### 11. Collections Framework — Product Inventory Management System (`Assignment11`)

- **Concepts**: `HashSet<String>` (unique unordered categories, duplicate ignoring), `TreeSet<Integer>` (unique automatically sorted product IDs, iterator traversal), `TreeMap<Integer, String>` (`put`, `get`, `entrySet`, `firstKey`, `lastKey`), `NavigableMap` range queries (`floorKey`, `ceilingKey`, `subMap`), Exception Handling (`NoSuchElementException`, `NumberFormatException`).
- **Features**:
  - Menu-driven inventory tracker managing product categories, IDs, and detailed specifications (name and price).
  - Demonstrates set uniqueness and tree sorting properties with iterative traversal.
  - Navigable map range search capabilities finding nearest ceiling/floor keys and sub-maps between arbitrary boundaries.
  - Safe error trapping preventing crashes on empty collections or absent keys.
- **Source**: [`Assignment11/Assignment11.java`](Assignment11/Assignment11.java) & [`Assignment11/Main.java`](Assignment11/Main.java)

### 12. Multithreading in Java — Multi-Counter Ticket Booking Simulator (`Assignment12`)

- **Concepts**: `Thread` class inheritance (`extends Thread`), `Runnable` interface implementation, Thread Synchronization (`synchronized`), Thread Priority (`setPriority()`), Thread Lifecycle & Inspection (`getName()`, `getPriority()`, `isAlive()`), Thread Coordination (`join()`, `Thread.sleep()`), Exception Handling (`InterruptedException`).
- **Features**:
  - Concurrent ticket selling simulation across multiple counter threads.
  - Synchronized shared ticket pool preventing race conditions and overselling.
  - Thread priority configuration and real-time thread state inspection.
  - Deterministic synchronization barrier using `join()` before displaying final summary.
- **Source**: [`Assignment12/Assignment12.java`](Assignment12/Assignment12.java) & [`Assignment12/Main.java`](Assignment12/Main.java)

### 13. GUI Programming with Swing — Student Feedback Form (`Assignment13`)

- **Concepts**: `JFrame`, Layout Managers (`BorderLayout`, `GridLayout`, `FlowLayout`), `ActionListener` event handling, Menus (`JMenuBar`, `JMenu`, `JMenuItem`), Dialog Boxes (`JOptionPane` showMessageDialog, showConfirmDialog), Exception Handling (`NumberFormatException`).
- **Features**:
  - Window structured with `BorderLayout` containing a `GridLayout` form, `JTextArea` inside a `JScrollPane`, and action buttons.
  - Menu bar featuring **File** (`Save Feedback`, `Clear Form`, `Exit`) and **Help** (`About`).
  - Shared action listener between GUI submit button and File > Save Feedback.
  - Input validation checking for empty required fields and numeric ratings (1–5) with error dialogs.
  - Exit confirmation dialog preventing accidental application closure.
- **Source**: [`Assignment13/assignment13.java`](Assignment13/assignment13.java) & [`Assignment13/Main.java`](Assignment13/Main.java)

### 14. Swing & JavaFX — Student Marks Viewer (`Assignment14`)

- **Concepts**: MVC Architecture, `JTable` with `DefaultTableModel`, `ActionListener` button controller events (`addRow`, `setValueAt`, `removeRow`), Class Average computation, Exception Handling (`ArrayIndexOutOfBoundsException`, `NumberFormatException`), JavaFX intro (`Stage`, `Scene`, `Label`, `Button`).
- **Features**:
  - Independent Model class `StudentMarks` holding roll number, name, and marks.
  - Interactive table displaying records with dynamic Add, Update, and Delete actions.
  - Automatic class average recalculation on record changes.
  - Guarded against unselected row actions with `ArrayIndexOutOfBoundsException` handling.
  - JavaFX preview window displaying class average.
- **Source**: [`Assignment14/assignment14.java`](Assignment14/assignment14.java) & [`Assignment14/Main.java`](Assignment14/Main.java)

---

## 🛠️ How to Compile & Run

### Option 1: VS Code (One-Click)

Open any assignment's `.java` file in VS Code and click the **Run (Play)** button in the top-right corner.

### Option 2: Terminal (From Repository Root)

```bash
# Compile all assignments
javac -d . */*.java Assignment8/cab/booking/*.java Assignment8/Main.java Assignment9/*.java Assignment10/*.java Assignment11/*.java Assignment12/*.java Assignment13/*.java Assignment14/*.java

# Run Assignment 1: Student Profile & Calculator
java StudentProfile.StudentProfileCalculator

# Run Assignment 2: Student Activity Management System
java StudentActivity.StudentActivityManagementSystem

# Run Assignment 3: Food Delivery Rating Analyzer
java FoodDeliveryRating.foodDelivery_RatingAnalyzer

# Run Assignment 4: Student Marks Management System
java StudentMarks.StudentMarksManagementSystem

# Run Assignment 5: Hotel Room Booking System
java HotelBooking.HotelRoomBookingSystem

# Run Assignment 6: Vehicle Rental Management System
java VehicleRental.VehicleRentalSystem

# Run Assignment 7: E-commerce Coupon Validator
java Assignment7.Ecommerce_coupon_validator

# Run Assignment 8: Smart Cab Booking System
java Assignment8.Main

# Run Assignment 9: Student Record File Manager
java Assignment9.Main

# Run Assignment 10: Student Course Enrollment Manager
java Assignment10.Assignment10

# Run Assignment 11: Product Inventory Management System
java Assignment11.Assignment11

# Run Assignment 12: Multi-Counter Ticket Booking Simulator
java Assignment12.Assignment12

# Run Assignment 13: Student Feedback Form
java Assignment13.assignment13

# Run Assignment 14: Student Marks Viewer
java Assignment14.assignment14

# Run Mini Project: Warehouse Inventory Tracker
java -cp Mini-PROJECT WarehouseInventoryTracker
```
