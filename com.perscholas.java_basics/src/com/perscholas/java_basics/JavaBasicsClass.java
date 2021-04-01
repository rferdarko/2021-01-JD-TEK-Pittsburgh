package com.perscholas.java_basics;

// The JavaBasicsClass is a program containing various basic Java programs

// Developer: Robert J. Ferdarko Jr.
// Date: March 29, 2021


public class JavaBasicsClass                   // Class JavaBasicsClass
{
    public static void main(String[] args)     // Main method
    {
        System.out.println();                  // Prints a blank line

        // A program to add two integers together and print the output to the screen
        int intVar1 = 2;  // First int
        int intVar2 = 5;  // Second int
        int addInts = intVar1 + intVar2;  // Adds ints, assigns value to new variable
        System.out.println("2 + 5 = " + addInts); // Prints String plus sum of numbers

        // A program to add two doubles, assign the sum to a variable and print output
        double doubleVar1 = 10.50;  // First Double
        double doubleVar2 = 42.13;  // Second Double
        double twoDoublesSum = (doubleVar1 + doubleVar2); // adds doubles, assigns to variable
        System.out.println("This program adds two Integers together."); // Print statement
        System.out.println("10.50 + 42.13 = "+ twoDoublesSum); // Prints String + twoDoublesSum variable
        System.out.println(); // Prints a blank line

        //Declares an integer and a double, adds them together, assigns to a variable and prints
        int intVar3 = 6; // Third Integer
        double doubleVar3 = 25.99; // Third Double
        double sumOfIntAndDouble = intVar3 + doubleVar3; // adds int and double
        System.out.println("Integer 6 + Double 25.99 =  "+ sumOfIntAndDouble); // Prints results
        System.out.println("This results in a Double"); // Prints a statement to screen
        System.out.println(); // Prints a blank line

        // Program declares two integers, divides larger by smaller, assigns variable and prints output
        int divideInt1 = 45; // creates an integer variable
        int divideInt2 = 3; // creates an integer variable
        int sumOfDividedIntegers = divideInt1 / divideInt2; // divides integers and assigns variable
        System.out.println("The sum of integers 45 / 3 = "+ sumOfDividedIntegers); // Prints output
        System.out.println("This returns an Integer value"); // Prints statement
        System.out.println(); // Prints blank line

        // This program converts the above example and converts the larger number to a decimal.
        int divideInt3 = (int) 45.0; // Cast decimal number to an integer to eleminate runtime error
        int divideInt4 = 3; // integer variable
        int sumOfDividedIntegersAndDecimal = divideInt3 / divideInt4; // divides variables and assigns result
        System.out.println("The sum of decimal 45.0 / 3 = "+ sumOfDividedIntegersAndDecimal); // prints result
        System.out.println("This returns a Java runtime error for a possible lossy conversion"); // prints statement
        System.out.println("Requires casting decimal to int or converting integet to a double"); // prints statement
        System.out.println(); // prints a blank line

        // Program to divide doubles, print the result, then cast the result to an Integer and print again
        double castDouble1 = 60.25; // creates double variable
        double castDouble2 = 12.51; // creates double variable
        double castDoubleSum = castDouble1 / castDouble2; // divides larger Double by smaller one
        System.out.println("Doubles 60.25 / 12.51 = "+ castDoubleSum); // Prints output
        System.out.println(); // Prints blank line

        // This program takes the previous sum and cast it to an Integer and prints the output.
        System.out.println("Next we cast previous sum of Doubles to Integer value"); // Print statement
        int castDoublesToInt = (int) castDoubleSum; // Casts sum of Doubles to Integer
        System.out.println("This results in the Integer value: " + castDoublesToInt);
        System.out.println(); // Prints a blank line


    }  // End of main
} // End of class
