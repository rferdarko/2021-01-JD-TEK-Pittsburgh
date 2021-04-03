package com.perscholas.java_basics;

public class ConeVolume {
    public static void main(String[] args) {
        // Prints out the cone volume, but also passes int for radius and height to method
        System.out.println(coneVolume(4, 5));
    }
    public static double coneVolume(double r, double h){
        // this method receives the integers for radius and height from main method
        return 3.141 * r * r * h / 3;  // pi * radius^2 * height / 3

    }
}
