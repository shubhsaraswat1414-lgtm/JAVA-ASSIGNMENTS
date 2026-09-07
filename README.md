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
└── VehicleRental/           # Assignment 6: Vehicle Rental Management
    └── VehicleRentalSystem.java
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

## 🛠️ How to Compile & Run

### Option 1: VS Code (One-Click)
Open any assignment's `.java` file in VS Code and click the **Run (Play)** button in the top-right corner.

### Option 2: Terminal (From Repository Root)

```bash
# Compile all assignments
javac -d . */*.java

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
```
