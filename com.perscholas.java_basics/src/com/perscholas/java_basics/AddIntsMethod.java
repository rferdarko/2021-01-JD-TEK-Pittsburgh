package com.perscholas.java_basics;

public class AddIntsMethod {
    public static void main(String[] args) {
        // prints return values multiplied together, but also passes #s to method
        System.out.println(add(19, 4) * add(25, 3));
    }

    public static int add(int a, int b) {
        return a + b; // adds intesgers 1 and b from main method
    }
}
