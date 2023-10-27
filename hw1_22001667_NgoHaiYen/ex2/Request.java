package hw1_19_NgoHaiYen.ex2;

public class Request<T> {

    public static <T> T getFirstElement(T[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return arr[0];
    }

    public static <T> T getLastElement(T[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return arr[arr.length - 1];
    }
    public static<T> void printArray(T[] arr){
        for ( int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
