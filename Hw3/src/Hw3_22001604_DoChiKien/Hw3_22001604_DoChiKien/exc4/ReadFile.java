package Hw3_22001604_DoChiKien.exc4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public SimpleLinkedList<WordCount> readFile(String fileName) throws Exception {
        SimpleLinkedList<WordCount> list = new SimpleLinkedList<>();
        String data = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] words = data.split(" ");
        for (String word : words) {
            WordCount wordCount = new WordCount(word, 1);
            if (list.isContain(wordCount)) {
                WordCount temp = list.get(list.indexOf(wordCount));
                temp.setCount(temp.getCount() + 1);
            } else {
                list.addBot(wordCount);
            }
        }
        return list;
    }
}
