package hw2_22001665_CaoSyNguyenVu.ex_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class CreateCard {
    public List<Card> getCards() {
        return createCards(52, 13);
    }

    private List<Card> createCards(int n, int m) {
        Random random = new Random();
        HashSet<String> check = new HashSet<>();
        Suit[] suits = {Suit.SPADES, Suit.CLUB, Suit.DIAMOND, Suit.HEART};
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (true) {
                int rank = random.nextInt(1, m + 1);
                Suit suit = suits[random.nextInt(0, 4)];
                if (check.add(rank + "," + suit)) {
                    cards.add(new Card(rank, suit));
                    break;
                }
            }
        }
        return cards;
    }
}
