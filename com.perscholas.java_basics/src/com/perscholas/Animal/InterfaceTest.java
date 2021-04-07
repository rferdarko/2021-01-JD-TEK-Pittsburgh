package com.perscholas.Animal;

public class InterfaceTest {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // new instance of Dog
        myDog.setName("Astro"); // uses the Animal class setName, inherited

        System.out.println(myDog.getName()); //

        myDog.beFriendly();  // implemented via Dog class using the Pet class Abstract methods
        myDog.play(); // Implemented via the Dog class using the Pet class Abstract methods

    }
}
