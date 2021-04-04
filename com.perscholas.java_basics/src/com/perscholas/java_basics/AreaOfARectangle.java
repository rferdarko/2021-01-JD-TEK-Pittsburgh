package com.perscholas.java_basics;

// This program uses the Rectangle class to calculate the area and perimeter of a rectangle

public class AreaOfARectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, 9); // uses Rectangle Class to instantiate r1

        System.out.println("Rectangle r1 height is "+ r1.getHeight()); // prints r1 height
        System.out.println("Rectangle r1 Width is " + r1.getWidth()); // prints r1 width
        System.out.println("The area of the rectangle is " + r1.getArea());  // prints r1 area
        System.out.println("The perimeter of the rectangle is "+ r1.getPerimeter()); // Prints perimeter
    }
}
