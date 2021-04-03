package com.perscholas.java_basics;

public class MyArray1 {
    public static void main(String[] args) {

        int[] x = {3,4,5};  // creates an array of 3 ints
        System.out.println(x[0] + x[2]); // adds 2 elements together and prints
        System.out.println(x[0] + "," + x[1] + "," + x[2]); // prints all elements

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);  // prints all the elements in order

            // prints each index along with its element
            System.out.println("x[" + i + "] = " + x[i]);

        }

        int[] y = x; // new array y links to array x
        y[0] = 4; // change value of y index 0 element
        y[2] = 6; // change value of y index 2 element
        System.out.println(y[0] +","+ y[1] +","+ y[2]);
        System.out.println("As you can see, y1 remains unchanged");
        System.out.println("But this also changes the values in array x");
        System.out.println("So we have to create 2 separate arrays");

        int[] z = new int[5];
        z[0]=12;
        z[1]=24;
        z[2]=36;

        for (int j = 0; j < z.length; j++){
            System.out.print(z[j] +" ");


        }
        System.out.println("are the new values for array z");
        System.out.print("Array x = "+ x[0] +" "+ x[1] + " "+ x[2]);
        System.out.println(" so array x retained the modified values from y");


    }
}