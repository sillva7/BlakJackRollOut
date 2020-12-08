package com.example.blakjackrollout.cards.Diamonds;

import com.example.blakjackrollout.cards.Hearts.CardHearts;

public class Q_d extends CardDiamonds {
    private String denominal = "Q";
    @Override
    public int getSuit() {
        return super.getSuit();
    }

    @Override
    public String getDenominal() {
        return denominal;
    }

    @Override
    public int getPoints() {
        return points;
    }
    private int points = 10;
}
