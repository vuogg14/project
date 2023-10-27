package Hw2_22001666_LeMinhVuong.ex2;


public class Sort {
    public static void bubbleSortArray(MyObject[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    MyObject tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void selectionSortArray(MyObject[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            MyObject temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSortArray(MyObject[] array) {
        for (int i = 1; i < array.length; ++i) {
            MyObject key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void merge(MyObject[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        MyObject[] leftArray = new MyObject[n1];
        MyObject[] rightArray = new MyObject[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) < 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSortArray(MyObject[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortArray(array, left, mid);
            mergeSortArray(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void quickSort(MyObject[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(MyObject[] arr, int low, int high) {
        MyObject pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                MyObject temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        MyObject temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    public static void main(String[] args) {
        MyObject[] arrayString = {new MyObject("Cix"), new MyObject("Box"), new MyObject("Alice"), new MyObject("Fake")};
        bubbleSortArray(arrayString);
        mergeSortArray(arrayString, 0, arrayString.length - 1);
        selectionSortArray(arrayString);
        insertionSortArray(arrayString);
        quickSort(arrayString, 0, arrayString.length -1);

        for (MyObject i : arrayString) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        MyObject[] arrayInteger = {new MyObject(2), new MyObject(1), new MyObject(10), new MyObject(5), new MyObject(20)};
        bubbleSortArray(arrayInteger);
        for (MyObject i : arrayInteger) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        MyObject[] arrayCharacter = {new MyObject('a'), new MyObject('A'), new MyObject('z'), new MyObject('d')};
        bubbleSortArray(arrayCharacter);
        for (MyObject i : arrayCharacter) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        MyObject[] arrayDouble = {new MyObject(1.2), new MyObject(0.6), new MyObject(3.6), new MyObject(0.1)};
        bubbleSortArray(arrayDouble);
        for (MyObject i : arrayDouble) {
            System.out.print(i + " ");
        }
    }
}

