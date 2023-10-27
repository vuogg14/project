package hw3_22001667_NgoHaiYen.ex4;

import hw3_22001667_NgoHaiYen.ex2.SimpleArrayList;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Doc du lieu tu file
        SimpleArrayList<WordCount> list = readAndCount("src/hw3_22001667_NgoHaiYen/ex4/data.txt");
        //Sap xep cac tu theo thu tu ABC
        sortList(list);
        //In ra list cac tu xuat hien trong van ban
        printList(list);
        //Tu duoc su dung nhieu nhat
        System.out.println("The most used word is: "+findMostUsedWord( list));

    }


    public static SimpleArrayList<WordCount> readAndCount(String filename) {
        SimpleArrayList<WordCount> list = new SimpleArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                String s = sc.next().toLowerCase();
                StringBuilder newStr = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 97 && s.charAt(i) <= 121) {
                        newStr.append(s.charAt(i));
                    }
                }
                WordCount current = new WordCount(newStr.toString());
                if (list.isContain(current)) {
                    list.get(list.getIndex(current)).count++;
                } else {
                    list.add(current);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void printList(SimpleArrayList<WordCount> list) {
        System.out.println("All word in the document: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void sortList(SimpleArrayList<WordCount> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    WordCount temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    public static WordCount findMostUsedWord(SimpleArrayList<WordCount> list) {
        int max = list.get(0).count;
        WordCount result = list.get(0);
        for ( WordCount word : list){
            if ( max <= word.count){
                max = word.count;
                result = word;
            }
        }
        return result;
    }
}
