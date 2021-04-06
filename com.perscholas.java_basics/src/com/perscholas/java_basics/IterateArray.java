package com.perscholas.java_basics;

public class IterateArray {
    public static void main(String[] args) {
        int[] nums = {75, 29, 350, 7, 4192, 204, 1100, 67};
        int count = 0; // counter
        int sumOfNums = 0; // to calculate the sum of numbers in the array
        for (int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i]; // sums the numbers in the array
            if (nums[i] > 100) {  // condition: number must be greater than 100
                count++;
                System.out.println(nums[i]); // print out numbers > 100

            }
        }
        System.out.println("Numbers greater than 100: " + count); // prints count
        System.out.println("The sum of numbers in the array: " + sumOfNums);
        System.out.println("The mean is: " + sumOfNums / nums.length);

    }

}
