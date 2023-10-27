package hw1_22001666_LeMinhVuong.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kiểu boolean : ");
        boolean a = in.nextBoolean();
        System.out.println(a);

        System.out.println("kiểu char: ");
        char b = in.next().charAt(0);
        System.out.println(b);

        System.out.println("kiểu String: ");
        String str = in.next();
        System.out.println(str);

        System.out.println("kiểu byte: ");
        Byte c = in.nextByte();
        System.out.println(c);

        System.out.println("kiểu short: ");
        short d = in.nextShort();
        System.out.println(d);

        System.out.println("kiểu integer: ");
        int e = in.nextInt();
        System.out.println(e);

        System.out.println("kiểu long: ");
        long l = in.nextLong();
        System.out.println(l);

        System.out.println("kiểu float: ");
        float f = in.nextFloat();
        System.out.println(f);

        System.out.println("kiểu double: ");
        double g = in.nextDouble();
        System.out.println(g);
    }
}
