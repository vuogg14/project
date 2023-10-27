package hw1_19_NgoHaiYen.ex3;

import java.util.Scanner;

public class ComplexNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong so phuc: ");
        int n = sc.nextInt();
        int[] real = new int[n];
        int[] imag = new int[n];
        inputComplex(sc,real,imag);
        System.out.println("In ra so phuc thu 1:");
        printComplexByIndex(0,real,imag);
        System.out.println("Cong so phuc thu 1 va so phuc thu 2: ");
        plus(real,imag,0,1);
        System.out.println("Tru so phuc thu 1 cho so phuc thu 2: ");
        minus(real,imag,0,1);
        System.out.println("Nhan so phuc thu 1 voi so phuc thu 2: ");
        mutiple(real,imag,0,1);
        System.out.println("Chia so phuc thu 1 cho so phuc thu 2: ");
        devide(real,imag,0,1);
    }
    public static void inputComplex(Scanner sc, int[] real, int[] imag){
        for ( int i = 0; i < real.length; i++ ){
            System.out.println("Nhap so phuc thu "+(i+1));
            real[i] = sc.nextInt();
            imag[i] = sc.nextInt();
        }
    }
    public static void printComplexByIndex(int index, int[] real, int[] imag){
        if ( index >= real.length ){
            System.out.println("Invalid index");
        }else {
            if ( imag[index] < 0 ){
                System.out.println(real[index]+" - "+Math.abs(imag[index])+"i");
            } else {
                System.out.println(real[index]+" + "+imag[index]+"i");
            }
        }
    }

    public static void printComplex(int real, int imag){
        if ( imag < 0 ){
            System.out.println(real+" - "+Math.abs(imag)+"i");
        } else {
            System.out.println(real+" + "+imag+"i");
        }
    }

    public static void printComplex(double real, double imag){
        if ( imag < 0 ){
            System.out.println(real+" - "+Math.abs(imag)+"i");
        } else {
            System.out.println(real+" + "+imag+"i");
        }
    }

    public static void plus(int[] real, int[] imag, int id1, int id2 ){
        if ( id1 >= real.length || id2 >= real.length ){
            System.out.println("Invalid index");
        }else {
            int newReal = real[id1] + real[id2];
            int newImag = imag[id1] + imag[id2];
            printComplex(newReal,newImag);
        }
    }

    public static void minus(int[] real, int[] imag, int id1, int id2 ){
        if ( id1 >= real.length || id2 >= real.length ){
            System.out.println("Invalid index");
        }else {
            int newReal = real[id1] - real[id2];
            int newImag = imag[id1] - imag[id2];
            printComplex(newReal,newImag);
        }
    }
    public static void mutiple(int[] real, int[] imag, int id1, int id2 ){
        if ( id1 >= real.length || id2 >= real.length ){
            System.out.println("Invalid index");
        }else {
            int newReal = real[id1]*real[id2] - imag[id1]*imag[id2];
            int newImag = real[id1]*real[id2] + imag[id1]*imag[id2];
            printComplex(newReal,newImag);
        }
    }
    public static void devide(int[] real, int[] imag, int id1, int id2 ){
        if ( id1 >= real.length || id2 >= real.length ){
            System.out.println("Invalid index");
        }else {
            double newReal = (double) Math.round((double) (real[id1]*real[id2] + imag[id1]*imag[id2])/
                    (real[id1]*real[id1]+imag[id2]*imag[id2])*100)/100;
            double newImag = (double) Math.round((double) (real[id1]*real[id2] - imag[id1]*imag[id2])/
                    (real[id1]*real[id1]+imag[id2]*imag[id2])*100)/100;
            printComplex(newReal,newImag);
        }
    }

}
