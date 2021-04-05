package com.perscholas.java_basics;

// A program to get each character from a String

public class StingLooping {   // class
    public static void main(String[] args) { // Main method
        String x = "Hello World";  // String assigned to variable x
        for (int i = 0; i < x.length(); i++) { // for loop to iterate through String
            // Prints each character at i on each iteration in UPPER CASE latters
            System.out.println(x.toUpperCase().charAt(i));
        }
    }
}
