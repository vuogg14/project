package Hw3_22001604_DoChiKien.exc13;

public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    //Given polynomials are sorted in decreasing order of power

    public static void testCase() {
        LinkedList poly1 = new LinkedList();
        poly1.add(2, 4);
        poly1.add(3, 3);
        poly1.add(5, 0);
        System.out.println(poly1);

        LinkedList poly2 = new LinkedList();
        poly2.add(1, 4);
        poly2.add(2, 3);
        poly2.add(5, 2);
        poly2.add(2, 1);
        poly2.add(0, 1);
        System.out.println(poly2);

        System.out.println(poly1.addPolynomial(poly1, poly2));
    }
}
