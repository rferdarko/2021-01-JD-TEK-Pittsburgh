package com.perscholas.java_basics;

public class MonthlyPayments {

    public static void main(String[] args) {

        double principle = 20000;
        double rate = .05;
        double time = 180;

        double totalPayments = ((principle * rate) * time);
        double monthlyPayment = (((principle * rate) * time) /time);
        System.out.println();
        System.out.println("Monthly : $"+ monthlyPayment);
        System.out.println();
        System.out.println("Total Payment: $" + totalPayments);
    }

}
