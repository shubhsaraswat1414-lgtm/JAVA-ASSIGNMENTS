# Matrix Operations Toolkit

A Java console program for working with two integer matrices.

The program reads two matrices with the same dimensions and provides a menu of
common matrix operations.

## Features

- Display Matrix A and Matrix B
- Add matrices
- Subtract matrices
- Multiply compatible square matrices
- Transpose either matrix

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt

No external libraries are required.

## Compile and Run

From the repository root:

```bash
javac "Mini Project /MatrixOperationsToolkit.java"
java -cp "Mini Project " MatrixOperationsToolkit
```

Enter the number of rows and columns, provide the values for both matrices, and select an operation from the menu.

## Input Format

For each matrix, enter all values on one line separated by spaces. For example,
the values for a 2 x 2 matrix can be entered as:

```text
1 2 3 4
```

Single-digit values can also be entered without spaces:

```text
1234
```

The values are filled from left to right, row by row.

## Menu Options

1. Display Matrix A
2. Display Matrix B
3. Add Matrix A and Matrix B
4. Subtract Matrix B from Matrix A
5. Multiply Matrix A by Matrix B
6. Display the transpose of Matrix A
7. Display the transpose of Matrix B
8. Exit the program

Matrix multiplication is available when the entered matrices have compatible
dimensions. The program continues showing the menu until option 8 is selected.

## Example Session

```text
Enter number of rows: 2
Enter number of columns: 2

Enter Matrix A:
Enter 4 numbers for the matrix in one line:
1 2 3 4

Enter Matrix B:
Enter 4 numbers for the matrix in one line:
5 6 7 8

Enter your choice: 3
```

The addition result is displayed as a 2 x 2 matrix:

```text
6    8
10   12
```

## Implementation Notes

- Matrices are stored as two-dimensional integer arrays.
- Matrix addition and subtraction operate element by element.
- Transpose swaps matrix rows and columns.
- Results are printed directly in the terminal.
