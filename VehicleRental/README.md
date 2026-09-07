# Assignment 6: Vehicle Rental Management System

## 📌 Overview
The Vehicle Rental Management System implements an inheritance hierarchy in Java. A generalized `Vehicle` parent class is extended by specialized subclasses (`Car`, `Bike`, `Scooter`, and `ElectricCar`), each incorporating unique attributes, customized rates, and overridden display logic.

---

## 🎯 Concepts Covered
- **Inheritance (`extends`)**: Factoring common attributes and behaviors into a parent class (`Vehicle`) and deriving specialized child classes.
- **Constructor Chaining (`super`)**: Passing common state up to the parent constructor while initializing subclass-specific fields with `this`.
- **Method Overriding (`@Override`)**: Overriding `displayDetails()` in subclasses to append unique properties while reusing parent presentation via `super.displayDetails()`.
- **Polymorphic Reference Handling**: Storing active rentals as a `Vehicle` superclass reference while dynamically executing subclass behaviors at runtime.

---

## 🚘 Vehicle Hierarchy & Rates

| Vehicle Type | Rate Per Day | Unique Property |
| :--- | :---: | :--- |
| **Car** | ₹1500 | `numberOfSeats` (e.g. 5 seats) |
| **Bike** | ₹700 | `engineCapacity` (e.g. 150 cc) |
| **Scooter** | ₹500 | `storageCapacity` (e.g. 22 Liters) |
| **ElectricCar** *(Additional Task)* | ₹2000 | `batteryCapacity` (e.g. 40.5 kWh) |

---

## 💻 Code Structure
- **Package**: `VehicleRental`
- **Classes**:
  - `Vehicle` *(Parent)*: Common fields (`vehicleNumber`, `vehicleModel`, `customerName`, `rentalDays`, `ratePerDay`, `vehicleType`), calculation formula (`rentalDays * ratePerDay`), and receipt formatting.
  - `Car extends Vehicle`: Adds `numberOfSeats`.
  - `Bike extends Vehicle`: Adds `engineCapacity`.
  - `Scooter extends Vehicle`: Adds `storageCapacity`.
  - `ElectricCar extends Vehicle`: Adds `batteryCapacity`.
  - `VehicleRentalSystem`: Main class with interactive menu loop and input validation.

---

## 🖥️ Receipt Output
<img width="484" height="516" alt="image" src="https://github.com/user-attachments/assets/b1900300-618f-4570-ba8c-0605cd37f651" />
<img width="465" height="470" alt="image" src="https://github.com/user-attachments/assets/99ad563e-8a34-401c-84e5-7c76cf710a7a" />
<img width="510" height="469" alt="image" src="https://github.com/user-attachments/assets/b3c961a4-103d-4097-a2a1-b284901d0c4d" />
<img width="498" height="471" alt="image" src="https://github.com/user-attachments/assets/ce0cd256-e9d2-462e-bb0a-b87cdb112178" />
<img width="474" height="316" alt="image" src="https://github.com/user-attachments/assets/9aab6e71-31e6-4d54-bbcc-e157dd7bb72b" />
<img width="479" height="296" alt="image" src="https://github.com/user-attachments/assets/b1ae4fb5-c83c-4d57-aa3a-889242e307bc" />
<img width="583" height="196" alt="image" src="https://github.com/user-attachments/assets/270c610a-7f13-4c27-abfe-8aee3fc55807" />


---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac VehicleRental/VehicleRentalSystem.java

# Run
java VehicleRental.VehicleRentalSystem
```
