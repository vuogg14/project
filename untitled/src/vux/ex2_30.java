package vux;

import java.util.Arrays;

public class ex2_30 {
    public static int[] outPutArray(String myString) {
        int[] array = new int[26];
        myString = myString.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < myString.length(); i++) {
            array[(int) myString.charAt(i) - 97]++;
        }
        return array;
    }

    public static double percent(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        String string = "Abeghzy";
        System.out.println(Arrays.toString(outPutArray(string)));
        new MyFrame();
    }
}
