package com.perscholas.MyArrayList;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello");
        String temp = myList.get(0);
        System.out.println(temp);
        System.out.println(myList.size());
     }
}
