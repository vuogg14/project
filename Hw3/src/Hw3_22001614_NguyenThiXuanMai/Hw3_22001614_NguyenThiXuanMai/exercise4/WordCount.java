package Hw3_22001614_NguyenThiXuanMai.exercise4;

import Hw3_22001614_NguyenThiXuanMai.exercise3.SimpleLinkedList;

import java.io.File;
import java.util.Scanner;

public class WordCount {
    private String word;
    private int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WordCount)) return false;
        WordCount wc = (WordCount) o;
        return wc.word.equalsIgnoreCase(word);
    }

    @Override
    public String toString() {
        return "WordCount{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("Hw3_22001614_NguyenThiXuanMai/exercise4/docs.txt"));
            String text = "";
            while (scanner.hasNext()) {
                text += scanner.nextLine();
            }
            String[] words = text.split("[\\s\\p{Punct}]+");

            SimpleLinkedList<WordCount> list = new SimpleLinkedList<>();

            for (int i = 0; i < words.length; i++) {
                WordCount tmp= new WordCount(words[i], 1);
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equals(tmp)) {
                        list.get(j).count++;
                        tmp.count++;
                        break;
                    }
                }
                if (tmp.count == 1) {
                    list.add(tmp);
                }
            }
            list.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}