package com.example.blakjackrollout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.blakjackrollout.cards.Card;
import com.example.blakjackrollout.cards.Deck;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView amountOfDecks, amountOfCardInDeck, cardsOnHand, cardsOnDealer;
    Button plus, minus, takeCardHand, takeCardDealer;
    ArrayList<Card> cardsHand;
    ArrayList<Card> cardsDealer;
    Deck deck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountOfDecks = findViewById(R.id.amountOfDecks);
        amountOfCardInDeck = findViewById(R.id.amountOfCardsInDeck);
        cardsOnHand = findViewById(R.id.cardsOnHand);
        cardsOnDealer = findViewById(R.id.cardsOnDealer);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        deck = new Deck();
        deck.fillDeck();
        for(Card card:deck.getCards()){
            Log.d("565656", "onCreate: "+card.getDenominal()+" "+new String(Character.toChars((card.getSuit()))));
        }
        amountOfCardInDeck.setText(deck.getCards().size()+"");
        cardsHand = new ArrayList<>();
        cardsDealer = new ArrayList<>();

        takeCardHand = findViewById(R.id.takeCardHand);
        takeCardHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Card card = deck.getCards().get(new Random().nextInt(deck.getCards().size()));
                cardsHand.add(card);
                deck.getCards().remove(card);
                amountOfCardInDeck.setText(deck.getCards().size()+"");

                String s = "";
                s+=card.getDenominal()+" "+card.getSuit();
                cardsOnHand.setText(s);

            }
        });

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