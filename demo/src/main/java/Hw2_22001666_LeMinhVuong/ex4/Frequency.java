package Hw2_22001666_LeMinhVuong.ex4;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        frequency(array, n);
    }

    public static void frequency(int[] array, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> lists = new ArrayList<>(map.keySet());
        Collections.sort(lists);

        for(int i : lists){
            System.out.print(i + " " + map.get(i) + "; ");
        }
    }
}
