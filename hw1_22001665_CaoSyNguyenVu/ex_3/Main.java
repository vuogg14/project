package hw1_22001665_CaoSyNguyenVu.ex_3;

import java.util.Scanner;

public class Main {
    public static Complex createComplex(Scanner s){
        System.out.print("Enter real part: ");
        double real = s.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imag = s.nextDouble();

        return new Complex(real,imag);
    }

    public static Complex addTwoComplex(Complex complex1, Complex complex2){
        return complex1.plus(complex2);
    }

    public static Complex timesTwoComplex(Complex complex1, Complex complex2){
        return complex1.times(complex2);
    }

    public static Complex addMultipleComplex(Complex[] complexes){
        Complex tmp = new Complex(0,0);
        for(int i=0; i<complexes.length; i++){
            tmp = tmp.plus(complexes[i]);
        }
        return tmp;
    }

    public static Complex multiplyMultipleComplex(Complex[] complexes){
        Complex tmp = new Complex(1,0);
        for(int i=0; i<complexes.length; i++){
            tmp = tmp.times(complexes[i]);
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("add and multiply between 2 complex numbers");
        System.out.println("Enter the first complex number: ");
        Complex complex1 = createComplex(s);
        System.out.println("Enter the second complex number: ");
        Complex complex2 = createComplex(s);

        System.out.println(complex1+"+"+complex2+"="+addTwoComplex(complex1,complex2).toString());
        System.out.println("("+complex1+")*("+complex2+")="+timesTwoComplex(complex1,complex2).toString());
        System.out.println("\n------------------------------------------------");

        System.out.print("Number of complex numbers: ");
        int n = s.nextInt();
        Complex[] complexes = new Complex[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the complex number "+(i+1)+": ");
            complexes[i] = createComplex(s);
        }
        System.out.println("total of all complex numbers: "+addMultipleComplex(complexes).toString());
        System.out.println("product of all complex numbers: "+multiplyMultipleComplex(complexes).toString());
    }
}
