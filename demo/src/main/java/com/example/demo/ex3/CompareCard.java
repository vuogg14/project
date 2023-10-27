package com.example.demo.ex3;

import java.util.Comparator;

public class CompareCard implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int rankComparison = o1.getRank() - o2.getRank();
        if(rankComparison != 0){
            return rankComparison;
        } else {
            return o1.getSuit().compareTo(o2.getSuit());
        }
    }
}
