package Hw3_22001604_DoChiKien.exc4;

public class WordCount {
    private String word;
    private int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof WordCount) {
            return this.word.equals(((WordCount) o).word);
        }
        return false;
    }

    @Override
    public String toString() {
        return word + ": " + count;
    }
}
