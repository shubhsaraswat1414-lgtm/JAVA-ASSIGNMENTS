# Assignment 5: Hotel Room Booking System

## 📌 Overview
The Hotel Room Booking System demonstrates Object-Oriented Programming (OOP) principles in Java, focusing on encapsulation, data hiding, parameterized constructors, object reference manipulation, and static tracking.

---

## 🎯 Concepts Covered
- **Encapsulation & Access Modifiers**: Data members are declared `private` and accessed via `public` getters and setters.
- **Constructors & `this` Keyword**: Parameterized constructor disambiguating instance variables from method arguments.
- **Static Members**: `totalBookings` static variable tracking cumulative room reservations across the hotel.
- **Business Logic**: Booking verification (preventing double-booking), total billing calculations, and formatted receipt generation.

---

## 💻 Code Structure
- **Package**: `HotelBooking`
- **Classes**:
  - `Room`: Encapsulated room model (`roomNumber`, `roomType`, `customerName`, `numberOfDays`, `pricePerDay`, `isBooked`, `totalBookings`).
    - `bookRoom(customerName, numberOfDays)`: Books an available room and increments static booking counter.
    - `calculateBill()`: Computes total room charges.
    - `displayDetails()`: Displays room info and status.
  - `HotelRoomBookingSystem`: Main driver class providing an interactive menu interface.

---

## 🖥️ Menu
<img width="387" height="464" alt="image" src="https://github.com/user-attachments/assets/80cdf03b-8583-4324-9d7a-52bf956a4669" />

<img width="415" height="333" alt="image" src="https://github.com/user-attachments/assets/ed475815-573a-4e0c-b338-8275be5653f7" />

<img width="403" height="205" alt="image" src="https://github.com/user-attachments/assets/72aac28b-1c91-4b94-aa3c-c3589b958c84" />

<img width="516" height="286" alt="image" src="https://github.com/user-attachments/assets/a027167a-df96-40c6-9a56-253aa3b54177" />

<img width="626" height="198" alt="image" src="https://github.com/user-attachments/assets/a45b56a8-d7f8-4a9c-b94f-ce37d15da6db" />

<img width="431" height="207" alt="image" src="https://github.com/user-attachments/assets/a6dc6818-6225-4b0c-aad2-9545876f3765" />

<img width="486" height="179" alt="image" src="https://github.com/user-attachments/assets/2aad580c-2e91-4f06-94d1-231abd72fe6a" />


---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac HotelBooking/HotelRoomBookingSystem.java

# Run
java HotelBooking.HotelRoomBookingSystem
```
