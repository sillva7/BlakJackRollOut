package com.example.blakjackrollout.cards.Clabs;

import com.example.blakjackrollout.cards.Hearts.CardHearts;

public class A_c extends CardClubs {

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
