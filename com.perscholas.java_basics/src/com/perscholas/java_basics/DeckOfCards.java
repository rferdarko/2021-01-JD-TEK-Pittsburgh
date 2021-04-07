package com.perscholas.java_basics;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];  // Creates an int array size 52 to hold cards
        // Iterate cards
        for (int i = 0; i < deck.length; i++){
            deck[i] = i; // i gets added to the deck on each iteration
        }
    }
}
