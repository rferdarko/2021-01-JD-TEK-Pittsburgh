package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        // start of program   1
        int x = 7;  // Prints less than 10
        if (x < 10)
            System.out.println("Less than 10");
        // end of program

        // start of program
        int x2 = 15;  // Displays Nothing
        if (x2 < 10)
            System.out.println("Less than 10");
        // end of program




        // start of program   2
        int x3 = 7;  // Prints Less than 10
        if (x3 < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        } // end of program

        // start of program
        int x4 = 15;  // Prints More than 10
        if (x4 < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        } // end of program





        // start of program   3
        int x6 = 15;  // Prints Less than 10
        if(x6< 10)
            System.out.println("Less than 10");

        else if ((10 < x6) && (x6 < 20))
            System.out.println("Between 10 and 20");


        else
            System.out.println("Greater than or equal to 20");
        // end of program

        // Start of program
        int x7 = 50;  // Prints Less than 10
        if(x7< 10)
            System.out.println("Less than 10");

        else if ((10 < x7) && (x7 < 20))
            System.out.println("Between 10 and 20");

        else
            System.out.println("Greater than or equal to 20");
        // end of program




        // Start of program  4         // prints in range
        int x8 = 15;  // Prints Less than 10
        if ((x8 < 10) || (x8 > 20))
            System.out.println("Out of range");

        else if ((x8 >= 10) && (20 >= x8))
            System.out.println("In range");

        // end of program

        // Start of program      // Prints out of range
        int x9 = 5;  // Prints Less than 10
        if ((x9 < 10) || (x9 > 20))
            System.out.println("Out of range");

        else if ((x9 >= 10) && (20 >= x9))
            System.out.println("In range");

        // end of program





        // Start of program      // Prints a letter grade from user input

        Scanner input = new Scanner(System.in); // Scanner to receive user input
        System.out.println("Enter a numeric grade"); // Prints statement requesting usr input
        String grade = input.next(); // String to get next value from System input / Scanner
        int x10 = Integer.parseInt(grade);  // parses Integer from String
        if ((x10 >= 90) && (100 >= x10))
            System.out.println("A");

        else if ((x10 >= 80) && (89 >= x10))
            System.out.println("B");

        else if ((x10 >= 70) && (79 >= x10))
            System.out.println("C");

        else if ((x10 >= 60) && (69 >= x10))
            System.out.println("D");

        else if (x10 < 60)
            System.out.println("F");

        // end of program




        // Start of program      // Prints the day of the week

        Scanner inputDay = new Scanner(System.in); // Scanner to receive user input
        System.out.println("Enter an integer between 1 and 7 "); // Prints statement requesting usr input
        String day = input.next(); // String to get next value from System input / Scanner
        int dayInt = Integer.parseInt(day);  // parses Integer from String
        if ((dayInt < 1) || (dayInt > 7))
            System.out.println("Out of range"); // prints out of range if  < 1 or > 7
        switch(dayInt) // Switch statement for cases
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;




        }


    }



}
