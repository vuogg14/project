package hw1_22001604_DoChiKien.exc1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printDataType(scanner);
    }

    public static void printDataType(Scanner scanner) {
        System.out.print("Enter a byte value: ");
        byte byteVal = scanner.nextByte();
        System.out.println(byteVal);
        System.out.print("Enter a short datatype value: ");
        short shortVal = scanner.nextShort();
        System.out.println(shortVal);
        System.out.print("Enter an integer value: ");
        int intVal = scanner.nextInt();
        System.out.println(intVal);
        System.out.print("Enter an long datatype value: ");
        long longVal = scanner.nextLong();
        System.out.println(longVal);
        System.out.print("Enter a boolean value: ");
        boolean boolVal = scanner.nextBoolean();
        System.out.println(boolVal);
        System.out.print("Enter an float value: ");
        float floatVal = scanner.nextFloat();
        System.out.println(floatVal);
        System.out.print("Enter a double value: ");
        double doubleVal = scanner.nextDouble();
        System.out.println(doubleVal);
        System.out.print("Enter an char datatype value: ");
        char charVal = scanner.next().charAt(0);
        System.out.println(charVal);
        System.out.print("Enter an String value: ");
        String stringVal = scanner.next();
        System.out.println(stringVal);
    }
}
