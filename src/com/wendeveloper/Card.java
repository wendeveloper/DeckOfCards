package com.wendeveloper;

public class Card {
    // Cards have two main properties:  Suit, Rank
    // Suit: Diamonds, Clubs, Hearts, Spades
    // Rank:  Ace, 2, 3, 4, ...10, Jack, Queen, King
    // we need to make our own specific enum for Suit
    private Suit suit;   // this refers to enum Suit as a datatype and assigns it to property name suit
    private int rank;    // 1 = ace, 11 = jack, 12 = queen, 13 = king as a way to distinguish what card but is not their value.


    // constructor for card
    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strRank = "";
        switch(rank) {
            case 1  : strRank  = "Ace";
            case 11 : strRank = "Jack";
            case 12 : strRank = "Queen";
            case 13 : strRank = "King";
            default : strRank = Integer.toString(rank);

        }
        return "This is a " + strRank + " of " + this.suit;
    }

}
