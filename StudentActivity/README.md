# Assignment 2: Student Activity Management System

## 📌 Overview
The Student Activity Management System is an interactive, menu-driven command-line application that allows students/administrators to check attendance eligibility criteria for examinations and determine academic performance categories.

---

## 🎯 Concepts Covered
- **Control Flow Statements**: Conditional branching with `if-else` and `switch-case`.
- **Looping Constructs**: Continuous menu interaction using `while (isRunning)` loops.
- **Console Input Handling**: Safe user input parsing and validation using `java.util.Scanner`.
- **Threshold & Range Logic**: Evaluating percentage ranges for grading categories (Distinction, First Class, Second Class, Pass, Fail).

---

## 💻 Code Structure
- **Class**: `StudentActivityManagementSystem`
- **Package**: `StudentActivity`
- **Menu Features**:
  1. **Check Attendance Eligibility**: Evaluates whether total attendance percentage satisfies the minimum 75% threshold required to appear for exams.
  2. **View Performance Category**: Categorizes marks percentage into academic tiers (e.g., Distinction >= 75%, First Class >= 60%, etc.).
  3. **Exit**: Gracefully exits the application loop.

---

## 🖥️ Menu

<img width="485" height="411" alt="image" src="https://github.com/user-attachments/assets/90b3e7bd-06c0-497b-9965-cb856756ff50" />


---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac StudentActivity/StudentActivityManagementSystem.java

# Run
java StudentActivity.StudentActivityManagementSystem
```
