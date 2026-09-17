# Mini Project 9: Warehouse Inventory Tracker

## Overview
The **Warehouse Inventory Tracker** is a Java console application designed for **Array Applications (2D Arrays, Searching, Sorting, and Methods)**. It tracks stock counts of multiple products across warehouse zones, computes aggregate product stock, performs linear searches to locate inventory in specific warehouse zones, and ranks products by total stock using selection sort in descending order while maintaining product-name mapping.

---

## Academic Context
- **Course**: B.Tech CSE 2025-29 Java Programming Mini Projects
- **Semester**: III
- **Assessment Type**: Individual Coding Assignment
- **Unit / Chapter**: Array Applications
- **Topic**: 2D Arrays, Searching, Sorting, Methods

---

## Warehouse Zones Specification
The warehouse inventory system tracks items across three distinct functional zones:

| Zone Code | Zone Name | Description / Role |
|:---:|:---|:---|
| **Z1** | North Dock | Receiving & inbound inventory staging area |
| **Z2** | South Dock | Outbound shipping & dispatch staging area |
| **Z3** | Cold Storage | Temperature-controlled storage for perishables |

---

## Key Requirements & Implementation

### 1. 2D Array Modeling (25% Weightage)
- Stock counts are modeled as a 2D integer array: `int[][] stock = new int[numProducts][3]`.
  - **Rows**: Represent individual products (`0` to `numProducts - 1`).
  - **Columns**: Represent warehouse zones (`0 = Z1 North Dock`, `1 = Z2 South Dock`, `2 = Z3 Cold Storage`).
- A parallel array `String[] productNames` maintains product names corresponding to each row index.

### 2. Total Stock Calculation Method
```java
public static int totalStock(int[][] stock, int productIndex)
```
- Iterates over columns `0` through `ZONE_COUNT - 1` for row `productIndex`.
- Computes and returns the aggregate stock across all zones.

### 3. Linear Search Method (20% Weightage)
```java
public static int linearSearch(int[][] stock, int productIndex, int zoneIndex)
```
- Linearly scans the 2D array coordinates.
- Returns the stock count at the given `(productIndex, zoneIndex)` cell, or `-1` if the coordinates are out of bounds.
- Includes helper linear searches `findProductByName(String[] productNames, String targetName)` and `findZoneByCode(String zoneCode)`.

### 4. Selection Sort & Descending Ranking (30% Weightage)
```java
public static int[] selectionSort(int[] totals)
```
- Implements the **Selection Sort** algorithm in descending order.
- Operates on an array of product indices (`[0, 1, ..., n-1]`) to rank items from highest total stock to lowest.
- Preserves the relationship between product names and their stock without corrupting original data order.

### 5. Report Formatting (25% Weightage)
```java
public static void printStockReport(String[] productNames, int[][] stock, int[] totals, int[] rankedIndices)
```
- Outputs the inventory per zone and total: `<ProductName> -> Z1:<count> Z2:<count> Z3:<count> Total:<total>`
- Prints the ranked leaderboard: `<Rank>. <ProductName> (<Total>)`

---

## Expected Output (Sample Run)

```text
===== Warehouse Inventory Tracker =====
Enter number of products: 2
Product 1 (Rice) stock in Z1,Z2,Z3: 40 30 10
Product 2 (Oil) stock in Z1,Z2,Z3: 15 15 15

Rice  -> Z1:40 Z2:30 Z3:10  Total:80
Oil   -> Z1:15 Z2:15 Z3:15  Total:45

Ranking by total stock:
1. Rice (80)
2. Oil (45)
```

---

## Code Structure

```
Mini-PROJECT/
├── WarehouseInventoryTracker.java   # Complete self-contained application (logic, search, sort, CLI runner)
└── README.md                       # Project documentation
```

---

## 🛠️ How to Compile & Run

### 1. From Repository Root

```bash
# Compile
javac Mini-PROJECT/WarehouseInventoryTracker.java

# Run
java -cp Mini-PROJECT WarehouseInventoryTracker
```

### 2. From Inside `Mini-PROJECT` Directory

```bash
cd Mini-PROJECT
javac *.java
java WarehouseInventoryTracker
```

---

## Evaluation Rubric Compliance

| Criterion | Weightage | What Is Assessed | Implementation in Code |
|---|:---:|---|---|
| **2D array modelling** | 25% | Whether product-by-zone stock is correctly represented and read into a 2D array. | `int[][] stock = new int[numProducts][3]` populated cleanly from input. |
| **Search method correctness** | 20% | Whether the linear search correctly retrieves a specific product-zone stock value. | `linearSearch(int[][] stock, int productIndex, int zoneIndex)` with defensive bound checks. |
| **Sorting/ranking logic** | 30% | Whether products are correctly ranked by total stock while keeping names matched. | `selectionSort(int[] totals)` sorting product indices descending while mapping to `productNames`. |
| **Report formatting** | 25% | Whether the stock report and ranking are printed clearly. | `printStockReport(...)` matching exact sample output format. |
