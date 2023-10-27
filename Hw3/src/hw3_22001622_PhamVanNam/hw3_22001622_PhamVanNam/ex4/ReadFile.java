package hw3_22001622_PhamVanNam.ex4;


import hw3_22001622_PhamVanNam.ex3.SimpleLinkedList;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    static class WordCount {
        private int count;
        private final String word;

        public WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public String getWord() {
            return word;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof WordCount other) {
                return this.word.equals(other.getWord());
            }
            return false;
        }

        @Override
        public String toString() {
            return word + ":" + count;
        }
    }
    public SimpleLinkedList<WordCount> readFile(String fileName) throws IOException {
        SimpleLinkedList<WordCount> list = new SimpleLinkedList<>();
        try (FileReader in = new FileReader(fileName)) {
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = in.read()) != -1) {
                char ch = (char) c;
                sb.append(ch);
            }
            String text = sb.toString();
            String[] words = text.split("\\W+");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                WordCount wordCount = new WordCount(word, 1);
                if (list.isContain(wordCount)) {
                    int index = list.indexOf(wordCount);
                    WordCount oldWc = list.get(index);
                    oldWc.setCount(oldWc.getCount() + 1);
                } else {
                    list.addBot(wordCount);
                }
            }
        }
        return list;
    }
}
