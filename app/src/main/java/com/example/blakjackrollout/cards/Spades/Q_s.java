package com.example.blakjackrollout.cards.Spades;

import com.example.blakjackrollout.cards.Card;

public class Q_s extends CardSpades {
    private String denominal = "Q";
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
