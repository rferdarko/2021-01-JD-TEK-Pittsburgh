package com.perscholas.Animal;

public class Dog extends Animal implements Pet{


    @Override
    public void beFriendly() {
        System.out.println("Friendly Dog");

    }

    @Override
    public void play() {
        System.out.println("Playful Dog");

    }
}
