package ex9;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Ex9 ex9 = new Ex9();
            System.out.println("nhập size của mảng: ");
            int n = sc.nextInt();
            int count = 0;
            System.out.println("nhập phần tử của mảng: ");
            while (count < n) {
                ex9.add(sc.nextInt());
                count++;
            }
            ex9.print();
            System.out.println("nhập số mà bạn muốn tìm: ");
            int key = sc.nextInt();
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                if(ex9.get(i) == key){
                    count1++;
                }
            }
            System.out.println("số lần xuất hiện của số đó trong linked list là: " + count1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
