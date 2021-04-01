package com.perscholas.java_basics;

public class SalesTax {

    public static void main(String[] args) {
        int purchase = 100;
        double rate = .08875;
        double salesTax = purchase * rate;
        System.out.printf("Output: "+"$"+" %.2f %n", salesTax);
        System.out.println("Sales Txx Rate = "+rate);
    }

}
