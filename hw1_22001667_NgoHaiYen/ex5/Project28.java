package hw1_19_NgoHaiYen.ex5;

import java.util.Random;

public class Project28 {
    public static void main(String[] args) {
        writeOut(100);
    }
    public static void writeOut(int n){
        String s = "I will never spam my friend";
        Random random = new Random();
        for ( int i = 1; i <= n; i++ ) {
            StringBuilder s2 = new StringBuilder();
            s2.append(i).append(".");
            for ( int j = 0; j < s.length(); j++){
                char current = s.charAt(j);
                if (random.nextDouble() < 0.01){
                    char typo = (char) (random.nextInt(26) + 'a');  //random char
                    s2.append(typo);
                } else {
                    s2.append(current);
                }
            }
            System.out.println(s2);
        }
    }
}
