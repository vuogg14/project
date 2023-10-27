package hw3_22001665_CaoSyNguyenVu.ex4;

import java.util.Scanner;

public class Main {
    public static void solve(WordCount wordCount){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Get data from: ");
            System.out.println("0: Exit");
            System.out.println("1: File");
            System.out.println("2: Keyboard");
            System.out.print("Your choice: ");
            int n = s.nextInt();
            switch (n){
                case 0 : return;
                case 1 : wordCount.readFromFile(); break;
                case 2 : wordCount.readFromKeyboard(); break;
            }
            wordCount.getWordCount();
        }
    }
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        solve(wordCount);
    }
}
