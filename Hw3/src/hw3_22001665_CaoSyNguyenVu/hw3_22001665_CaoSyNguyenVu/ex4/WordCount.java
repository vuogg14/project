package hw3_22001665_CaoSyNguyenVu.ex4;

import hw3_22001665_CaoSyNguyenVu.ex2.SimpleArrayList;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {
    private String phrase;

    private SimpleArrayList<String> list;
    private SimpleArrayList<String> words;
    private SimpleArrayList<Integer> quantity;

    public WordCount() {
        list = new SimpleArrayList<>();
        words = new SimpleArrayList<>();
        quantity = new SimpleArrayList<>();
    }

    public WordCount(String phrase) {
        this.phrase = phrase;
        list = new SimpleArrayList<>();
        words = new SimpleArrayList<>();
        quantity = new SimpleArrayList<>();
    }

    public void readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine();
    }

    public void readFromFile() {
        JFileChooser chooser = new JFileChooser();
        int check = chooser.showDialog(null, "Open");
        if (check == 0) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));
                String line;
                phrase = "";
                while ((line = reader.readLine()) != null) {
                    phrase = phrase + " " + line;
                }
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }

    public void getWordCount() {
        addWords();
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i) + ": " + quantity.get(i));
        }
    }

    private void addWords() {
        phrase = phrase.toLowerCase();
        String[] splitPhrase = phrase.split("[0-9\\W]");
        for (int i = 0; i < splitPhrase.length; i++) {
            if (splitPhrase[i] != "") {
                list.add(splitPhrase[i]);
            }
        }
        sortList(0, list.size() - 1);
        words.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int c = 1;
            while (list.get(i).compareTo(list.get(i - 1)) == 0) {
                c++;
                i++;
                if (i == list.size()) {
                    quantity.add(c);
                    return;
                }
            }
            quantity.add(c);
            words.add(list.get(i));
        }
        if (quantity.size() < words.size()) {
            quantity.add(1);
        }
    }

    private void sortList(int l, int r) {
        int i = l;
        int j = r;
        int p = (l + r) / 2;
        while (i < j) {
            while (list.get(i).compareTo(list.get(p)) < 0) i++;
            while (list.get(j).compareTo(list.get(p)) > 0) j--;
            if (i <= j) {
                String tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                i++;
                j--;
            }
        }
        if (i < r) sortList(i, r);
        if (l < j) sortList(l, j);
    }
}
