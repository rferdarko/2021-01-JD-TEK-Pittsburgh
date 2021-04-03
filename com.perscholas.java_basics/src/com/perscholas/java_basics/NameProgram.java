package com.perscholas.java_basics;

import java.util.Scanner;

public class NameProgram {

    public static void main(String[] args) {
//	    Create a console app that takes a full name (first and last) as an input and switch them around.
//        Example: User input = Michael Brady -> Output = Brady Michael.
        boolean repeat = true;
        String fullName = " ";
        while (repeat){
            Scanner input = new Scanner(System.in);
            System.out.print("Write your full name: ");
            fullName = input.nextLine();
            fullName = fullName.trim();
            int space = fullName.indexOf(' ');
            if(fullName.equals("exit")){
                repeat = false;
                System.out.println("Bye!");
            } else if (space == -1){
                System.out.println("I need full name");
            } else if (fullName.length() != 0 ){
                String firstName = fullName.substring(0, space);
                String lastName = fullName.substring(space + 1);
                System.out.println(lastName + " " + firstName);
            } else {
                System.out.println("This is empty");
            }
        }
//        Topics we discussed:
//        1- Strigs.
//        2- While loops and conditions.
//        3- if/ if else / if/ else if / else.
//        4- Booleans.
//        5- Edge cases.

    }
}
