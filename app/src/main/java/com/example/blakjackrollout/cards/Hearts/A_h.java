package com.example.blakjackrollout.cards.Hearts;

import com.example.blakjackrollout.cards.Clabs.CardClubs;

public class A_h extends CardHearts {

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
