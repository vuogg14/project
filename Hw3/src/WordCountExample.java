import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WordCount {
    private String word;
    private int count;

    public WordCount(String word) {
        this.word = word;
        this.count = 1;
    }

    public void incrementCount() {
        this.count++;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCount wordCount = (WordCount) o;
        return word.equals(wordCount.word);
    }
}

public class WordCountExample {
    public static void main(String[] args) {
        List<WordCount> wordCounts = new ArrayList<>(); // or use LinkedList if needed

        // Read the text from a file (replace "input.txt" with your file path)
        try (BufferedReader br = new BufferedReader(new FileReader("src/text"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split words by whitespace
                for (String word : words) {
                    // Check if the word is already in the list of WordCounts
                    WordCount existingWord = new WordCount(word);
                    int index = wordCounts.indexOf(existingWord);
                    if (index >= 0) {
                        // If it exists, increment the count
                        wordCounts.get(index).incrementCount();
                    } else {
                        // If it doesn't exist, add it to the list
                        wordCounts.add(existingWord);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the word counts
        for (WordCount wordCount : wordCounts) {
            System.out.println(wordCount.getWord() + ": " + wordCount.getCount());
        }
    }
}

