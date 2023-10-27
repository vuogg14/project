package Hw4_22001666_LeMinhVuong.ex4;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueInterface<Integer> queueInterface = new ArrayQueue<>();
        queueInterface.enqueue(5);
        queueInterface.enqueue(3);
        queueInterface.enqueue(10);

        System.out.println(queueInterface);
        System.out.println(queueInterface.dequeue());
        System.out.println(queueInterface);
        queueInterface.enqueue(20);
        System.out.println(queueInterface);

        System.out.println("============================");
        LinkedListQueue<Integer> queueInterface1 = new LinkedListQueue<>();
        queueInterface1.enqueue(1);
        queueInterface1.enqueue(2);
        System.out.println(queueInterface1);
        System.out.println(queueInterface1.dequeue());
        System.out.println(queueInterface1);
    }
}
