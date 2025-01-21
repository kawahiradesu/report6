package jp.ac.uryukyu.ie.e245717;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private int totalScore = 0;

    public void drawCard(Card card) {
        hand.add(card);
        totalScore += card.getValue();
    }

    public int getTotalScore() {
        return totalScore;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}

