package com.perscholas.java_basics;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        int num = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        num = userInput.nextInt();
        boolean isPrime = true;

 //       for (num = 2; num < 1000; num++) {

          for (int div = 2; div < num; div++)
              if (num % div == 0){
                  isPrime = false;
                    break;
              }
          if (isPrime)
              System.out.println("The number "+ num + " is Prime.");
          else
              System.out.println("The number "+ num + " is not prime.");





    }
}
