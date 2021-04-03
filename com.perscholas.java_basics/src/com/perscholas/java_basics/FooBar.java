package com.perscholas.java_basics;



public class FooBar {  // class FooBar
    static int x = 5;  // sets a global value for x

    public static void main(String[] args) { // main method
        System.out.println();  // prints a blank line
        System.out.println("main method = " + x);  // prints the value of x
        bar(); // bar method adds 1 to value of x then passes value to foo method
        foo(); // foo method multiplies new value of x
    }

    public static void bar() { // bar method receives x
        x = x + 1;   // adds 1 to the value of x
        System.out.println("bar method adds 1 to x = " + (x)); // prints bar(x)
    }
    public static void foo() { // foo method receives x
        x = x * 2;// takes new x value and doubles it
        System.out.println("foo method doubles bar method value = "+ (x)); // prints foo(x)
    }
}

