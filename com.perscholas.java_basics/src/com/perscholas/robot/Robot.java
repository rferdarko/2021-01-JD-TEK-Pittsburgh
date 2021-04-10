package com.perscholas.robot;

public class Robot {  // public class Robot

    private int maxSpeed;  // instantiate int maxSpeed variable set to private

    public Robot() {      // Robot Constructor takes no arguments
        this.maxSpeed = 1; // initializes the maxSpeed variable to 1
    }

    public  int getMaxSpeed() {   // getter to get the maximum speed
        return maxSpeed;  // return value
    }
    public void setMaxSpeed(int maxSpeed) { // method to set maximum speed
        if (maxSpeed >= 0) // if maxSpeed is greater than or equal to 0 as a boolean
            this.maxSpeed = maxSpeed; // intantiates maxSpeed with this.
        else this.maxSpeed = 0; // otherwise this instance of maxSpeed equals zero
    }
    public void travel() {  // creates a method to report the Robots movement
        // Prints message plus output
        System.out.println("The Robot travelled a distance of " + maxSpeed + " units.");


    }
}
