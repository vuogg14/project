package hw3_22001667_NgoHaiYen.ex13;

import java.util.Scanner;

public class AddPolynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first poly: ");
        SimpleLinkedList poly1 = inputData(sc);
        printPoly(poly1);
        System.out.println("Enter the second poly: ");
        SimpleLinkedList poly2 = inputData(sc);
        printPoly(poly2);
        SimpleLinkedList poly = addPoly(poly1,poly2);
        System.out.println("Add 2 poly: ");
        printPoly(poly);


    }
    public static SimpleLinkedList inputData(Scanner sc){
        System.out.print("Enter degree: ");
        int degree = sc.nextInt();
        SimpleLinkedList list = new SimpleLinkedList();
        System.out.print("Enter the number from high to low degree: ");
        for ( int i = 0; i < degree+1; i++ ){
            list.add(sc.nextInt());
        }
        return list;
    }
    public static SimpleLinkedList addPoly(SimpleLinkedList poly1, SimpleLinkedList poly2){
        if ( poly1.size() == 0 ){
            return poly2;
        } else if (poly2.size() == 0) {
            return poly1;
        } else {
            SimpleLinkedList result = new SimpleLinkedList();
            SimpleLinkedList.Node current1 = poly1.head;
            SimpleLinkedList.Node current2 = poly2.head;
            if ( poly1.size() <= poly2.size()){
                while (current1.next!= null){
                    result.addBot(current1.data+current2.data);
                    current1 = current1.next;
                    current2 = current2.next;
                }
                result.addBot(current1.data+current2.data);
                current2 = current2.next;
                while (current2.next!=null){
                    result.addBot(current2.data);
                    current2 = current2.next;
                }
                result.addBot(current2.data);
            } else if ( poly2.size() <= poly1.size()){
                while (current2.next!= null){
                    result.addBot(current1.data+current2.data);
                    current1 = current1.next;
                    current2 = current2.next;
                }
                result.addBot(current1.data+current2.data);
                current1 = current1.next;
                while (current1.next!=null){
                    result.addBot(current1.data);
                    current1 = current1.next;
                }
                result.addBot(current1.data);

            }
            return result;
        }
    }
    public static void printPoly(SimpleLinkedList list){
        for ( int i = list.size()-1; i > 0; i-- ){
            System.out.print(list.get(i)+"x^"+i+" + ");
        }
        System.out.print(list.get(0));
        System.out.println();
    }
}
