package com.perscholas.Animal;

public class Animal {
    private String name;  // private String name
    private int numLegs;  // private int numLegs
    private String food;  // private String food

    public String getName() { // getter for food
        return name; // returns name
    }

    public void setName(String name) {  // setter for name
        this.name = name;  // new instance of name sets the value for name
    }

    public int getNumLegs() {  // getter for legs
        return numLegs;  // returns the number of legs
    }

    public void setNumLegs(int numLegs) {  // sets the number of legs
        this.numLegs = numLegs;  // new instance of numLegs sets number of legs for numLegs
    }

    public String getFood() { // getter for getFood
        return food; // retuns food
    }

    public void setFood(String food) {  // setter for setFood
        this.food = food; // new instance of food sets value for food
    }
}
