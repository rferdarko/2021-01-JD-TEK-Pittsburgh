package com.perscholas.java_basics;

public class ConvertTemperature {
    public static void main(String[] args) {
        int tempFahrenheit = 52;
        double tempCelsius = ((tempFahrenheit -32) * 5/9);
        System.out.println(tempCelsius);
    }
}