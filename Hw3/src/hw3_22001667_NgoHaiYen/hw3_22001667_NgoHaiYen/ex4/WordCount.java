package hw3_22001667_NgoHaiYen.ex4;

public class WordCount implements Comparable<WordCount> {
    String word;
    int count;

    public WordCount(String word) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof WordCount ){
            return word.equals(((WordCount) obj).word);
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" +
                "word='" + word + '\'' +
                ", count=" + count +
                ']';
    }

    @Override
    public int compareTo(WordCount o) {
        return this.word.compareTo(o.word) ;
    }
}
