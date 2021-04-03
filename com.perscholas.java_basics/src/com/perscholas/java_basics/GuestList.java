package com.perscholas.java_basics;

import java.util.Scanner;      // impirts Scanner from utility library

public class GuestList {      // new class
    public static void main(String[] args) {    // main method

        String[] guests = new String[10];       // new String Array guests
        Scanner input = new Scanner(System.in);  // initiates instance of scanner as input

        guests[0] = "Kathy";  // Preloaded guests for demonstation only
        guests[2] = "John";
        guests[3] = "Sally";
        guests[6] = "Judy";

        do {                       // this is a do while, while condition comes later
            System.out.println();  // prints blank line
            System.out.println("1 - Display All Guests"); // Menu option 1
            System.out.println("2 - Add guests");     // Menu option 2
            System.out.println("3 - Remove guests");  // Menu option 3
            System.out.println("4 - Exit");           // Menu option 4
            System.out.println("Option: ");   // Prints options: to screen
            int option = input.nextInt();  // gets menu # selection from user
            System.out.println();  // prints blank line

            if (option == 1) {      // if user selected 1 from menu
                for (int i = 0; i < guests.length; i++) {       // iterates array
                    System.out.println(guests[i]);        // prints out all the elements
                }
            } else if (option == 2) {                     // if user selected 2 from menu
                for (int i = 0; i < guests.length; i++) {    // iterates array
                    if (guests[i] == null) {    // check for a null element to store name
                        System.out.print("Name: "); // Asks for name
                        guests[i] = input.next();                // Stores the name in the array
                        break;                  // exits the loop
                    }
                }
            }
            else if (option == 3) {                     // if user selected 3 from menu
                System.out.print("Name: ");             // requests a name
                String name = input.next();             // gets the name from the scanner
                for (int i = 0; i < guests.length; i++) {       // iterates array
                    if (guests[i] != null && guests[i].equals(name)) {      // searches for a matching name
                        guests[i] = null;           // will set the element back to null
                        break;             // after it finds a match and removes it, break
                    }
                }
            }
            else if (option == 4) {               // else if for menu option 4
                System.out.println("Exiting..."); // Prints to screen if 4 selected
                break;        // breaks loop
            }
        } while (true);  // while condition for while-true statement will run if true


            System.out.println();  // prints blank line

    }
}
