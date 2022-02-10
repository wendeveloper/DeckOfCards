package com.wendeveloper;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> deck = new ArrayList<>();

    public Deck() {
        // ranks 1 to 13
        for (int i = 1; i <= 13; i++) {

            // suits        iterate over Suit with arbitrary name s
            for (Suit s : Suit.values()) {      // Suit s in Suit.values is the collection

                // populate new Card
                deck.add(new Card(s, i));  // add to deck with new Card passing in s, i

                // for each card added to deck, print out last index in deck
                System.out.println(deck.get(deck.size() - 1));
            }
        }
    }
    /*
    List<Card arrList = new ArrayList<>();
    List is an interface.  You can't have a concrete instance of.
    Essentially an ArrayList inherits from the List interface.

    ArrayList<Card> arrList = new ArrayList<>();
    */



}
