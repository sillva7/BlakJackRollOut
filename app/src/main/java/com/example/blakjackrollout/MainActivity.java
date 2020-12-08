package com.example.blakjackrollout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.blakjackrollout.cards.Card;
import com.example.blakjackrollout.cards.Deck;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView amountOfDecks, amountOfCardInDeck, cardsOnHand, cardsOnDealer, chances;
    Button plus, minus, takeCardHand, takeCardDealer, ok;
    ArrayList<Card> cardsHand;
    ArrayList<Card> cardsDealer;
    Deck deck;
    static String sCardsOnHand;
    static String sCardsOnDealer;
    static String chancesString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountOfDecks = findViewById(R.id.amountOfDecks);
        amountOfCardInDeck = findViewById(R.id.amountOfCardsInDeck);
        cardsOnHand = findViewById(R.id.cardsOnHand);
        cardsOnDealer = findViewById(R.id.cardsOnDealer);
        takeCardDealer = findViewById(R.id.takeCardDealer);
        chances = findViewById(R.id.chances);
        ok = findViewById(R.id.confirm);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        deck = new Deck();
        sCardsOnHand = "";
        sCardsOnDealer = "";
        chancesString = "";

        for (Card card : deck.getCards()) {
            Log.d("565656", "onCreate: " + card.getDenominal() + "");
        }


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardsHand.clear();
                cardsOnHand.setText("");
                sCardsOnDealer = "";
                sCardsOnHand = "";
                cardsDealer.clear();
                cardsOnDealer.setText("");
                chancesString = "";
                chances.setText("");
                deck.getCards().clear();
                int i = Integer.parseInt(amountOfDecks.getText().toString());
                for (int j = 0; j < i; j++) {
                    deck.fillDeck();
                }
                amountOfCardInDeck.setText(deck.getCards().size() + "");
            }
        });
        amountOfCardInDeck.setText(deck.getCards().size() + "");
        cardsHand = new ArrayList<>();
        cardsDealer = new ArrayList<>();
        takeCardHand = findViewById(R.id.takeCardHand);


        takeCardHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardsHand.size() != deck.getCards().size()) {
                    Card card = deck.getCards().get(new Random().nextInt(deck.getCards().size()));
                    cardsHand.add(card);
                    deck.getCards().remove(card);
                    amountOfCardInDeck.setText(deck.getCards().size() + "");
                    sCardsOnHand = sCardsOnHand + card.getDenominal() + "" + new String(Character.toChars((card.getSuit()))) + "  ";
                    cardsOnHand.setText(sCardsOnHand);
                    chances(card);

                } else {

                }
            }
        });


        takeCardDealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsDealer.size() != deck.getCards().size()) {
                    Card card = deck.getCards().get(new Random().nextInt(deck.getCards().size()));
                    cardsDealer.add(card);
                    deck.getCards().remove(card);
                    amountOfCardInDeck.setText(deck.getCards().size() + "");
                    sCardsOnDealer = sCardsOnDealer + card.getDenominal() + "" + new String(Character.toChars((card.getSuit()))) + "  ";
                    cardsOnDealer.setText(sCardsOnDealer);
                    chances(card);
                } else {

                }
            }
        });

    }


    public void chances(Card card) {
        int amount = deck.getCards().size();
        int coincidence = 0;
        for (int i = 0; i < amount; i++) {
            if ((card.getDenominal()+card.getSuit()+"").equals(deck.getCards().get(i).getDenominal()+deck.getCards().get(i).getSuit()+"")) {
                coincidence++;
            }
            Log.d("797979", "chances: " + coincidence);
        }
        double f = ((coincidence * 100d) / amount);
        chancesString = chancesString + (card.getDenominal() + "" + new String(Character.toChars((card.getSuit()))) + (double) Math.round(f * 100d) / 100d + "%") + " ";
        chances.setText(chancesString);


    }


    public void minusDeck(View view) {
        int i = Integer.parseInt(amountOfDecks.getText().toString());
        if (i == 0) {

        } else {
            i--;
        }
        amountOfDecks.setText(i + "");

    }

    public void plusDeck(View view) {
        int i = Integer.parseInt(amountOfDecks.getText().toString());
        i++;
        amountOfDecks.setText(i + "");
    }


}