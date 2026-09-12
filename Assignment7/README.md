# Assignment 7: E-commerce Coupon Validator

## 📌 Overview
The E-commerce Coupon Validator is a Java application designed to demonstrate custom exception handling and conditional business logic. It validates discount coupons applied to customer orders, enforces minimum purchase requirements, calculates discounts and final payable amounts, and raises a custom checked exception (`InvalidCouponException`) when coupon validation fails.

---

## 🎯 Concepts Covered
- **Custom Exception Handling**: Creating domain-specific checked exceptions by extending `java.lang.Exception` (`InvalidCouponException`).
- **Throwing Exceptions (`throw`)**: Explicitly generating and throwing custom exceptions when business validation rules fail.
- **Exception Propagation (`throws`)**: Declaring exceptions in method signatures to propagate errors to the caller.
- **Error Handling with `try-catch-finally`**:
  - `try`: Executes critical validation logic that may raise an exception.
  - `catch`: Intercepts `InvalidCouponException` and displays meaningful error messages without crashing the program.
  - `finally`: Executes cleanup and status messages unconditionally after validation.
- **Interactive Control Flow**: Utilizing `java.util.Scanner` with a `while` loop to support repetitive transactions until the user exits.

---

## 🏷️ Coupon Rules & Discounts

| Coupon Code | Minimum Order Amount | Discount Rate | Description |
| :--- | :---: | :---: | :--- |
| **`SAVE10`** | ₹1,000 | 10% | 10% discount on orders of ₹1,000 or more |
| **`SAVE20`** | ₹2,000 | 20% | 20% discount on orders of ₹2,000 or more |
| **`SAVE30`** | ₹3,000 | 30% | 30% discount on orders of ₹3,000 or more |
| *Other / Below Min* | — | 0% | Throws `InvalidCouponException` ("Invalid coupon or minimum order not met.") |

---

## 💻 Code Structure
- **Package**: `Assignment7`
- **Class**: `Ecommerce_coupon_validator`
- **Static Nested Exception Class**:
  - `InvalidCouponException extends Exception`: Custom exception storing and passing custom error messages.
- **Key Methods**:
  - `static void validate(double amount, String code) throws InvalidCouponException`: Validates coupon code and minimum order threshold, calculates applicable discount, and displays the final amount.
  - `public static void main(String[] args)`: Drives the interactive console loop, accepts input, and handles exceptions using `try-catch-finally`.

---

## 🖥️ Sample Console Interaction

### Valid Coupon Execution
```text
Enter order amount: 1500
Enter coupon code: SAVE10
Discount: ₹150.0
Final amount: ₹1350.0
Coupon validation completed.
Continue? (yes/no): yes
```

### Higher Tier Coupon Execution
```text
Enter order amount: 2500
Enter coupon code: SAVE20
Discount: ₹500.0
Final amount: ₹2000.0
Coupon validation completed.
Continue? (yes/no): yes
```

### Invalid Coupon / Threshold Not Met (Exception Caught)
```text
Enter order amount: 500
Enter coupon code: SAVE10
Invalid coupon or minimum order not met.
Coupon validation completed.
Continue? (yes/no): no
```
<img width="634" height="194" alt="Screenshot 2026-09-12 at 1 19 37 PM" src="https://github.com/user-attachments/assets/a16a85cc-fb57-4372-ab73-f884bcff4618" />

---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac Assignment7/Ecommerce_coupon_validator.java

# Run
java Assignment7.Ecommerce_coupon_validator
```
