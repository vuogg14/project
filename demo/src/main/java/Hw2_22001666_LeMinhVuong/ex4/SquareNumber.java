package Hw2_22001666_LeMinhVuong.ex4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SquareNumber {
    public static void main(String[] args) {
        Set<Integer> tmp = new HashSet<>();
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
            if(isSquareNumber(array[i])){
                count++;
            }
        }
        if(count == 0){
            System.out.println("NULL");
        } else {
            for(int i : array){
                if(isSquareNumber(i)){
                    tmp.add(i);
                }

            }
        }
        for(Integer i : tmp){
            System.out.print(i + " ");
        }
    }

    public static boolean isSquareNumber(int n){
        int tmp = (int) Math.sqrt(n);
        return tmp * tmp == n;
    }
}
