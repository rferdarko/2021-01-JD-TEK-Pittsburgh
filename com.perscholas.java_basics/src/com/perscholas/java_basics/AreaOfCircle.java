package com.perscholas.java_basics;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        // compute the area
        area = radius * radius * 3.14159;

        // Display the results
        System.out.println("The area of the circle with a radius of "+radius +" is " + area);
    }
}
