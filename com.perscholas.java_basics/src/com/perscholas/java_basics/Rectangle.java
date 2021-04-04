package com.perscholas.java_basics;

public class Rectangle {   // rectangle class
    int height;  // integer variable for height
    int width;   // integer variable for width

    void printArea() {     // method to print area of rectangle, no return value
        System.out.println("The are of the rectangle is: "+ height * width); // prints area of rectangle
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // uses Rectangle Class to instantiate r1
        r1.height = 5;  // height for Rectangle r1
        r1.width = 9;   // width for Rectangle r1
        r1.printArea(); // calls printArea method from Rectangle Class
    }
}
