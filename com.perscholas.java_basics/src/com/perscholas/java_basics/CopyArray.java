package com.perscholas.java_basics;

public class CopyArray {     // Copies an array of ints
    public static void main(String[] args) {  // main method

    int[] sourceArray = {3, 4, 6, 5, 7};    // source array of ints
    int[] targetArray = new int[sourceArray.length];  // new empty target array = sourceArray length

    for (int i = 0; i < sourceArray.length; i++) // for loop to copy elements from source array
        targetArray[i] = sourceArray[i]; // copies elements index by index to targetArray

    for (int i = 0; i < targetArray.length; i++) // for loop to iterate targetArray elements
        System.out.println(targetArray[i]); // prints elements of targt array
    }
}
