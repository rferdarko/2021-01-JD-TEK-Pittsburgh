package com.perscholas.java_basics;

public class Rectangle {   // rectangle class
    private int height = 1;  // integer variable for height
    private int width = 1;   // integer variable for width

    public Rectangle(int h, int w) {  // constructor
        setHeight(h); // set height
        setWidth(w);  // set width
        }


    public void setHeight(int h) {  // getter method or height
        if (h > 0) {  // condition to avoid negative numbers
        height = h;
        }
    }
    public int getHeight() {  // setter for height
        return height;    // return value
    }
    public void setWidth(int w) {   // getter method for width
        if (w > 0) {  // condition to avoid negative numbers
            width = w;

        }
    }
    public int getWidth() {  // setter for width
        return width;    // return value
    }

    public void printArea() {     // method to print area of rectangle, no return value
        System.out.println("The are of the rectangle is: "+ height * width); // prints area of rectangle
    }
    public int getArea() {    // setter for area
        return height * width;  // return value
    }
    public int getPerimeter() {  // method to return perimeter
        return (height * 2) + (width * 2); // returns perimeter
    }
}
