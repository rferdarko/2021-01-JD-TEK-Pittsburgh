package com.perscholas.java_basics;

// This program creates a String array list
// normally we would use a String[], but since it's hard to know how many
// elements will be in the list, and we don't want to allocate the memory
// for a large array, it is better to use the array list

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        // This creates an Array List to hold Strings with the name myList
        // This type was selected because it can grow and shring to fit the elements
        ArrayList<String> myList= new ArrayList<String>();
        myList.add("Java"); // This adds an object to the first available position in the string
        myList.add("Python"); // This adds another object

        System.out.println(myList); // This prints the current array list
        myList.remove("Java"); // This removes an object
        System.out.println(myList); // prints the remaining values
       // System.out.println(myList.size);
        myList.clear(); // empties the list
        System.out.println(myList);  // prints an emptly list
        myList.add("Java Script"); // adds an object
        myList.add("Ruby on Rails"); // adds another object
        System.out.println(myList);
        myList.remove(1);  // another way of removing an item with the index value
        System.out.println(myList); // prints the remaining elements
    }
}
