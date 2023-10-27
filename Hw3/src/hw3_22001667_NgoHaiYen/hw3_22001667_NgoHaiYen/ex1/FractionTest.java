package hw3_22001667_NgoHaiYen.ex1;

import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction[] list = input(sc);
        printFactionList(list);
        //Lay phan so o vi tri cho truoc
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.println("List["+index+"] = "+get(list,index));
        //Thuc hien phep tinh voi toan bo phan so
        calculatorWithAllFraction(list,sc);
        //Thuc hien phep tinh voi 2 phan so o vi tri cho truoc
        calculator(list,sc);
    }

    public static Fraction[] input(Scanner sc) {
        System.out.println("Enter number of fraction: ");
        int n = sc.nextInt();
        Fraction[] fractionList = new Fraction[n];
        System.out.println("Enter your fraction: ");
        for (int i = 0; i < n; i++) {
            float numerator = sc.nextFloat();
            float denominator = sc.nextFloat();
            fractionList[i] = checkInput(numerator, denominator);;
        }
        return fractionList;
    }

    public static Fraction checkInput(float numerator, float denominator){
        while (numerator % 1 != 0 || denominator % 1 != 0) {
            numerator*=10;
            denominator*=10;
        }
        return new Fraction(numerator,denominator);
    }

    public static int count(float number){
        return 0;
    }
    public static void printFactionList(Fraction[] fractionsList){
        System.out.println("Fraction list: ");
        for ( int i = 0; i < fractionsList.length; i++ ){
            System.out.println(fractionsList[i]);
        }
    }

    public static Fraction get(Fraction[] list, int index){
        if ( index < 0 || index >= list.length ){
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }

    public static void calculatorWithAllFraction(Fraction[] list, Scanner sc){
        System.out.println("Calculator with all fraction: \n1.Add \n2.Minus \n3.Multiple \n4.Divide \nEnter your choice: ");
        int choice = sc.nextInt();
        Fraction result = new Fraction(0,1);
        switch (choice){
            case 1:
                for (int i = 0; i < list.length; i++ ){
                    result = result.add(list[i]);
                }
                System.out.println("Add all fraction: "+result);
                break;
            case 2:
                for (int i = 0; i < list.length; i++ ){
                    result = result.minus(list[i]);
                }
                System.out.println("Minus all fraction: "+result);
                break;
            case 3:
                result = result.add(new Fraction(1,1));
                for (int i = 0; i < list.length; i++ ){
                    result = result.multi(list[i]);
                }
                System.out.println("Mutiply all fraction: "+result);
                break;
            case 4:
                result = result.add(new Fraction(1,1));
                for (int i = 0; i < list.length; i++ ){
                    result = result.divi(list[i]);
                }
                System.out.println("Divide all fraction: "+result);
                break;
            default:
                System.out.println("Exit program!");
                break;
        }

    }

    public static void calculator(Fraction[] list, Scanner sc ){
        System.out.print("Enter index: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        if ( index1 < 0 || index1 >= list.length || index2 < 0 || index2 >= list.length ){
            throw new IndexOutOfBoundsException();
        }
        System.out.println("Calculator with select fraction: \n1.Add \n2.Minus \n3.Multiple \n4.Divide \nEnter your choice: ");
        int choice = sc.nextInt();
        Fraction result;
        switch (choice){
            case 1:
                result = list[index1].add(list[index2]);
                System.out.println(list[index1] +" + "+list[index2]+" = "+result);
                break;
            case 2:
                result = list[index1].minus(list[index2]);
                System.out.println(list[index1] +" - "+list[index2]+" = "+result);
                break;
            case 3:
                result = list[index1].multi(list[index2]);
                System.out.println(list[index1] +" * "+list[index2]+" = "+result);
                break;
            case 4:
                result = list[index1].divi(list[index2]);
                System.out.println(list[index1] +" / "+list[index2]+" = "+result);
                break;
            default:
                System.out.println("Exit program!");
                break;
        }

    }
}
