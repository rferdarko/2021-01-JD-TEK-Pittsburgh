package com.perscholas.java_basics;


import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {


        int checkNumber = 0;
        System.out.println("Enter an integer to convert12. ");
        Scanner input = new Scanner(System.in);
        checkNumber = input.nextInt();

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= checkNumber / 2) {
            power *= 2;
        }

        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {

            // power is not present in n
            if (checkNumber < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                System.out.print(1);
                checkNumber -= power;
            }

            // next smallest power of 2
            power /= 2;
        }

        System.out.println();

    }

}
