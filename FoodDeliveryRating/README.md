# Assignment 3: Food Delivery Rating Analyzer

## 📌 Overview
The Food Delivery Rating Analyzer models a rating analysis engine for food delivery platforms. It demonstrates method overloading and multi-dimensional array processing to compute total and average customer ratings across multiple restaurants or delivery executives.

---

## 🎯 Concepts Covered
- **Method Overloading**: Defining multiple methods with the same name (`calcTotal`, `calcAvg`) but different parameter signatures (1D array vs. 2D array with index).
- **1-D & 2-D Arrays**: Processing linear collections of ratings and tabular matrix rating datasets.
- **Array Traversal**: Iterating over elements using `for` loops.
- **Statistical Calculations**: Summation, counts, and average computations with floating-point precision.

---

## 💻 Code Structure
- **Class**: `foodDelivery_RatingAnalyzer`
- **Package**: `FoodDeliveryRating`
- **Key Methods**:
  - `calcTotal(int[] arr)`: Calculates total rating for a 1-D array.
  - `calcTotal(int[][] arr, int row)`: Overloaded method to calculate total rating for a specific row in a 2-D array.
  - `calcAvg(int sum, int count)`: Calculates average rating.
  - `calcAvg(int[] arr)`: Overloaded method to calculate average rating from a 1-D array directly.
  - `calcAvg(int[][] arr, int row)`: Overloaded method to calculate average rating for a row in a 2-D array.

---
<img width="444" height="339" alt="image" src="https://github.com/user-attachments/assets/a39b008c-32ba-459e-a93b-b84dd0cc812b" />


## 🚀 How to Compile & Run
From the root workspace directory:

```bash
# Compile
javac FoodDeliveryRating/foodDelivery_RatingAnalyzer.java

# Run
java FoodDeliveryRating.foodDelivery_RatingAnalyzer
```
