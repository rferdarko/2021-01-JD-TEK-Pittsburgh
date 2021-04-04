package com.perscholas.java_basics;

public class Rectangle {   // rectangle class
    private int height;  // integer variable for height
    private int width;   // integer variable for width

    void setHeight(int h) {  // getter method or height
        height = h;
    }
    public int getHeight() {  // setter for height
        return height;    // return value
    }
    void setWidth(int w) {   // getter method for width
        width = w;         // return value
    }
    public int getWidth() {  // setter for width
        return width;    // return value
    }

    void printArea() {     // method to print area of rectangle, no return value
        System.out.println("The are of the rectangle is: "+ height * width); // prints area of rectangle
    }
    public int getArea() {    // setter for area
        return height * width;  // return value
    }
    public int getPerimeter() {  // method to return perimeter
        return (height * 2) + (width * 2); // returns perimeter
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // uses Rectangle Class to instantiate r1
        r1.setHeight(7);  // setter method for height
        r1.setWidth(9);   // setter method for width
        System.out.println("Rectangle r1 height is "+ r1.getHeight()); // prints r1 height
        System.out.println("Rectangle r1 Width is " + r1.getWidth()); // prints r1 width
        System.out.println("The area of the rectangle is " + r1.getArea());  // prints r1 area
        System.out.println("The perimeter of the rectangle is "+ r1.getPerimeter()); // Prints perimeter
    }
}
