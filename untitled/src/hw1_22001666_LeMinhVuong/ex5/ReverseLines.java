package hw1_22001666_LeMinhVuong.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> lists = new ArrayList<>();
        reverse(in, lists);
    }

    public static void reverse(Scanner in, ArrayList<Character> lists) {
        String line = in.nextLine();
        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            lists.add(c);
        }

        Collections.reverse(lists);

        for (Character reversedLine : lists) {
            System.out.print(reversedLine);
        }
    }
}

