package Hw4_22001666_LeMinhVuong.ex2;

public class TestMain {
    public static void main(String[] args) {
        StackInterface<Integer> linklist = new LinkedListStack<>();
        linklist.push(1);
        linklist.push(2);
        linklist.push(5);
        System.out.println(linklist);

        System.out.println(linklist.pop());
        System.out.println(linklist);

        System.out.println(linklist.top());
        System.out.println(linklist);

        System.out.println("==================Test ArrayListStack===================");
        StackInterface<Integer> arrayList =  new ArrayListStack<>();
        arrayList.push(1);
        arrayList.push(2);
        arrayList.push(3);
        arrayList.push(2);
        System.out.println(arrayList);
        System.out.println(arrayList.pop());
        System.out.println(arrayList);
        System.out.println(arrayList.top());
        System.out.println(arrayList);
    }
}
