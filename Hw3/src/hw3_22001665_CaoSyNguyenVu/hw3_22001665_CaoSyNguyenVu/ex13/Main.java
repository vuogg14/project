package hw3_22001665_CaoSyNguyenVu.ex13;

public class Main {
    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial();
        polynomial1.add(2,4);
        polynomial1.add(2,2);
        polynomial1.add(2,1);
        polynomial1.add(2,0);
        System.out.println("Polynomial 1:");
        polynomial1.printPolynomial(polynomial1.getNode());

        Polynomial polynomial2 = new Polynomial();
        polynomial2.add(2,5);
        polynomial2.add(2,3);
        polynomial2.add(2,2);
        System.out.println("Polynomial 2:");
        polynomial2.printPolynomial(polynomial2.getNode());

        System.out.println("Total of 2 polynomials:");
        polynomial1.printPolynomial(polynomial1.addPolynomial(polynomial1.getNode(), polynomial2.getNode()));
    }
}
