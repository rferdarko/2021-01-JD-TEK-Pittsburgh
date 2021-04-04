package com.perscholas.java_basics;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        System.out.println("Prints an empty list "+ myNums);
        myNums.add(1); // adds an object to the list in index 1
        myNums.add(2); // adds an object to teh list in index 2
        myNums.add(3); // adds an object to the list in index 3
        System.out.println("list of int objects "+ myNums);
        myNums.remove(2); // removes the object at index 2 from the list
        System.out.println("List now contains " + myNums);
        myNums.add(4); // adds another object to the list
        int mySum = 0; // instantiates a new int with the sum of the list
        for (int i : myNums)  // for loop to iterate the list
            mySum += i;  // sums the elements int he list
        System.out.println("The sum of the list is " + mySum); // prints sum

    }
}
