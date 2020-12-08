package com.example.blakjackrollout.cards.Spades;

import com.example.blakjackrollout.cards.Card;

public class A_s extends CardSpades {
    private String denominal = "A";
    private int points = 1;
    private int pointsAlt = 11;

    @Override
    public String getDenominal() {
        return denominal;
    }

    @Override
    public int getPoints() {
        return points;
    }

    public int getPointsAlt() {
        return pointsAlt;
    }
}
