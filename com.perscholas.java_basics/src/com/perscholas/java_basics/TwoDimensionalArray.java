package com.perscholas.java_basics;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix2d = {
                {1, 2}, // outer index 0
                {2, 3}, // outer index 1
        };
        for (int i = 0; 1 < matrix2d.length; i++) { // iterates outer loop on i
            for (int j = 0; j < matrix2d.length; j++){  // itereates inner loop on j
                System.out.printf("%d ",matrix2d[i][j]); // Prints all elements on one line
            }
        }
    }
}
