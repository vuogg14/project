package hw2_22001665_CaoSyNguyenVu.ex_3;

public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getFile() {
        return String.valueOf(rank) + suit + ".png";
    }

    @Override
    public String toString() {
        return switch (rank) {
            case 1 -> "[A " + suit + "]";
            case 11 -> "[J " + suit + "]";
            case 12 -> "[Q " + suit + "]";
            case 13 -> "[K " + suit + "]";
            default -> "[" + rank + " " + suit + "]";
        };
    }
}
