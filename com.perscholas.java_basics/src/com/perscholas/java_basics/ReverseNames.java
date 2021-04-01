package com.perscholas.java_basics;

import java.util.Scanner;

public class ReverseNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first and last name separated by a space: ");
        String firstName = input.next();
        String lastName = input.next();
        System.out.println(lastName+","+firstName);
    }
}