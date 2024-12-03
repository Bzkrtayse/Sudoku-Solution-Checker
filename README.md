# Sudoku-Solution-Checker
A Java program to validate if a given 9x9 Sudoku board is a valid solution. 

## About
This repository contains a single method to validate if a given 9x9 Sudoku board is a valid solution. It checks:
- Rows, columns and 3x3 subgrids to ensure uniqueness of numbers (1-9).

## How to Use
1. Copy the `checkIfSolutionIsTrue` method from `Sudoku.java`.
2. Create your own `main` function in a Java program.
3. Pass a 9x9 `int[][]` Sudoku board as an argument to the method.

### Example
Here’s how you can use the method in your own program:
```java
public class Main {
    public static void main(String[] args) {
        int[][] sudokuBoard = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(ClassName.checkIfSolutionIsTrue(sudokuBoard)); // Output: true
    }
}
