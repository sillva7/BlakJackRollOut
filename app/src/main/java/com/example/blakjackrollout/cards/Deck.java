package com.example.blakjackrollout.cards;


import com.example.blakjackrollout.cards.Clabs.*;
import com.example.blakjackrollout.cards.Diamonds.*;
import com.example.blakjackrollout.cards.Hearts.*;
import com.example.blakjackrollout.cards.Spades.*;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void fillDeck(){
        cards.add(new A_c());
        cards.add(new A_d());
        cards.add(new A_s());
        cards.add(new A_h());
        cards.add(new K_h());
        cards.add(new K_c());
        cards.add(new K_d());
        cards.add(new K_s());
        cards.add(new Q_s());
        cards.add(new Q_c());
        cards.add(new Q_h());
        cards.add(new Q_d());
        cards.add(new J_d());
        cards.add(new J_s());
        cards.add(new J_c());
        cards.add(new J_h());
        cards.add(new Ten_h());
        cards.add(new Ten_d());
        cards.add(new Ten_c());
        cards.add(new Ten_s());
        cards.add(new Nine_s());
        cards.add(new Nine_h());
        cards.add(new Nine_c());
        cards.add(new Nine_d());
        cards.add(new Eight_d());
        cards.add(new Eight_h());
        cards.add(new Eight_s());
        cards.add(new Eight_c());
        cards.add(new Seven_c());
        cards.add(new Seven_s());
        cards.add(new Seven_h());
        cards.add(new Seven_d());
        cards.add(new Six_d());
        cards.add(new Six_h());
        cards.add(new Six_c());
        cards.add(new Six_s());
        cards.add(new Five_s());
        cards.add(new Five_c());
        cards.add(new Five_h());
        cards.add(new Five_d());
        cards.add(new Four_d());
        cards.add(new Four_h());
        cards.add(new Four_c());
        cards.add(new Four_s());
        cards.add(new Three_s());
        cards.add(new Three_h());
        cards.add(new Three_d());
        cards.add(new Three_c());
        cards.add(new Two_c());
        cards.add(new Two_h());
        cards.add(new Two_d());
        cards.add(new Two_s());
    }



}
