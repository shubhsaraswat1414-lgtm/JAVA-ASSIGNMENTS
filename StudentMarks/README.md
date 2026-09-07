# Assignment 4: Student Marks Management System

## 📌 Overview
This system manages multi-subject academic records for students using 2D arrays. It implements comprehensive analytical capabilities, including total and average calculations, highest score detection, linear searching, and sorting via the Bubble Sort algorithm.

---

## 🎯 Concepts Covered
- **2-D Arrays (Matrices)**: Modeling 5 students across 3 subjects (`Java`, `Python`, `DBMS`).
- **1-D Arrays**: Accumulating and processing student totals.
- **Linear Search Algorithm**: Searching across the 2D mark matrix for a specific score and identifying which student and subject it belongs to.
- **Bubble Sort Algorithm**: Sorting total marks in descending order (highest to lowest) while preserving synchronized student name mappings.
- **Formatted Tabular Output**: Using `printf` with width specifiers (`%-12s`, `%-10d`) for clear table presentation.

---

## 💻 Code Structure
- **Class**: `StudentMarksManagementSystem`
- **Package**: `StudentMarks`
- **Key Methods**:
  - `displayAllMarks(int[][] marks, String[] students, String[] subjects)`: Prints tabular mark matrix.
  - `calculateTotals(int[][] marks)`: Returns 1D array of totals for each student.
  - `displayStudentTotals(...)`: Displays total marks per student.
  - `displayStudentAverages(...)`: Calculates and displays average marks per student.
  - `displayHighestScores(...)`: Computes top scorers for each individual subject and overall.
  - `searchMark(int[][] marks, int target, ...)`: Linear search implementation.
  - `bubbleSortTotals(int[] totals, String[] students)`: Bubble sort descending ranking.

---

## 🖥️ Menu
<img width="434" height="320" alt="image" src="https://github.com/user-attachments/assets/537ff6fc-d281-42bd-b71f-72061d262069" />
<img width="415" height="281" alt="image" src="https://github.com/user-attachments/assets/d3d195cf-ad13-4cde-8fbc-a65d68a5ae08" />
<img width="416" height="278" alt="image" src="https://github.com/user-attachments/assets/2aef0489-360d-4aa7-b4a3-4194e9f1ae20" />
<img width="412" height="278" alt="image" src="https://github.com/user-attachments/assets/17130865-a730-4fb7-b4c0-ffe9cdfd0b54" />
<img width="412" height="278" alt="image" src="https://github.com/user-attachments/assets/0bc19487-7b7c-46a3-95d0-5d89414ed3c4" />
<img width="433" height="282" alt="image" src="https://github.com/user-attachments/assets/5ed82127-24f7-4d30-9cef-85f7da08320e" />
<img width="492" height="294" alt="image" src="https://github.com/user-attachments/assets/ccf86b32-5b80-4fd9-bbcb-e471a17d0227" />




---

## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac StudentMarks/StudentMarksManagementSystem.java

# Run
java StudentMarks.StudentMarksManagementSystem
```
