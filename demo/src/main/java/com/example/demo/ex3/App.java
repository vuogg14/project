package com.example.demo.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Card> list = new ArrayList<>();

        int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Suit[] suits = {Suit.HEART, Suit.DIAMOND, Suit.SPADES, Suit.CLUB};

        for(Suit i : suits){
            for(int j : ranks){
                list.add(new Card(j, i));
            }
        }

        Collections.sort(list, new CompareCard());

        for(Card i : list){
            System.out.print(i + " ");
        }
    }
}
