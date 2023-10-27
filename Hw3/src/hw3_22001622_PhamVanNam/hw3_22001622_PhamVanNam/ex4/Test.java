package hw3_22001622_PhamVanNam.ex4;

import hw3_22001622_PhamVanNam.ex3.SimpleLinkedList;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        SimpleLinkedList<ReadFile.WordCount> list =
                readFile.readFile(
                        "C:\\Users\\Administrator\\IdeaProjects\\DSA\\hw3_22001622_PhamVanNam\\ex4\\testout.txt");
        System.out.println(list);
    }
}
