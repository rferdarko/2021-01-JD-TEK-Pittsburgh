package com.perscholas.java_basics;

public class Rectangle {   // rectangle class
    private int height;  // integer variable for height
    private int width;   // integer variable for width

    void setHeight(int h) {  // getter method or height
        height = h;
    }
    void setWidth(int w) {   // getter method for width
        width = w;
    }
    void printArea() {     // method to print area of rectangle, no return value
        System.out.println("The are of the rectangle is: "+ height * width); // prints area of rectangle
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // uses Rectangle Class to instantiate r1
        r1.setHeight(5);  // setter method for height
        r1.setWidth(9);   // setter method for width
        r1.printArea(); // calls printArea method from Rectangle Class
    }
}
