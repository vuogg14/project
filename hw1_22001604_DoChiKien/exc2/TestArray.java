package hw1_22001604_DoChiKien.exc2;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) throws Exception {
        testStringArray();
        testCharArray();
        testBooleanArray();
    }

    public static void testStringArray() throws Exception {
        String[] testString = {"abc", "haha", "dch"};
        ArrayGeneric<String> stringArrayGeneric = new ArrayGeneric<>(testString);
        System.out.println(Arrays.toString(stringArrayGeneric.getArray()));
        System.out.println(stringArrayGeneric.getElemnt(2));
        System.out.println(stringArrayGeneric.size());
        System.out.println();
    }

    public static void testCharArray() throws Exception {
        Character[] testChar = {'a', 'b', 'c'};
        ArrayGeneric<Character> charArrayGeneric = new ArrayGeneric<>(testChar);
        System.out.println(Arrays.toString(charArrayGeneric.getArray()));
        System.out.println(charArrayGeneric.getElemnt(2));
        System.out.println(charArrayGeneric.size());
        System.out.println();
    }

    public static void testBooleanArray() throws Exception {
        Boolean[] testBoolean = {true,false,true,true};
        ArrayGeneric<Boolean> charBooleanGeneric = new ArrayGeneric<>(testBoolean);
        System.out.println(Arrays.toString(charBooleanGeneric.getArray()));
        System.out.println(charBooleanGeneric.getElemnt(2));
        System.out.println(charBooleanGeneric.size());
    }
}
