package com.example.blakjackrollout.cards.Hearts;

import com.example.blakjackrollout.cards.Card;

public class K_h extends CardHearts {
    private String denominal = "K";
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
